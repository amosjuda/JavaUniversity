package atv1.adsis.programação1;

import javax.swing.JOptionPane;

public class Rota {
    public void planejarDia(){

        double kmTotal =  0;
        double quantidadeCombus;
        double valorTotal;
        
        String quantRotasS = JOptionPane.showInputDialog("Digite a quantidade de rotas do dia: ");
        int quantRotas = Integer.parseInt(quantRotasS);
        
        for(int i = 1; i <= quantRotas; i++){
            String quilometragemRS = JOptionPane.showInputDialog("Digite a quilometragem da rota "+ i + " :");
            double quilometragemR = Double.parseDouble( quilometragemRS);
            kmTotal += quilometragemR;
        }
        quantidadeCombus = kmTotal / 2.5;

         String valorOleoS = JOptionPane.showInputDialog("Digite o valor do óleo diesel: ");
         double valorOleo = Double.parseDouble( valorOleoS);
         
         valorTotal = quantidadeCombus * valorOleo;
         JOptionPane.showMessageDialog(null,"Total de km rodados: "+ kmTotal +"\nTotal de combustível: "+quantidadeCombus+"\nValor desembolsado: "+valorTotal);
    }
}
