/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelobanco;

/**
 *
 * @author 39121742018.2
 */
public class ModeloBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conta perfil01 = new Conta();
        
        perfil01.setNumConta(1111);
        perfil01.setDono("Teotônio");
        perfil01.estadoAtual();
    }
    
}
