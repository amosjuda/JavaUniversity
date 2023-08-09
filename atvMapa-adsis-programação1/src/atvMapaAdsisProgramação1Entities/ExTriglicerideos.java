package atvMapaAdsisProgramação1Entities;

public class ExTriglicerideos extends Exames{
    private int quantTriglicerideo;

    public ExTriglicerideos(int quantTriglicerideo, String nome, int tipoSanguineo, int anoNascimento) {
        super(nome, tipoSanguineo, anoNascimento);
        this.quantTriglicerideo = quantTriglicerideo;
    }

    public int getQuantTriglicerideo() {
        return quantTriglicerideo;
    }

    public void setQuantTriglicerideo(int quantTriglicerideo) {
        this.quantTriglicerideo = quantTriglicerideo;
    }
    
    
}
