package DAO;

import Model.CadUser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 * Classe DAO responsável pela manipulação dos dados do usuário no banco de dados.
 * Permite inserir usuários e pessoas relacionadas.
 */
public class CadUserDAO {
    
    /** Conexão ativa com o banco de dados */
    private Connection conn;

    /**
     * Construtor que recebe a conexão com o banco de dados.
     * 
     * @param conn Conexão estabelecida com o banco.
     */
    public CadUserDAO(Connection conn) {
        this.conn = conn;
    }
    
    /**
     * Insere um novo usuário na tabela 'usuario' com senha e referência à pessoa.
     * 
     * @param usuario Objeto CadUser contendo os dados do usuário a ser inserido.
     * @throws SQLException Caso ocorra algum erro durante a inserção no banco de dados.
     */
    public void inserirUsuario(CadUser usuario) throws SQLException {
        String sql = "INSERT INTO usuario (senha, id_pessoa) VALUES (?,?)";
        
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, usuario.getSenha());
            stmt.setInt(2, usuario.getId_pessoa());
            stmt.executeUpdate();
        }
    }
    
    /**
     * Insere uma nova pessoa na tabela 'pessoa' com nome e email, retornando o ID gerado.
     * Atualiza o objeto CadUser com o ID retornado.
     * 
     * @param usuario Objeto CadUser contendo os dados da pessoa a ser inserida.
     * @throws SQLException Caso ocorra algum erro durante a inserção no banco de dados.
     */
    public void inserirPessoa(CadUser usuario) throws SQLException {
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
        }
    }
}
