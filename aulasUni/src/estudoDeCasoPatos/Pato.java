/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudoDeCasoPatos;

/**
 *
 * @author Usuário
 */
public abstract class Pato {
    protected Nado nado;
    
    protected Voo voo;
    
    public abstract void nadar();
    
    public abstract void voar();
    
    public void grasnar(){
        System.out.println("Grasnar");
    }
}
