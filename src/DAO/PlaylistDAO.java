package DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import Model.PlaylistV;
import Model.Playlist;
import Model.Musica;

/**
 * Classe DAO responsável pelas operações relacionadas a playlists,
 * incluindo criação, remoção, consulta e manipulação de músicas nas playlists.
 */
public class PlaylistDAO {
    private Connection conn;

    /**
     * Construtor que recebe a conexão com o banco de dados.
     * 
     * @param conn conexão ativa com o banco de dados
     */
    public PlaylistDAO(Connection conn) {
        this.conn = conn;
    }

    /**
     * Cria uma nova playlist associada a um usuário.
     * 
     * @param nome nome da playlist a ser criada
     * @param id_user id do usuário dono da playlist
     * @throws SQLException se ocorrer algum erro no banco de dados
     */
    public void criarPlaylist(String nome, int id_user) throws SQLException {
        String sql = "INSERT INTO playlist (nome, id_usuario) VALUES (?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setInt(2, id_user);
            stmt.executeUpdate();
        }
    }

    /**
     * Remove uma playlist existente.
     * 
     * @param playlist objeto Playlist contendo o id da playlist a ser removida
     * @throws SQLException se a playlist não for encontrada ou erro no banco
     */
    public void removerPlaylist(Playlist playlist) throws SQLException {
        String sql = "DELETE FROM playlist WHERE id = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, playlist.getId_playlist());

            int rows = stmt.executeUpdate();

            if (rows == 0) {
                throw new SQLException("Nenhuma playlist encontrada para remover.");
            }
        }
    }

    /**
     * Lista todas as playlists de um usuário específico.
     * 
     * @param id_user id do usuário
     * @return lista de objetos Playlist do usuário
     * @throws SQLException se ocorrer erro no banco
     */
    public List<Playlist> listarTodasPlaylist(int id_user) throws SQLException {
        List<Playlist> lista = new ArrayList<>();

        String sql = "SELECT id, nome, id_usuario FROM playlist WHERE id_usuario = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id_user);

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    int id_playlist = rs.getInt("id");
                    int id_usuario = rs.getInt("id_usuario");
                    String nome = rs.getString("nome");

                    lista.add(new Playlist(id_usuario, id_playlist, nome));
                }
            }
        }

        return lista;
    }

    /**
     * Consulta o ID de uma playlist pelo nome e usuário.
     * OBS: Parece que há um erro no SQL, a tabela está como "musica" e não "playlist".
     * 
     * @param nome nome da playlist
     * @param id_usuario id do usuário dono da playlist
     * @return id da playlist ou -1 se não encontrada
     */
    public int consultarIdPlaylist(String nome, int id_usuario) {
        String sql = "SELECT id FROM musica WHERE nome = ? AND id_usuario = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setInt(2, id_usuario); // corrigido o índice para 2

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt("id");
            } else {
                return -1;
            }
        } catch (SQLException e) {
            System.out.println("Erro ao consultar playlist: " + e.getMessage());
            return -1;
        }
    }

    /**
     * Lista todas as músicas de uma playlist específica para um usuário.
     * 
     * @param id_user id do usuário
     * @param id_playlist id da playlist
     * @return lista de músicas pertencentes à playlist
     * @throws SQLException se ocorrer erro no banco
     */
    public List<Musica> listAllMusPlay(int id_user, int id_playlist) throws SQLException {
        List<Musica> lista = new ArrayList<>();

        String sql = "SELECT m.nome_musica " +
                     "FROM playlist_musica pm " +
                     "JOIN musica m ON pm.id_musica = m.id " +
                     "WHERE pm.id_playlist = ? AND pm.id_usuario = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id_playlist);
            stmt.setInt(2, id_user);

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    String nome = rs.getString("nome_musica");
                    lista.add(new Musica(nome));
                }
            }
        }

        return lista;
    }

    /**
     * Verifica se uma playlist com determinado nome existe para um usuário.
     * 
     * @param nomePlaylist nome da playlist
     * @param id_user id do usuário
     * @return objeto Playlist se encontrada, null caso contrário
     */
    public Playlist verificarPlaylist(String nomePlaylist, int id_user) {
        Playlist playlist = null;
        String sql = "SELECT id FROM playlist WHERE nome = ? AND id_usuario = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nomePlaylist);
            stmt.setInt(2, id_user);

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                int idPlaylist = rs.getInt("id");
                playlist = new Playlist(id_user, idPlaylist, nomePlaylist);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao consultar playlist: " + e.getMessage());
        }

        return playlist;
    }

    /**
     * Adiciona uma música a uma playlist, se ela ainda não estiver adicionada.
     * 
     * @param nome_musica nome da música a ser adicionada
     * @param id_playlist id da playlist
     * @param id_user id do usuário dono da playlist
     * @return true se a música foi adicionada, false caso contrário
     * @throws SQLException se ocorrer erro no banco
     */
    public boolean adicionarMusicaNaPlaylist(String nome_musica, int id_playlist, int id_user) throws SQLException {
        String buscarMusica = "SELECT id FROM musica WHERE nome_musica = ?";
        String verificarExistencia = "SELECT 1 FROM playlist_musica WHERE id_musica = ? AND id_playlist = ? AND id_usuario = ?";
        String inserirMusica = "INSERT INTO playlist_musica (id_musica, id_playlist, id_usuario) VALUES (?, ?, ?)";

        try (
            PreparedStatement stmtBuscar = conn.prepareStatement(buscarMusica);
            PreparedStatement stmtVerificar = conn.prepareStatement(verificarExistencia);
            PreparedStatement stmtInserir = conn.prepareStatement(inserirMusica)
        ) {
            stmtBuscar.setString(1, nome_musica);
            ResultSet rs = stmtBuscar.executeQuery();

            if (rs.next()) {
                int id_musica = rs.getInt("id");

                stmtVerificar.setInt(1, id_musica);
                stmtVerificar.setInt(2, id_playlist);
                stmtVerificar.setInt(3, id_user);
                ResultSet rsVerifica = stmtVerificar.executeQuery();

                if (rsVerifica.next()) {
                    System.out.println("A música já está na playlist.");
                    return false;
                }

                stmtInserir.setInt(1, id_musica);
                stmtInserir.setInt(2, id_playlist);
                stmtInserir.setInt(3, id_user);

                int linhasAfetadas = stmtInserir.executeUpdate();
                return linhasAfetadas > 0;
            } else {
                System.out.println("Música não encontrada: " + nome_musica);
            }
        }

        return false;
    }

    /**
     * Remove uma música de uma playlist.
     * 
     * @param nome_musica nome da música a ser removida
     * @param id_playlist id da playlist
     * @param id_user id do usuário dono da playlist
     * @return true se a música foi removida, false caso contrário
     * @throws SQLException se ocorrer erro no banco
     */
    public boolean removerMusicaNaPlaylist(String nome_musica, int id_playlist, int id_user) throws SQLException {
        String buscarMusica = "SELECT id FROM musica WHERE nome_musica = ?";
        String removerMusica = "DELETE FROM playlist_musica WHERE id_musica = ? AND id_playlist = ? AND id_usuario = ?";

        try (
            PreparedStatement stmtBuscar = conn.prepareStatement(buscarMusica);
            PreparedStatement stmtRemover = conn.prepareStatement(removerMusica)
        ) {
            stmtBuscar.setString(1, nome_musica);
            ResultSet rs = stmtBuscar.executeQuery();

            if (rs.next()) {
                int idMusica = rs.getInt("id");

                stmtRemover.setInt(1, idMusica);
                stmtRemover.setInt(2, id_playlist);
                stmtRemover.setInt(3, id_user);

                int linhasAfetadas = stmtRemover.executeUpdate();
                return linhasAfetadas > 0;
            } else {
                System.out.println("Música não encontrada DAO: " + nome_musica);
            }
        }
        return false;
    }

}
