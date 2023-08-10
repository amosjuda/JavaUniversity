package atvMapaAdsisProgramação1Entities;

import javax.swing.JOptionPane;

public class ExTriglicerideos extends Exames{
    private int quantTriglicerideo;
    
    private int idade;
    private String estadoClass;
    
    public void classificarTriglicerideo(){
        if(idade <= 9){
           if(quantTriglicerideo < 75){
               estadoClass = " BOM";
           } else {
                estadoClass = " RUIM";
           }
        }
        if(idade >= 10 && idade <= 19){
            if(quantTriglicerideo < 90){
                estadoClass = " BOM";
           } else {
                estadoClass = " RUIM";
           }
        }
        if(idade > 20){
           if(quantTriglicerideo < 150){
               estadoClass = " BOM";
           } else {
                estadoClass = " RUIM";
           }
        }
    }
    @Override
    public void cadastrarExame() {
        super.cadastrarExame();
        String SQuantTriglicerideo = JOptionPane.showInputDialog("Digite a quantidade de Triglicerídeo:  ");
        this.quantTriglicerideo = Integer.parseInt(SQuantTriglicerideo);
        idade = 2023 - getAnoNascimento();
    }

    @Override
    public void mostrarResultado() {
        super.mostrarResultado();
        classificarTriglicerideo();
        JOptionPane.showMessageDialog(null, "Nome: " + getNome() +  "\nResultado Triglicerídeo: " + quantTriglicerideo + "\nClassificação Triglicerídeo: " + estadoClass);
    }
}   