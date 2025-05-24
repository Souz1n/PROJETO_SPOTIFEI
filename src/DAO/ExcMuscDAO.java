package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Model.ExcMus;

/**
 * Classe DAO responsável pela exclusão de registros de música no banco de dados.
 */
public class ExcMuscDAO {
    /** Conexão ativa com o banco de dados */
    private final Connection conn;

    /**
     * Construtor que recebe a conexão com o banco de dados.
     * 
     * @param conn Conexão estabelecida com o banco.
     */
    public ExcMuscDAO(Connection conn) {
        this.conn = conn;
    }

    /**
     * Remove uma música do banco de dados pelo seu ID.
     * 
     * @param musica Objeto ExcMus que contém o ID da música a ser removida.
     * @throws SQLException Caso ocorra erro na execução do comando SQL.
     */
    public void remover(ExcMus musica) throws SQLException {
        try (conn) {
            String sql = "DELETE FROM musica WHERE id = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, musica.getId_Musica());
            statement.execute();
        }
    }
}
