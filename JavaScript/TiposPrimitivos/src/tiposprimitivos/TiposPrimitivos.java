/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author thamires.conceicao
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Variáveis
        
        //objetos
        Scanner teclado = new Scanner(System.in);
       //Entradas
        System.out.print("Digite o seu nome: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota: ");
        float nota = teclado.nextFloat();
        //saídas
        System.out.printf("A nota é: %.2f", nota);
        System.out.printf(" e seu nome é: %s\n",nome);    
        
        
        
             
    }
    
}

/*Linguagem C

#include stdio.h;

float  nota;
string nome;

printf("Digite a nota: ");
scanf("%d",&nota);

printf("digite seu nome");
scanf("%s",&nome)*/


printf("Seu nome é %.2f e seu nome %s: ",nota,nome);