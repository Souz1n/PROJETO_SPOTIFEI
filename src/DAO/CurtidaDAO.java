package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 * Classe DAO responsável pelas operações relacionadas às curtidas no banco de dados.
 */
public class CurtidaDAO {
    /** Conexão ativa com o banco de dados */
    private final Connection conn;

    /**
     * Construtor que recebe a conexão com o banco de dados.
     * 
     * @param conn Conexão estabelecida com o banco.
     */
    public CurtidaDAO(Connection conn) {
        this.conn = conn;
    }

    /**
     * Registra uma curtida para uma música por um usuário.
     * Caso já exista um registro, atualiza o status da curtida.
     * 
     * @param idMusica ID da música.
     * @param idUsuario ID do usuário.
     * @param status Status da curtida (true para curtido, false para não curtido).
     * @throws SQLException Caso ocorra erro no banco de dados.
     */
    public void registrarCurtida(int idMusica, int idUsuario, boolean status) throws SQLException {
        String sql = "INSERT INTO curtidas (id_musica, id_usuario, status) " +
                     "VALUES (?, ?, ?) " +
                     "ON CONFLICT (id_musica, id_usuario) " +
                     "DO UPDATE SET status = EXCLUDED.status";

        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, idMusica);
        stmt.setInt(2, idUsuario);
        stmt.setBoolean(3, status);
        stmt.executeUpdate();
        stmt.close();
    }

    /**
     * Busca o ID do usuário no banco de dados a partir do nome do usuário.
     * 
     * @param nomeUsuario Nome do usuário.
     * @return ID do usuário correspondente ao nome.
     * @throws SQLException Se o usuário não for encontrado ou ocorrer erro no banco.
     */
    public int buscarIdUsuarioPorNome(String nomeUsuario) throws SQLException {
        String sql = "SELECT u.id " +
                     "FROM usuario u " +
                     "JOIN pessoa p ON u.id_pessoa = p.id " +
                     "WHERE p.nome = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nomeUsuario);
            var rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt("id");
            } else {
                throw new SQLException("Usuário não encontrado: " + nomeUsuario);
            }
        }
    }

    /**
     * Busca o ID da música no banco de dados pelo nome da música.
     * A busca é feita ignorando diferenças entre maiúsculas e minúsculas e espaços extras.
     * 
     * @param nome Nome da música.
     * @return ID da música, ou -1 se não encontrada.
     */
    public int buscarIdMusicaPorNome(String nome) {
        String sql = "SELECT id FROM musica WHERE LOWER(nome_musica) = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nome.toLowerCase().trim());
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt("id");
            } else {
                return -1;
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar ID da música: " + e.getMessage());
            return -1;
        }
    }

    /**
     * Verifica se um usuário já curtiu uma música específica.
     * 
     * @param idMusica ID da música.
     * @param idUsuario ID do usuário.
     * @return true se o usuário já curtiu a música, false caso contrário.
     * @throws SQLException Caso ocorra erro no banco de dados.
     */
    public boolean usuarioJaCurtiu(int idMusica, int idUsuario) throws SQLException {
        String sql = "SELECT status FROM curtidas WHERE id_musica = ? AND id_usuario = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idMusica);
            stmt.setInt(2, idUsuario);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getBoolean("status");
            } else {
                return false;
            }
        }
    }
}
