package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Model.SourMus;

/**
 * Classe DAO responsável por operações relacionadas à consulta de músicas para o menu do usuário.
 */
public class MenuUserDAO {
    
    /** Conexão ativa com o banco de dados */
    private final Connection conn;

    /**
     * Construtor que recebe a conexão com o banco de dados.
     * 
     * @param conn conexão ativa com o banco.
     */
    public MenuUserDAO(Connection conn) {
        this.conn = conn;
    }    
    
    /**
     * Consulta uma música pelo nome, retornando seus dados básicos.
     * Caso a música seja encontrada, retorna um objeto SourMus com nome, ano e artista.
     * O gênero é setado como "Gênero não disponível".
     * Se não encontrar, retorna null.
     * 
     * @param nome nome da música a ser consultada.
     * @return objeto SourMus com dados da música ou null se não encontrada.
     */
    public SourMus consultarMus(String nome) {
        String sql = "SELECT nome, ano, artista FROM musica WHERE nome = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nome);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                SourMus musica = new SourMus();
                musica.setNome_musica(nome);
                musica.setAno(rs.getInt("ano"));
                musica.setArtista(rs.getString("artista"));
                musica.setGenero("Gênero não disponível"); // ou setar como null/vazio
                return musica;
            } else {
                return null;
            }
        } catch (SQLException e) {
            System.out.println("Erro ao consultar música: " + e.getMessage());
            return null;
        }
    }
}
