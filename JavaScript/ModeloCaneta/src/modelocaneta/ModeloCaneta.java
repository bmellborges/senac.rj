/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelocaneta;

/**
 *
 * @author 39121742018.2
 */
public class ModeloCaneta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Caneta model01 = new Caneta ("Bic",0.5f,"Quatro cores");
        model01.status();
        
        Caneta model02 = new Caneta ("Fabe Castel",1.5f,"Preta");
        model02.status();
        
    }
    
}
