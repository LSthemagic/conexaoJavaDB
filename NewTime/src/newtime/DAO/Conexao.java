
package newtime.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexao {
    public Connection conectabd(){
        Connection conn = null;
        
        try {
            String url = "jdbc:mysql://localhost:3306/bancolivro?user=root&password=";
            conn = DriverManager.getConnection(url);
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"Erro conexão " + erro);
        }
     return conn;   
    }
}
