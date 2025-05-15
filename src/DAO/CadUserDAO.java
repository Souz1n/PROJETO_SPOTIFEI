package DAO;

import Model.Caduser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CadUserDAO {
    
    private Connection conn;

    public CadUserDAO(Connection conn) {
        this.conn = conn;
    }

    public void inserir(Caduser usuario) throws SQLException {
        String sql = "INSERT INTO \"Usuário\" (nome, email, idade) VALUES (?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, usuario.getNome());
        stmt.setString(2, usuario.getEmail());
        stmt.setInt(3, usuario.getIdade());
        stmt.execute();
        conn.close();
    }
}
