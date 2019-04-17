/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testetipos;

/**
 *
 * @author thamires.conceicao
 */
public class TesteTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Converta a String 30.5 em um valor real que seja exibido com duas casas decimais.
        
        String valor = "30.5";
        float real = Float.parseFloat(valor);//Float é 32 bits
        //double real = Double.parseDouble(valor); //Double é 64 bits, mais precosão e ocupa mais espaço.
        System.out.printf("%.2f \n",real);
        
    }
    
}
