package atvMapaAdsisProgramação1Entities;

public class Exames {
    private String nome;
    private int tipoSanguineo;
    private int anoNascimento;
    
    public Exames(){
    }

    public Exames(String nome, int tipoSanguineo, int anoNascimento) {
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

    public int getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(int tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
}
