
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
        String sql = "SELECT m.nome AS nome_musica, m.ano, m.genero, p.nome "
                   + "AS nomeArtista\n" +
                     "FROM musica m\n" +
                     "JOIN artista a ON m.id_artista = a.id\n" +
                     "JOIN pessoa p ON a.id_pessoa = p.id\n" +
                     "WHERE m.nome = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nome);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                SourMus musica = new SourMus();
                musica.setNome_musica(nome);
                musica.setAno(rs.getInt("ano"));
                musica.setArtista(rs.getString("nome_artista"));
                musica.setGenero(rs.getString("genero"));
                return musica;
            } else {
                return null; 
            }
        } catch (SQLException e) {
            System.out.println("Erro ao consultar musica: " + e.getMessage());
            return null;
        }
    }    
    
}
