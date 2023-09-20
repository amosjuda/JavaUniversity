package br.edu.unicesumar.core.dao;

import br.edu.unicesumar.core.dao.conexao.ConexaoJDBC;
import br.edu.unicesumar.core.entity.Produto;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ProdutoDAO {
    public void inserir(Produto produto) {            
         
        String sql = "INSERT INTO PRODUTO (NOME, VALOR_CUSTO, VALOR_VENDA, QUANTIDADE) VALUES (?,?,?,?)";
        
        PreparedStatement ps = null;
        try {
            ps = ConexaoJDBC.getConexao().prepareStatement(sql);
            ps.setString(1, produto.getNome());
            ps.setDouble(2, produto.getValorCusto());
            ps.setDouble(3, produto.getValorVenda());
            ps.setInt(4, produto.getQtdEstoque());
            
            ps.execute();
        } catch(SQLException e){
            e.printStackTrace();
        } finally {
            try {
                ps.close();
            } catch (SQLException ex) {
                
            }
        }
    }
    public Produto buscarProdutoPorId(Long id) {
        String sql = "SELECT ID, NOME, VALOR_CUSTO, VALOR_VENDA, QUANTIDADE WHERE ID = ?";
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try{
            ps = ConexaoJDBC.getConexao().prepareStatement(sql);
            ps.setLong(1, id);
            rs = ps.executeQuery();
            
            Produto produto = new Produto();
            if(rs.next()){ // toda vez que usa o next ele trás o próximo da lista no banco de dados e retorna ele
                produto.setId(rs.getLong("ID"));
                produto.setNome(rs.getString("NOME"));
                produto.setValorCusto(rs.getDouble("VALOR_CUSTO"));
                produto.setValorVenda(rs.getDouble("VALOR_VENDA"));
                produto.setQtdEstoque(rs.getInt("QUANTIDADE"));
            }
            return produto;
        } catch(SQLException e){
            e.printStackTrace();
        }finally{
            try {
                ps.close();
            } catch (SQLException ex) {
            }
            try {
                rs.close();
            } catch (SQLException ex) {
            }
        }
            
        return null;
    }
}
