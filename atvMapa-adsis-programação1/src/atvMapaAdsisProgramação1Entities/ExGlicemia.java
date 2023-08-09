package atvMapaAdsisProgramação1Entities;

import javax.swing.JOptionPane;

public class ExGlicemia extends Exames{
    private int quantGlicose;
    private String resultadoGlicemia;

    public void classificarGlicemia(){
        if(quantGlicose < 100){
            resultadoGlicemia = "Normoglicemia";
        } else if (quantGlicose >= 100  &&  quantGlicose < 126){
             resultadoGlicemia = "Pré-diabetes";
        } else {
             resultadoGlicemia = "Diabetes estabelecido";
        }
    }
    
    @Override
    public void cadastrarExame() {
        super.cadastrarExame();
        String SQuantGlicose = JOptionPane.showInputDialog("Digite a quantidade de Glicose:  ");
        this.quantGlicose = Integer.parseInt(SQuantGlicose);
    }
    
    @Override
    public void mostrarResultado() {
        super.mostrarResultado();
        JOptionPane.showMessageDialog(null, "Nome: " + getNome() + "\nResultado: " + quantGlicose + "\nClassificação: " + resultadoGlicemia );
    }
}