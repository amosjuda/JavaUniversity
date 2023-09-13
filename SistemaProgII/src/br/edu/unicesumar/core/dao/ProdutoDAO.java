package br.edu.unicesumar.core.dao;

import br.edu.unicesumar.core.dao.conexao.ConexaoJDBC;
import br.edu.unicesumar.core.entity.Produto;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProdutoDAO {
    public void inserir(Produto produto){            
         
        String sql = "INSERT INTO PRODUTO (NOME, VALOR_CUSTO, VALOR_VENDA, QUANTIDADE) VALUES (?,?,?,?)";
        
        PreparedStatement ps;
        try {
            ps = ConexaoJDBC.getConexao().prepareStatement(sql);
            ps.setString(1, produto.getNome());
            ps.setDouble(2, produto.getValorCusto());
            ps.setDouble(3, produto.getValorVenda());
            ps.setInt(4, produto.getQtdEstoque());
            
            ps.execute();
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
}
