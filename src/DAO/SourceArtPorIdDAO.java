
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class SourceArtPorIdDAO {
    
    private Connection conn;

    public SourceArtPorIdDAO(Connection conn) {
        this.conn = conn;
    }
    
    public int buscarIdArtistaPorNome(String nomeArtista) throws SQLException {
        String sql = "SELECT a.id\n" +
                     "FROM artista a\n" +
                     "JOIN pessoa p ON a.id_pessoa = p.id\n" +
                     "WHERE p.nome = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nomeArtista);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt("id");
            } else {
                return -1;
            }
        }
    }
}
