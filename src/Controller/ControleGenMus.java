
package Controller;


import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import DAO.CadMuscDAO;
import DAO.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Model.CadMus;
import View.telaCadExcMus;


public class ControleGenMus {
    
    private telaCadExcMus view;
    
    public ControleGenMus(telaCadExcMus view){
        this.view = view;
    }
    
    public void cadastrarMusica() {
        String nome = view.getTxt_cadMusNam().getText();
        String artista = view.getTxt_cadMusArt().getText();
        
        // Ano
        String textoAno = view.getTxt_cadMusAno().getText().trim(); // Remove espaços extras

        // Cria um SimpleDateFormat para aceitar apenas o ano
        SimpleDateFormat formato = new SimpleDateFormat("yyyy");
        formato.setLenient(false); // Impede aceitação de datas inválidas como "202A"

        Date ano = null;
        
        try {
            // Tenta converter o texto para Date
            ano = formato.parse(textoAno);

            // Cria o objeto música e define os dados
            CadMus musica = new CadMus();
            musica.setNome(nome);
            musica.setArtista(artista);
            musica.setAno(ano);

            // Conexão com o banco de dados e inserção da música
            try (Connection conn = new Conexao().getConnection()) {
                CadMuscDAO dao = new CadMuscDAO(conn);
                dao.inserir(musica);
                view.getLbl_cadMusResult().setText("Música cadastrada com sucesso!");
            } catch (SQLException e) {
                view.getLbl_cadMusResult().setText("Erro ao cadastrar música: " + e.getMessage());
            }
            
        } catch (ParseException e) {
            // Se ocorrer um erro ao tentar parsear a data, exibe uma mensagem de erro
            view.getLbl_cadMusResult().setText("Erro no formato do ano: " + textoAno);
            JOptionPane.showMessageDialog(view, "Formato de ano inválido. Por favor, insira um ano válido (ex: 2024).", "Erro", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
}