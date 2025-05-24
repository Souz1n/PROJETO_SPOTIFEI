package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TotaisTopEstDAO {
    
    private final Connection conn;

    public TotaisTopEstDAO(Connection conn) {
        this.conn = conn;
    }    
    
    /**
     * Retorna o total de usuários cadastrados na tabela usuario.
     * 
     * @return total de usuários ou -1 em caso de erro
     */
    public int TotalUsuarios() {
        String sql = "SELECT COUNT(id) AS totalUsuario FROM usuario";

        try (PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            if (rs.next()) {
                return rs.getInt("totalUsuario");
            }

        } catch (SQLException e) {
            System.out.println("Erro ao consultar total de usuários: " + e.getMessage());
            return -1;
        }

        return 0;
    }

    /**
     * Retorna o total de músicas cadastradas na tabela musica.
     * 
     * @return total de músicas ou -1 em caso de erro
     */
    public int TotalMusicas() {
        String sql = "SELECT COUNT(id) AS totalMusicas FROM musica";

        try (PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            if (rs.next()) {
                return rs.getInt("totalMusicas");
            }

        } catch (SQLException e) {
            System.out.println("Erro ao consultar total de músicas: " + e.getMessage());
            return -1;
        }

        return 0;
    }
}
