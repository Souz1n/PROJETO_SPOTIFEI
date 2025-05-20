package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class CurtidaDAO {
    private final Connection conn;

    public CurtidaDAO(Connection conn) {
        this.conn = conn;
    }

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

