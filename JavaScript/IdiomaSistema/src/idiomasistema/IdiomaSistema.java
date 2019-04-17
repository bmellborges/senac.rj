/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idiomasistema;

import java.util.Locale;

/**
 *
 * @author thamires.conceicao
 */
public class IdiomaSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Localiza o idioma do computador
        Locale loc = Locale.getDefault();// Declaraçã de variavel e atribuição de valor a mesma
        System.out.println("Idioma utilizado no computador é: ");
        System.out.println(loc.getDisplayLanguage());//exibe idioma do monitor
        System.out.println("Podendo ser exibido pelo sistema no seguinte formato abreviado: ");
        System.out.println(loc.getLanguage());//exibe idioma do sistema
    }
    
}
