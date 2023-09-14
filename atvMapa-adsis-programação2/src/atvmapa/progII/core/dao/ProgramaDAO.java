package atvmapa.progII.core.dao;

import atvmapa.progII.core.entity.Usuario;
import avtmapa.progII.core.dao.conexao.ConexaoJDBC;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProgramaDAO {
    public Usuario entrar(Long id){
        
        String sql = "SELECT ID, NOME, LOGIN, SENHA, EMAIL FROM USUARIO WHERE LOGIN = ? AND SENHA = ?";
        
        PreparedStatement ps;
        ResultSet rs;
        
        try{
            ps = ConexaoJDBC.getConexao().prepareStatement(sql);
            ps.setLong(1, id);
            rs = ps.executeQuery();
            
            Usuario usuario = new Usuario();
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
 
    
}
