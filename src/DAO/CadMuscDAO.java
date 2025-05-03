package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Model.CadMus;

public class CadMuscDAO {
    private final Connection conn;

    public CadMuscDAO(Connection conn) {
        this.conn = conn;
    }

    public void inserir(CadMus cadMus) throws SQLException {
        try (conn) {
            String sql = "INSERT INTO musica (nome, artista, id, ano) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, cadMus.getNome());
            statement.setString(2, cadMus.getArtista());
            statement.setInt(3, cadMus.getId());
            statement.setInt(4, cadMus.getAno());
            statement.execute();
        }
    }
}



