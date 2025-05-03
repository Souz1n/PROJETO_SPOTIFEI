//package DAO;
//
//import Model.CadMus;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//public class ConsultarMusc {
//   public ResultSet consultar(CadMus musica) throws SQLException {
//    String sql = "select * from musica where nome = ? and artista = ?";
//    PreparedStatement statement = conn.prepareStatement(sql);
//    statement.setString(1, musica.getNome());
//    statement.setString(2, musica.getArtista());
//    statement.execute();
//    ResultSet resultado = statement.getResultSet();
//    return resultado;
//    
//    }
//}
