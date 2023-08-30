/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudoDeCasoPatos;

/**
 *
 * @author Usuário
 */
public class PatoAmarelo extends Pato{

    public PatoAmarelo(){
        nado = new  NadoRapido();
        voo = new VooBaixo();
    }
    
    @Override
    public void nadar() {
      nado.nadar();
    }

    @Override
    public void voar() {
        voo.voar();
    }
    
}
