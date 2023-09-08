/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.unicesumar.core.entity.dao;

import br.edu.unicesumar.core.entity.Produto;

/**
 *
 * @author Usuário
 */
public class ProdutoDAO {
    public void inserir(Produto produto){
        //coamandos do banco de dados
        System.out.println("Aqui começa a cadastrar o banco de dados");
        System.out.println("Produto a ser cadastrado "+ produto.getNome());
    }
}
