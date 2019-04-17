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
public class Caneta {
    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampa;

    public Caneta(String modelo, float ponta, String cor) {
        this.modelo = modelo;
        this.ponta = ponta;
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isTampa() {
        return tampa;
    }

    public void setTampa(boolean tampa) {
        this.tampa = tampa;
    }
    
    public void status (){
        System.out.println("Modelo da caneta: "+ this.getModelo());
        System.out.println("Tipo de ponta: "+ this.getPonta());
    }
}
