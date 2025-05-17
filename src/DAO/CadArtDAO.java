
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Model.CadArt;
import java.sql.ResultSet;

public class CadArtDAO {
    
    private final Connection conn;

    public CadArtDAO(Connection conn) {
        this.conn = conn;
    }
    
    public void inserirArtista(CadArt cadArt) throws SQLException {
        String sql = "INSERT INTO artista (banda, id_pessoa) VALUES (?, ?)";
        
        try (PreparedStatement stm = conn.prepareStatement(sql)) {
            stm.setString(1, cadArt.getBanda());
            stm.setInt(2, cadArt.getId_pessoa());
            stm.executeUpdate();

        }

    }
    
   public void inserirPessoa(CadArt usuario) throws SQLException {
        String sql = "INSERT INTO pessoa (nome, email) VALUES (?, ?) "
                + "RETURNING id";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getEmail());

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                int idPessoa = rs.getInt("id");
                usuario.setId_pessoa(idPessoa); 
            }

            rs.close();
            stmt.close();
        }
    }
    
}
