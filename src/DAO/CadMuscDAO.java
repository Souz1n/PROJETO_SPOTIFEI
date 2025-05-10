package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import Model.CadMus;

public class CadMuscDAO {
    private final Connection conn;

    public CadMuscDAO(Connection conn) {
        this.conn = conn;
    }

    public void inserir(CadMus cadMus) throws SQLException {
        String sql = "INSERT INTO musica (nome, ano, artista) VALUES (?, ?, ?)";
        
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, cadMus.getNome());
            statement.setInt(2, Integer.parseInt(cadMus.getAno()));
            statement.setString(3, cadMus.getArtista());
            statement.execute();

        }
    }
}
