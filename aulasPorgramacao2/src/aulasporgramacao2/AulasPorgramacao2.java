package aulasporgramacao2;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class AulasPorgramacao2 {
    public static void main(String[] args) {
        
//        try{
//            int idade =  Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
//        } catch(NumberFormatException e){
//            JOptionPane.showMessageDialog(null, "O valor deve ser numérico!" + e.getLocalizedMessage());
//        }
          Produto p1 = new Produto(1l, "Computador", 1500);
          Produto p2 = new Produto(2l, "Mause", 1500);
          Produto p3 = new Produto(3l, "Teclado", 1500);

          List<Produto> produtos = new ArrayList<Produto>();
          
         produtos.add(p1);
         produtos.add(p2);
         produtos.add(p3);
         
         for(int i = 0; i < produtos.size(); i++){
            System.out.println("Nome " + i + ": " + produtos.get(i).getNome());
        }
         
         for(Produto p : produtos){
              System.out.println("Nome " + p.getNome());
         }
         
    }
    
}
