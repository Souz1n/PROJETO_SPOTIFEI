package DAO;

import Model.Historico;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe DAO responsável pelo gerenciamento das operações relacionadas
 * ao histórico de músicas no banco de dados.
 */
public class HistoricoDAO {
    /** Conexão ativa com o banco de dados */
    private final Connection conn;

    /**
     * Construtor que recebe a conexão com o banco de dados.
     * 
     * @param conn conexão ativa com o banco.
     */
    public HistoricoDAO(Connection conn) {
        this.conn = conn;
    }

    /**
     * Insere um registro no histórico de um usuário.
     * 
     * @param nome_musica nome da música que será inserida no histórico.
     * @param id_usuario  id do usuário relacionado ao histórico.
     * @param tipo        tipo de ação registrada (ex: "curtida", "reprodução", etc).
     * @throws SQLException se ocorrer erro ao executar a inserção no banco.
     */
    public void inserirHistorico(String nome_musica, int id_usuario, String tipo) 
            throws SQLException {
        String sql = "INSERT INTO historico (nome_musica, id_usuario, tipo) "
                + "VALUES (?, ?, ?)";
        
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, nome_musica);
            statement.setInt(2, id_usuario);
            statement.setString(3, tipo);
            statement.executeUpdate();
        }
    }
    
    /**
     * Verifica se o usuário já curtiu uma música específica.
     * 
     * @param idUsuario  id do usuário.
     * @param nomeMusica nome da música.
     * @return true se já existe curtida, false caso contrário.
     * @throws SQLException se ocorrer erro ao executar a consulta no banco.
     */
    public boolean existeCurtida(int idUsuario, String nomeMusica) 
            throws SQLException {
        String sql = "SELECT COUNT(*) "
                   + "FROM curtidas c "
                   + "JOIN musica m ON c.id_musica = m.id "
                   + "WHERE c.id_usuario = ? AND m.nome_musica = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idUsuario);
            stmt.setString(2, nomeMusica);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1) > 0;
                }
            }
        }
        return false;
    }

    /**
     * Carrega o histórico de músicas de um usuário filtrado pelo tipo.
     * 
     * @param id_user id do usuário.
     * @param tipo    tipo de registro (ex: "curtida", "reprodução").
     * @return lista de objetos Historico contendo os nomes das músicas.
     * @throws SQLException se ocorrer erro ao executar a consulta no banco.
     */
    public List<Historico> carregarHistorico(int id_user, String tipo) 
            throws SQLException {
        String sql = "SELECT nome_musica "
                   + "FROM historico "
                   + "WHERE id_usuario = ? AND tipo = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id_user);
            stmt.setString(2, tipo);

            try (ResultSet rs = stmt.executeQuery()) {
                final List<Historico> lista = new ArrayList<>();

                while (rs.next()) {
                    Historico h = new Historico();
                    h.setNome(rs.getString("nome_musica"));
                    lista.add(h);
                }

                return lista;
            }
        }
    }

}
