package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Classe DAO responsável pela consulta de músicas no banco de dados.
 * Permite buscar o ID de uma música pelo seu nome e nome do artista.
 */
public class ConsMuscDAO {
    
    /** Conexão ativa com o banco de dados */
    private Connection conn;

    /**
     * Construtor que recebe a conexão com o banco de dados.
     * 
     * @param conn Conexão estabelecida com o banco.
     */
    public ConsMuscDAO(Connection conn) {
        this.conn = conn;
    }

    /**
     * Consulta o ID de uma música pelo nome da música e nome do artista.
     * 
     * @param nome Nome da música a ser consultada.
     * @param artista Nome do artista associado à música.
     * @return O ID da música se encontrada; caso contrário, retorna -1.
     */
    public int consultarIdMusica(String nome, String artista) {
        String sql = "SELECT m.id " +
                     "FROM musica m " +
                     "JOIN artista a ON m.id_artista = a.id " +
                     "JOIN pessoa p ON a.id_pessoa = p.id " +
                     "WHERE m.nome_musica = ? AND p.nome = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setString(2, artista);

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt("id");
            } else {
                return -1; 
            }
        } catch (SQLException e) {
            System.out.println("Erro ao consultar música: " + e.getMessage());
            return -1;
        }
    }
}
