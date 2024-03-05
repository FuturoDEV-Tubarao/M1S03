package tech.devinhouse;

public class Conta {

    //atributos

    private Cliente titular;

    private double saldo; 

    // metodos

    public double depositar(double valor) {
        saldo += valor;
        return saldo;
    }

    public double sacar(double valor) {
        saldo -= valor;
        return saldo;
    }


    // getters e setters 

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0D) {
            System.out.println("Valor informado é negativo, portanto invalido!");
            return;
        }
        this.saldo = saldo;
    }  

}
