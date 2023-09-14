package avtmapa.progII.core.dao.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoJDBC {
    private static final String URL = "jdbc:mysql://localhost:3306/mapa";
    private static final String USER = "root";
    private static final String PASSWORD = "root";
    
    public static Connection con;
    
    public static Connection getConexao(){
        try{
            if(con == null){
             con = DriverManager.getConnection(URL, USER,PASSWORD);
                return con;
            } else {
                return con;
            }
        } catch(SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Houve um erro ao tentar conectar no banco de dados");
            return null;
        }
    }
}
