/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package incrementodecremento;

/**
 *
 * @author thamires.conceicao
 */
public class IncrementoDecremento {

    /**
     * @param args the command line arguments
     * Crie uma variável “int numero” com o valor 5 e escreva esse o valor de “numero” na tela. Após incremente uma
unidade utilizando operadores unários e escreva o conteúdo atual de “numero” na tela
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 5;
        System.out.println(x);
        
        int valor = 5 + ++x;
        System.out.println(valor);
        //x++;
        //x --;
        System.out.println(x);
    }
    
}
