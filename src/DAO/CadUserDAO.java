package DAO;

import Model.CadUser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class CadUserDAO {
    
    private Connection conn;

    public CadUserDAO(Connection conn) {
        this.conn = conn;
    }
    
    public void inserirUsuario(CadUser usuario) throws SQLException {
        String sql = "INSERT INTO usuario (senha, id_pessoa) VALUES (?,?)";
        
        try(PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1, usuario.getSenha());
            stmt.setInt(2, usuario.getId_pessoa());
            stmt.executeUpdate();
        }
    }
    
    public void inserirPessoa(CadUser usuario) throws SQLException {
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
