package atvMapaAdsisProgramação1Entities;

public class ExColesterol extends Exames{
    private int LDL;
    private int HDL;

    public ExColesterol(int LDL, int HDL, String nome, int tipoSanguineo, int anoNascimento) {
        super(nome, tipoSanguineo, anoNascimento);
        this.LDL = LDL;
        this.HDL = HDL;
    }

    public int getLDL() {
        return LDL;
    }

    public void setLDL(int LDL) {
        this.LDL = LDL;
    }

    public int getHDL() {
        return HDL;
    }

    public void setHDL(int HDL) {
        this.HDL = HDL;
    }
    
    
}
