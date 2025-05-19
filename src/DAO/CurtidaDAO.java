package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CurtidaDAO {
    private final Connection conn;

    public CurtidaDAO(Connection conn) {
        this.conn = conn;
    }

    public void registrarCurtida(String nomeUser, String nomeMusica, boolean status) throws SQLException {
        String sql = "INSERT INTO curtidas (nome_user, nome_musica, status) " +
                     "VALUES (?, ?, ?) ON CONFLICT (nome_user, nome_musica) " +
                     "DO UPDATE SET status = EXCLUDED.status";

        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, nomeUser);
        stmt.setString(2, nomeMusica);
        stmt.setBoolean(3, status);
        stmt.executeUpdate();
        stmt.close();
    }
}

