
package Controller;

import Model.DAO.UsuarioDAO;
import Model.bean.Usuario;
import java.sql.SQLException;

public class Jogador {
    public boolean adicionaUsuario (String login, String senha) throws SQLException{
        Usuario  c1 = new Usuario(login, senha);
        UsuarioDAO c1DAO = new UsuarioDAO();
        boolean adiciona = c1DAO.cadastra(c1);
        return adiciona;
    }
   
}
