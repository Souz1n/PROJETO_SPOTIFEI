package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Model.CadMus;

/**
 * Classe DAO responsável pela manipulação dos dados da entidade Música no banco de dados.
 * Permite inserir novos registros na tabela 'musica'.
 */
public class CadMuscDAO {
    
    /** Conexão ativa com o banco de dados */
    private final Connection conn;

    /**
     * Construtor que recebe a conexão com o banco de dados.
     * 
     * @param conn Conexão estabelecida com o banco.
     */
    public CadMuscDAO(Connection conn) {
        this.conn = conn;
    }

    /**
     * Insere uma nova música na tabela 'musica' utilizando os dados do objeto CadMus.
     * 
     * @param cadMus Objeto contendo os dados da música a ser inserida.
     * @throws SQLException Caso ocorra algum erro durante a inserção no banco de dados.
     */
    public void inserir(CadMus cadMus) throws SQLException {
        String sql = "INSERT INTO musica (nome_musica, ano, genero, id_artista) "
                + "VALUES (?, ?, ?, ?)";
        
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, cadMus.getNome());
            statement.setInt(2, cadMus.getAno());
            statement.setString(3, cadMus.getGenero());
            statement.setInt(4, cadMus.getId_artista());
            statement.executeUpdate();
        }
    }
}