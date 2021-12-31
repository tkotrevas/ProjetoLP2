package Model.DAO;
import Model.bean.Usuario;
import Connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class UsuarioDAO {
    Connection con = null;
    
     public boolean cadastra(Usuario c1) throws SQLException{
       boolean adiciona = false;
       try {
           con = new Conexao().getConnection();
           String sql = "INSERT INTO jogadorRPG (LOGIN, SENHA) values (?,?)";
          PreparedStatement stmt = con.prepareStatement(sql);
          stmt.setString(1, c1.getLogin());
          stmt.setString(2, c1.getSenha());
          stmt.execute();
          stmt.close();
          adiciona = true;
         
       } catch (Exception e){
          e.printStackTrace();
       }finally
       {
           con.close();
       }
       return adiciona;
             
   }
}