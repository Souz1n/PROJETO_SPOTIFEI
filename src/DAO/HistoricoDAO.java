package DAO;

import Model.Historico;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HistoricoDAO {
    private final Connection conn;

    public HistoricoDAO(Connection conn) {
        this.conn = conn;
    }

    public List<String> ultimasBuscas(String nomeUser) throws SQLException {
        String sql = "SELECT nome_musica FROM historico WHERE nome_user = ? ORDER BY id DESC LIMIT 10";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, nomeUser);
        ResultSet rs = stmt.executeQuery();

        List<String> musicas = new ArrayList<>();
        while (rs.next()) {
            musicas.add(rs.getString("nome_musica"));
        }
        return musicas;
    }

    public List<Historico> curtidasOuDescurtidas(String nomeUser, boolean status) throws SQLException {
        String sql = "SELECT nome_musica, artista FROM curtidas WHERE nome_user = ? AND status = ?";
    try (PreparedStatement stmt = conn.prepareStatement(sql)) {
    stmt.setString(1, nomeUser);
    stmt.setBoolean(2, status);
        try (ResultSet rs = stmt.executeQuery()) {

        final List<Historico> lista = new ArrayList<>();
        while (rs.next()) {
            lista.add(new Historico(
                rs.getString("nome_musica"),
                rs.getString("artista"),
                status ? "Curtida" : "Descurtida"
            ));
        }
        return lista;
            }
        }
    }
}