package DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PlaylistDAO {
    private final Connection conn;

    public PlaylistDAO(Connection conn) {
        this.conn = conn;
    }

    public void criarPlaylist(String nome) throws SQLException {
        String sql = "INSERT INTO playlist (nome) VALUES (?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nome);
        }
    }

    public void adicionarMusicaNaPlaylist(int idMusica, String nomePlaylist, int idUsuario) throws SQLException {
        String sql = "INSERT INTO playlist (id_musica, nome_playlist, id_usuario) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idMusica);
            stmt.setString(2, nomePlaylist);
            stmt.setInt(3, idUsuario);
            stmt.executeUpdate();
        }
    }

    public List<String> listarPlaylists(int idUsuario) throws SQLException {
        List<String> playlists = new ArrayList<>();
        String sql = "SELECT DISTINCT nome_playlist FROM playlist WHERE id_usuario = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idUsuario);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    playlists.add(rs.getString("nome_playlist"));
                }
            }
        }
        return playlists;
    }
}

