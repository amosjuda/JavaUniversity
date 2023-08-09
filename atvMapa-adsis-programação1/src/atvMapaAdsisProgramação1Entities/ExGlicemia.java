package atvMapaAdsisProgramação1Entities;

public class ExGlicemia extends Exames{
    private int quantGlicose;

    public ExGlicemia(int quantGlicose, String nome, int tipoSanguineo, int anoNascimento) {
        super(nome, tipoSanguineo, anoNascimento);
        this.quantGlicose = quantGlicose;
    }

    public int getQuantGlicose() {
        return quantGlicose;
    }

    public void setQuantGlicose(int quantGlicose) {
        this.quantGlicose = quantGlicose;
    }
    
    
    
}
