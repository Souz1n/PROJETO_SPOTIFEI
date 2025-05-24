package DAO;

import Model.ConsUser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsUserDAO {
    
    private Connection conn;

    public ConsUserDAO(Connection conn) {
        this.conn = conn;
    }

    public ConsUser consultarUsuario(String nome) {
        String sql = "SELECT p.email, u.senha " +
                     "FROM pessoa p " +
                     "JOIN usuario u ON p.id = u.id_pessoa " +
                     "WHERE p.nome = ? ";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nome);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                ConsUser usuario = new ConsUser();
                usuario.setNome(nome);
                usuario.setEmail(rs.getString("email"));
                usuario.setSenha(rs.getString("senha"));
                return usuario;
            } else {
                return null; // Não encontrou
            }
        } catch (SQLException e) {
            System.out.println("Erro ao consultar usuário: " + e.getMessage());
            return null;
        }
    }
}