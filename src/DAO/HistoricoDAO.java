package DAO;

import Model.Historico;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HistoricoDAO {
    private final Connection conn;

    public HistoricoDAO(Connection conn) {
        this.conn = conn;
    }
 
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