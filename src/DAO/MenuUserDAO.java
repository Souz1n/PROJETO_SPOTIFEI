
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Model.SourMus;

public class MenuUserDAO {
    
    private final Connection conn;

    public MenuUserDAO(Connection conn) {
        this.conn = conn;
    }    
    
public SourMus consultarMus(String nome) {
    String sql = "SELECT nome, ano, artista FROM musica WHERE nome = ?";

    try (PreparedStatement stmt = conn.prepareStatement(sql)) {
        stmt.setString(1, nome);

        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            SourMus musica = new SourMus();
            musica.setNome_musica(nome);
            musica.setAno(rs.getInt("ano"));
            musica.setArtista(rs.getString("artista"));
            musica.setGenero("Gênero não disponível"); // ou setar como null/vazio
            return musica;
        } else {
            return null;
        }
    } catch (SQLException e) {
        System.out.println("Erro ao consultar música: " + e.getMessage());
        return null;
        }
    }
}
