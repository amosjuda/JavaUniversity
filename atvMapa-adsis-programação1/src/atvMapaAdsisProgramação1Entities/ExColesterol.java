package atvMapaAdsisProgramação1Entities;

import javax.swing.JOptionPane;

public class ExColesterol extends Exames{
    private int LDL;
    private int HDL;
    
    private String risco;
    private String LDLclass;
    private String HDLclass;
    private int idade;
   
    public void classificarColesterolLDL(){
        if(risco.charAt(0) == 'B'){
            if(LDL > 100){
                LDLclass = "LDL BOM";
            } else {
                LDLclass = "LDL RUIM";
            }
        } 
        if(risco.charAt(0) == 'M'){
            if(LDL > 70){
                LDLclass = "LDL BOM";
            } else {
                LDLclass = "LDL RUIM";
            }
        }
        if(risco.charAt(0) == 'A'){
            if(LDL > 50){
                LDLclass = "LDL BOM";
            } else {
                LDLclass = "LDL RUIM";
            }
        }
    }
    
    public void classificarColesterolHDL(){
        if(idade <= 19){
           if(HDL > 45){
               HDLclass = "HDL BOM";
           } else {
                HDLclass = "HDL RUIM";
           }
        }
        if(idade >= 20){
            if(HDL > 40){
                HDLclass = "HDL BOM";
           } else {
                HDLclass = "HDL RUIM";
           }
        }
    }
    
    @Override
    public void cadastrarExame() {
        super.cadastrarExame();
        String SLDL = JOptionPane.showInputDialog("Digite a quantidade de LDL:  ");
        this.LDL = Integer.parseInt(SLDL);
        this.risco = JOptionPane.showInputDialog("Digite o risco (A - Alto, M - Médio, B - Baixo):  ");
        String SHDL = JOptionPane.showInputDialog("Digite a quantidade de HDL:  ");
        this.HDL = Integer.parseInt(SHDL);
        idade = 2023 - getAnoNascimento();
    }
    
    @Override
    public void mostrarResultado() {
        super.mostrarResultado();
        JOptionPane.showMessageDialog(null, "Nome: " + getNome() +  "\nResultado LDL: " + LDL +"\nResultado HDL: " + HDL + "\nResultado de risco: " + risco +"\nClassificação: " + LDLclass+ "\n" + HDLclass);
    }
}