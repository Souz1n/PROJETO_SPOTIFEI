
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Model.SessaoUsuario;

public class LoginUserDAO {
    
    
    private final Connection conn;

    public LoginUserDAO(Connection conn) {
        this.conn = conn;
    }    
    
public SessaoUsuario verificarUsuario(String nome, String senha) {
    String sql = "SELECT u.id AS id_usuario, p.nome AS nome_usuario " +
                 "FROM pessoa p " +
                 "JOIN usuario u ON p.id = u.id_pessoa " +
                 "WHERE p.nome = ? AND u.senha = ?";

    try (PreparedStatement stmt = conn.prepareStatement(sql)) {
        stmt.setString(1, nome);
        stmt.setString(2, senha);

        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            SessaoUsuario sessao = new SessaoUsuario();
            sessao.setId_usuario(rs.getInt("id_usuario"));
            SessaoUsuario.setNome_user(rs.getString("nome_usuario")); // campo static

            return sessao;
        } else {
            return null;
        }
    } catch (SQLException e) {
        System.out.println("Erro ao verificar usuário: " + e.getMessage());
        return null;
    }
}
}
