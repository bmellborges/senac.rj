/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresunarios;

import static java.lang.Math.floor;

/**
 *
 * @author thamires.conceicao
 */
public class OperadoresUnarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float valor = 8.5f;
        
        //int valorarredondado = (int) Math.floor(valor);
        //int valorarredondado = (int) Math.ceil(valor);
        int valorarredondado = (int) Math.round(valor);
        System.out.println(valorarredondado);
    }
    
}
