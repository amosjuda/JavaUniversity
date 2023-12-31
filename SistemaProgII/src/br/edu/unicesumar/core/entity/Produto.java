package br.edu.unicesumar.core.entity;

public class Produto {
    private Long id;
    private String nome;
    private Double valorCusto;
    private Double valorVenda;
    private Integer qtdEstoque;
    
    public Produto(){
    }

    public Produto(Long id, String nome, Double valorCusto, Double valorVenda, Integer qtdEstoque) {
        this.id = id;
        this.nome = nome;
        this.valorCusto = valorCusto;
        this.valorVenda = valorVenda;
        this.qtdEstoque = qtdEstoque;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValorCusto() {
        return valorCusto;
    }

    public void setValorCusto(Double valorCusto) {
        this.valorCusto = valorCusto;
    }

    public Double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public Integer getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(Integer qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }
    
}
