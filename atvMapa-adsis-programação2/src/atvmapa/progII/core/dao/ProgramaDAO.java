package atvmapa.progII.core.dao;

import atvmapa.progII.core.entity.Usuario;
import avtmapa.progII.core.dao.conexao.ConexaoJDBC;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProgramaDAO {
    public Usuario buscarLogin(String login, String senha){
        
        String sql = "SELECT ID, NOME, LOGIN, SENHA, EMAIL FROM USUARIO WHERE LOGIN = ? AND SENHA = ?";
        
        PreparedStatement ps;
        ResultSet rs;
        
        try{
            ps = ConexaoJDBC.getConexao().prepareStatement(sql);
            ps.setString(1, login);
            ps.setString(2, senha);
            rs = ps.executeQuery();
            
            Usuario usuario = new Usuario();;
            if(rs.next()){
               usuario.setLogin(rs.getString("LOGIN"));
               usuario.setSenha(rs.getString("SENHA"));
               usuario.setNome(rs.getString("NOME"));
               usuario.setEmail(rs.getString("EMAIL"));
            }
           
            return usuario;
            
        } catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }
    public void inserir(Usuario usuario){
        String sql = "INSERT INTO USUARIO(NOME, LOGIN, SENHA, EMAIL) VALUES (?,?,?,?)";
        
        PreparedStatement ps;
        try {
            ps = ConexaoJDBC.getConexao().prepareStatement(sql);
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getLogin());
            ps.setString(3, usuario.getSenha());
            ps.setString(4, usuario.getEmail());
            
            ps.execute();
            
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
    
}
