package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 * Classe DAO responsável por operações relacionadas à busca do ID de um artista pelo nome.
 */
public class SourceArtPorIdDAO {
    
    private Connection conn;

    /**
     * Construtor que recebe a conexão ativa com o banco de dados.
     * 
     * @param conn conexão ativa com o banco de dados
     */
    public SourceArtPorIdDAO(Connection conn) {
        this.conn = conn;
    }
    
    /**
     * Busca o ID do artista no banco a partir do nome da pessoa associada.
     * Realiza uma junção entre as tabelas artista e pessoa para encontrar o artista pelo nome.
     * 
     * @param nomeArtista nome da pessoa/artista a ser buscado
     * @return o ID do artista caso encontrado, ou -1 caso não encontrado
     * @throws SQLException se ocorrer algum erro ao executar a consulta
     */
    public int buscarIdArtistaPorNome(String nomeArtista) throws SQLException {
        String sql = "SELECT a.id\n" +
                     "FROM artista a\n" +
                     "JOIN pessoa p ON a.id_pessoa = p.id\n" +
                     "WHERE p.nome = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nomeArtista);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt("id");
            } else {
                return -1;
            }
        }
    }
}
