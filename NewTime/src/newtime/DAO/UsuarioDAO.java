
package newtime.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import newtime.DTO.Usuario;

public class UsuarioDAO {
    Connection conn;
    
    public ResultSet autenticacaousuario(Usuario objusuarioDTO){
        conn = new Conexao().conectabd();
        
        try {
            String sql = "select * from teste where nome = ? and senha = ?";
            
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objusuarioDTO.getNomeUsuario());
            pstm.setString(2, objusuarioDTO.getSenha());
            
            ResultSet resultset = pstm.executeQuery();
            
            return resultset;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"UsuarioDAO: " + erro);
            return null;
        }
    }
}
