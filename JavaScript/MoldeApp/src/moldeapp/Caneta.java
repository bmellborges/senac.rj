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
public class Caneta {
     //atributos
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampa;
    
    //Métodos
    void print (){
        System.out.printf("\n\nModelo: "+ this.modelo);
        System.out.println("\nCor: "+ this.cor);
        System.out.println("Calibre: "+ this.ponta);
        System.out.println("Carga: "+ this.carga);
        //System.out.println("Possui tampa?"+ this.tampa);
    }
    
    void rabiscar(){
        System.out.print("Possui uma tampa própria?");
        if(this.tampa == false){
            System.out.println(" Não!");
        }else{
            System.out.println(" Sim!");
        }
    }
    void tampar(){
        this.tampa = true;
    }
    void destampar(){
        this.tampa = false;
    }
}//final classe
