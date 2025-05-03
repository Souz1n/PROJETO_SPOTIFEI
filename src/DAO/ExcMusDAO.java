package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Model.ExcMus;

public class ExcMusDAO {
    private final Connection conn;

    public ExcMusDAO(Connection conn) {
        this.conn = conn;
    }

    public void remover(ExcMus musica) throws SQLException {
        try (conn) {
            String sql = "DELETE FROM musica WHERE id = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, musica.getId());
            statement.execute(); 
        }
    }
}
