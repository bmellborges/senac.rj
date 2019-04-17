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
public class Conta {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
//construtor
    public Conta() {
        this.saldo = 0;
        this.status = false;
    }
    
    

    
//metodos
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
        }else{
            this.setSaldo(150);
        }
        System.out.println("Abertura de conta realizada com sucesso!");
    }
    public void fecharConta(){
        if (this.getSaldo()>0) {
            System.out.println("Erro.Saldo em conta");
        }else {
            if (this.getSaldo()<0) {
                System.out.println("Erro. Saldo negativo em conta.");
            }else{
                this.setStatus(false);
                System.out.println("Conta encerrada com sucesso.");
            }
        }
    }
    public void depositar (float v){
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo()+v);
            System.out.println("Depósito realizado em "+this.getDono());
        }else{
            System.out.println("Erro. Conta inválida.");
        }
    }
    public void sacar(float v){
        if (this.getStatus()) {
            if (this.getSaldo()>=v) {
                this.setSaldo(this.getSaldo()-v);
                System.out.println("Saque em nome de: "+this.getDono());
            }else{
                System.out.println("Saldo insuficiente");
            }
        }else {
            System.out.println("Erro. Conta encerrada");
        }
    }
    public void pagarMensal(){
        int v = 0;
        
        if (this.getTipo()=="CC") {
            v=12;
        }else{
            if (this.getTipo()== "CP") {
                v=20;
            }else{
                System.out.println("Erro desconhecido");
            }
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo()-v);
            System.out.println("Tarifa efetuada em nome de: "+this.getDono());
        }else{
            System.out.println("Erro.Conta desconhecida");
        }
    }

    //getter setter
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public boolean getStatus(){
        return status;
    }
    
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void estadoAtual(){
        System.out.println("");
        System.out.println("Conta: "+this.getNumConta());
        System.out.println("Tipo: "+this.getTipo());
        System.out.println("Dono: "+this.getDono());
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Status: "+this.getStatus());
    }
}
