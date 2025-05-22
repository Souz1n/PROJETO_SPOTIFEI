package DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import Model.Playlist;

public class PlaylistDAO {
    private final Connection conn;

    public PlaylistDAO(Connection conn) {
        this.conn = conn;
    }

    public void criarPlaylist(String nome, int id_user) throws SQLException {
        String sql = "INSERT INTO playlist (nome, id_usuario) VALUES (?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setInt(2, id_user);
            stmt.executeUpdate();
        }
    }
    
    
    public void removerPlaylist(Playlist musica) throws SQLException {
        try (conn) {
            String sql = "DELETE FROM musica WHERE id_musica = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
//            statement.setInt(1, musica.get());
            statement.execute(); 
        }
    }

    public List<Playlist> listarTodasPlaylist(int id_user) throws SQLException {
        List<Playlist> lista = new ArrayList<>();

        String sql = "SELECT id, nome, id_usuario "
                   + "FROM playlist "
                   + "WHERE id_usuario = ?";

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



}

