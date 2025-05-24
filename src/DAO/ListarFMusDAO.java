package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;
import Model.Musica;

/**
 * Classe DAO responsável por listar músicas baseadas no total de curtidas,
 * permitindo obter os top 5 mais e menos curtidas.
 */
public class ListarFMusDAO {
    
    /** Conexão ativa com o banco de dados */
    private final Connection conn;

    /**
     * Construtor que recebe a conexão com o banco de dados.
     * 
     * @param conn conexão ativa com o banco.
     */
    public ListarFMusDAO(Connection conn) {
        this.conn = conn;
    }       
    
    /**
     * Retorna uma lista das 5 músicas com mais curtidas.
     * 
     * @return lista contendo até 5 objetos Musica com mais curtidas.
     * @throws SQLException se ocorrer erro ao executar a consulta no banco.
     */
    public List<Musica> listarTop5MaisCurtidas() throws SQLException {
        List<Musica> lista = new ArrayList<>();

        String sql = """
            SELECT m.id, m.nome_musica, COUNT(*) AS total_curtidas
            FROM musica m
            JOIN curtidas c ON m.id = c.id_musica
            WHERE c.status = true
            GROUP BY m.id, m.nome_musica
            ORDER BY total_curtidas DESC
            LIMIT 5
            """;

        try (PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome_musica");
                int curtidas = rs.getInt("total_curtidas");
                lista.add(new Musica(id, nome, curtidas));
            }
        }

        return lista;
    }
    
    /**
     * Retorna uma lista das 5 músicas com menos curtidas.
     * 
     * @return lista contendo até 5 objetos Musica com menos curtidas.
     * @throws SQLException se ocorrer erro ao executar a consulta no banco.
     */
    public List<Musica> listarTop5MenosCurtidas() throws SQLException {
        List<Musica> lista = new ArrayList<>();

        String sql = """
            SELECT m.id, m.nome_musica, COUNT(*) AS total_curtidas
            FROM musica m
            JOIN curtidas c ON m.id = c.id_musica
            WHERE c.status = true
            GROUP BY m.id, m.nome_musica
            ORDER BY total_curtidas ASC
            LIMIT 5
            """;

        try (PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome_musica");
                int curtidas = rs.getInt("total_curtidas");
                lista.add(new Musica(id, nome, curtidas));
            }
        }

        return lista;
    }
    
}
