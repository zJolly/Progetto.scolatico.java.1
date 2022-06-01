package com.mycompany.progcontospeciale;

class ContoCorrente{
    private double saldo;
    
    public void versa(double importo){
        saldo += importo;
    }
    
    public void preleva(double importo){
        saldo -= importo;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public double getSaldo(){return saldo;}

    public void stampaSaldo(){
        System.out.println("Saldo: " + saldo);
    }
}