package atvMapaAdsisProgramação1Entities;

import javax.swing.JOptionPane;

public class Exames {
    private String nome;
    private String tipoSanguineo;
    private int anoNascimento;
    
    public Exames(){
    }

    public Exames(String nome, String tipoSanguineo, int anoNascimento) {
        this.nome = nome;
        this.tipoSanguineo = tipoSanguineo;
        this.anoNascimento = anoNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    
    public void cadastrarExame(){
        this.nome = JOptionPane.showInputDialog("Digite o nome o nome:  ");
        this.tipoSanguineo = JOptionPane.showInputDialog("Digite o tipo sanguíneo:  ");
        String SAnoNascimento = JOptionPane.showInputDialog("Digite o ano de nascimento:  ");
        this.anoNascimento = Integer.parseInt(SAnoNascimento);
    }
    
    public void mostrarResultado(){
    }
}