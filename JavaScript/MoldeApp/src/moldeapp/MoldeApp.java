/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moldeapp;

/**
 *
 * @author 39121742018.2
 */
public class MoldeApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //CHamada de classe, criando novo objeto a partir do molde da classe
        Caneta model01 = new Caneta();
        
        //Atirbutos da Classe
        model01.modelo = "Bic";
        model01.cor = "Azul";
        model01.ponta = 0.5f;
        model01.carga = 0;
        model01.tampa =  false;
        model01.print();
        
        
        //instancia da classe Caneta
        Caneta model02 = new Caneta();
        
        //Atirbutos da Classe
        model01.modelo = "Bicaio";
        model01.cor = "Azulado";
        model01.ponta = 0.7f;
        model01.carga = 10000;
        model01.tampa =  true;
        model01.print();
        model01.rabiscar();
        model01.tampar();
    }
    
}
