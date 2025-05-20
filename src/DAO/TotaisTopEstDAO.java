
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class TotaisTopEstDAO {
    
    private Connection conn;

    public TotaisTopEstDAO(Connection conn) {
        this.conn = conn;
    }    
    
public int totalUser() {
    String sql = "SELECT COUNT(id) AS totalUsuario FROM usuario";

    try (PreparedStatement stmt = conn.prepareStatement(sql);
         ResultSet rs = stmt.executeQuery()) {

        if (rs.next()) {
            return rs.getInt("totalUsuario");
        }

    } catch (SQLException e) {
        System.out.println("Erro ao consultar total: " + e.getMessage());
        return -1;
    }

    return 0;
}

public int totalMus() {
    String sql = "SELECT COUNT(id) AS totalMusicas FROM musica";

    try (PreparedStatement stmt = conn.prepareStatement(sql);
         ResultSet rs = stmt.executeQuery()) {

        if (rs.next()) {
            return rs.getInt("totalMusicas");
        }

    } catch (SQLException e) {
        System.out.println("Erro ao consultar total: " + e.getMessage());
        return -1;
    }

    return 0;
}
    
}
