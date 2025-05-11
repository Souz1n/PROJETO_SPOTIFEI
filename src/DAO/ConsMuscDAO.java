package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsMuscDAO {
    
    private Connection conn;

    public ConsMuscDAO(Connection conn) {
        this.conn = conn;
    }

    public int consultarIdMusica(String nome, String artista) {
        String sql = "SELECT id_musica FROM musica WHERE nome = ? AND artista ="
                + " ?";
        
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setString(2, artista);

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt("id_musica");
            } else {
                return -1; 
            }
        } catch (SQLException e) {
            System.out.println("Erro ao consultar música: " + e.getMessage());
            return -1;
        }
    }
}
