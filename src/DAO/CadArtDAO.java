package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Model.CadArt;
import java.sql.ResultSet;

/**
 * Classe DAO responsável pela manipulação dos dados relacionados aos artistas e pessoas no banco de dados.
 * Fornece métodos para inserir registros nas tabelas 'artista' e 'pessoa'.
 */
public class CadArtDAO {
    
    /** Conexão ativa com o banco de dados */
    private final Connection conn;

    /**
     * Construtor que recebe uma conexão com o banco de dados.
     * 
     * @param conn Conexão estabelecida com o banco.
     */
    public CadArtDAO(Connection conn) {
        this.conn = conn;
    }
    
    /**
     * Insere um novo artista na tabela 'artista' com base no objeto CadArt fornecido.
     * 
     * @param cadArt Objeto contendo os dados do artista, como nome da banda e ID da pessoa.
     * @throws SQLException Caso ocorra algum erro na operação com o banco de dados.
     */
    public void inserirArtista(CadArt cadArt) throws SQLException {
        String sql = "INSERT INTO artista (banda, id_pessoa) VALUES (?, ?)";
        
        try (PreparedStatement stm = conn.prepareStatement(sql)) {
            stm.setString(1, cadArt.getBanda());
            stm.setInt(2, cadArt.getId_pessoa());
            stm.executeUpdate();
        }
    }
    
    /**
     * Insere uma nova pessoa na tabela 'pessoa' e retorna o ID gerado.
     * Atualiza o objeto CadArt com o ID retornado.
     * 
     * @param usuario Objeto CadArt contendo nome e email da pessoa.
     * @throws SQLException Caso ocorra erro ao executar a inserção ou recuperar o ID.
     */
    public void inserirPessoa(CadArt usuario) throws SQLException {
        String sql = "INSERT INTO pessoa (nome, email) VALUES (?, ?) RETURNING id";
        
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getEmail());

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                int idPessoa = rs.getInt("id");
                usuario.setId_pessoa(idPessoa); 
            }

            rs.close();
            stmt.close();
        }
    }
}
