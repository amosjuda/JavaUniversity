package aulasuni;

import javax.swing.JOptionPane;

public class AulasUni {
    
    public static void main(String[] args) {
        
        String ageStyring = JOptionPane.showInputDialog("Enter the your age");
        // (Integer.parseInt(ageStyring)) transform string in int
        int age = Integer.parseInt(ageStyring);
        
        double price = Double.parseDouble(JOptionPane.showInputDialog("Enter the product price"));
        
        JOptionPane.showMessageDialog(null, "The age entered was " + age);
        
        if(age >= 18){
            JOptionPane.showMessageDialog(null, "Is of legal age");
        } else {
            JOptionPane.showMessageDialog(null, "Is underage");
        }
        
        int cont = 0;
        while(cont < 100){
            System.out.println("Infinity repeat");
            // corriged error cont += 1;
        }
        
//        System.out.print("hello world");
//        
//        int number = 10;
//        
//        String word = "Text";
//        
//        System.out.println(word);
//        
//        JOptionPane.showMessageDialog(null, "hello world !!!");
//        
//        String name = JOptionPane.showInputDialog("Enter your name");
//        
//        JOptionPane.showMessageDialog(null, "The name entered was " + name);
//        
//        if(number >= 18){
//            JOptionPane.showMessageDialog(null, "Is of legal age");
//        } else {
//            JOptionPane.showMessageDialog(null, "Is underage");
//        }
//        
//        for(int i = 0; i < 10; i++){
//            System.out.println("In the for");
//        }
    }
}