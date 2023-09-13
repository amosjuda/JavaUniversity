package br.edu.unicesumar.core.dao.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoJDBC {
    private static final String URL = "jdbc:mysql://localhost:3306/teste";
    private static final String USER = "root";
    private static final String PASSWORD = "root";
    
    public static Connection conn;
    
    // quero que funcione enquanto a aplicação estiver rodando
    public static Connection getConexao(){
        try{
            if(conn == null){
                //reestabelecer a conexão com o banco de dados
             conn = DriverManager.getConnection(URL, USER,PASSWORD);
                return conn;
            } else {
                return conn;
            }
        } catch(SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Houve um erro ao tentar conectar no banco de dados");
            return null;
        }
    }
}

