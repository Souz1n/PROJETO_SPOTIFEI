package Controller;

import View.telaEstatisticas;
import java.sql.Connection;
import java.sql.SQLException;
import DAO.TotaisTopEstDAO;
import DAO.Conexao;
import DAO.ListarFMusDAO;
import View.telaMenuAdm;
import Model.Musica;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 * Controlador responsável por lidar com as ações da tela de estatísticas.
 */
public class ControleEstatisticas {
    
    private final telaEstatisticas view;

    /**
     * Construtor da classe ControleEstatisticas.
     *
     * @param view Tela de estatísticas.
     */
    public ControleEstatisticas(telaEstatisticas view) {
        this.view = view;
    }

    /**
     * Consulta o total de usuários cadastrados no sistema e exibe na tela.
     */
    public void verTotalUser() {
        try {
            Connection conn = new Conexao().getConnection();
            TotaisTopEstDAO dao = new TotaisTopEstDAO(conn);

            int total = dao.TotalUsuarios();

            view.getLbl_totUserEstRes().setText(String.valueOf(total));
            conn.close();
        } catch (SQLException e) {
            System.out.println("Erro ao contabilizar: " + e.getMessage());
        }
        view.dispose();
    }

    /**
     * Consulta o total de músicas cadastradas no sistema e exibe na tela.
     */
    public void verTotalMus() {
        try {
            Connection conn = new Conexao().getConnection();
            TotaisTopEstDAO dao = new TotaisTopEstDAO(conn);

            int total = dao.TotalMusicas();

            view.getLbl_totMusEstRes().setText(String.valueOf(total));
            conn.close();
        } catch (SQLException e) {
            System.out.println("Erro ao contabilizar: " + e.getMessage());
        }
        view.dispose();
    }

    /**
     * Retorna ao menu principal do administrador.
     */
    public void voltaMenu() {
        telaMenuAdm tma = new telaMenuAdm();
        tma.setVisible(true);
        view.dispose();
    }

    /**
     * Carrega e exibe na tela as 5 músicas mais curtidas.
     */
    public void carregarTop5Musicas() {
        try {
            Connection conn = new Conexao().getConnection();
            ListarFMusDAO dao = new ListarFMusDAO(conn);
            List<Musica> top5 = dao.listarTop5MaisCurtidas();

            DefaultListModel<String> modelo = new DefaultListModel<>();
            for (Musica m : top5) {
                String linha = String.format("%-10s %s Like", m.getNome(), m.getCurtidas());
                modelo.addElement(linha);
            }

            view.getJlist_top5Mus().setModel(modelo);
            conn.close();
        } catch (SQLException e) {
            System.out.println("Erro ao carregar top 5 músicas: " + e.getMessage());
        }
    }

    /**
     * Carrega e exibe na tela as 5 músicas menos curtidas (com mais deslikes).
     */
    public void carregarTop5MusicasMenos() {
        try {
            Connection conn = new Conexao().getConnection();
            ListarFMusDAO dao = new ListarFMusDAO(conn);
            List<Musica> top5 = dao.listarTop5MenosCurtidas();

            DefaultListModel<String> modelo = new DefaultListModel<>();
            for (Musica m : top5) {
                String linha = String.format("%-10s %5d Deslike", m.getNome(), m.getCurtidas());
                modelo.addElement(linha);
            }

            view.getJlist_top5MusDes().setModel(modelo);
            conn.close();
        } catch (SQLException e) {
            System.out.println("Erro ao carregar top 5 músicas menos likes: " + e.getMessage());
        }
    }

    /**
     * Fecha a tela de estatísticas.
     */
    public void fechar() {
        view.dispose();
    }
}
