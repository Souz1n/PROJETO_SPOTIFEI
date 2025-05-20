package Controller;

import DAO.Conexao;
import DAO.PlaylistDAO;
import View.telaPlayslistUser;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class ControlePlaylistUser {

    private final telaPlayslistUser view;
    private final int idUsuario; // você precisa passar isso ao criar

    private final String musicaAtual; // pegue o nome da música que o usuário selecionou

    public ControlePlaylistUser(telaPlayslistUser view, int idUsuario, String musicaAtual) {
        this.view = view;
        this.idUsuario = idUsuario;
        this.musicaAtual = musicaAtual;
        listarPlaylists();
    }

    public void criarPlaylist() {
        String nome = view.getBt_criarPlaylist().getText();

        try {
            try (Connection conn = new Conexao().getConnection()) {
                PlaylistDAO dao = new PlaylistDAO(conn);
                dao.criarPlaylist(nome, idUsuario);
                view.getTxt_areaPlaylists().append("Playlist criada: " + nome + "\n");
            }
        } catch (SQLException e) {
            view.getTxt_areaPlaylists().append("Erro ao criar playlist: " + e.getMessage() + "\n");
        }
    }

    public void adicionarMusica() {
        int idMusica = buscarIdMusicaPorNome(musicaAtual); // você implementa isso em outro DAO
        String nomePlaylist = view.getTxt_nomeNovaPlaylist().getText();

        try {
            try (Connection conn = new Conexao().getConnection()) {
                PlaylistDAO dao = new PlaylistDAO(conn);
                dao.adicionarMusicaNaPlaylist(idMusica, nomePlaylist, idUsuario);
                view.getTxt_areaPlaylists().append("Música adicionada à playlist: " + nomePlaylist + "\n");
            }
        } catch (SQLException e) {
            view.getTxt_areaPlaylists().append("Erro ao adicionar música: " + e.getMessage() + "\n");
        }
    }

    public void listarPlaylists() {
        try {
            try (Connection conn = new Conexao().getConnection()) {
                PlaylistDAO dao = new PlaylistDAO(conn);
                List<String> listas = dao.listarPlaylists(idUsuario);
                view.getTxt_areaPlaylists().setText("");
                for (String nome : listas) {
                    view.getTxt_areaPlaylists().append("Playlist: " + nome + "\n");
                }
            }
        } catch (SQLException e) {
            view.getTxt_areaPlaylists().append("Erro ao listar playlists: " + e.getMessage() + "\n");
        }
    }

    private int buscarIdMusicaPorNome(String nomeMusica) {
        // Simule ou recupere isso do seu DAO de músicas
        return 1; // Substitua por lógica real
    }
}
