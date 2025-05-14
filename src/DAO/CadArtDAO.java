
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Model.CadArt;

public class CadArtDAO {
    
    private final Connection conn;

    public CadArtDAO(Connection conn) {
        this.conn = conn;
    }
    
    public void inserir(CadArt cadArt) throws SQLException {
        String sql = "INSERT INTO artista (nome_artista, banda) VALUES (?, ?)";
        
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, cadArt.getNome());
            statement.setString(2, cadArt.getBanda());
            statement.execute();

        }
    }  
    
}
