
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginUserDAO {
    
    
    private final Connection conn;

    public LoginUserDAO(Connection conn) {
        this.conn = conn;
    }    
    
    public boolean verificarUsuario(String nome, String senha) {
        String sql = "SELECT * " +
                     "FROM pessoa p " +
                     "JOIN usuario u ON p.id = u.id_pessoa " +
                     "WHERE p.nome = ? AND u.senha = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setString(2, senha);

            ResultSet rs = stmt.executeQuery();
            return rs.next(); 
        } catch (SQLException e) {
            System.out.println("Usuário não encontrado " + e.getMessage());
            return false;
        }
    }
}
