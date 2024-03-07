package tech.devinhouse.aula02.cli;

import java.time.LocalDateTime;

public class ContaBancaria {

    private String nomeBanco;

    private Integer agencia;

    private String conta;

    private float saldo;

    private Cliente cliente;

    private LocalDateTime dataCriacao;


    public ContaBancaria() {
        this.dataCriacao = LocalDateTime.now();

    }

    public ContaBancaria(String nomeBanco, Integer agencia, String conta, 
            float saldo, Cliente cliente) {
        this();
        this.nomeBanco = nomeBanco;
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public ContaBancaria(String nomeBanco, Integer agencia, String conta, 
            float saldo, Cliente cliente, LocalDateTime dataCriacao) {
        this.nomeBanco = nomeBanco;
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
        this.cliente = cliente;
        this.dataCriacao = dataCriacao;
    }




    public void sacar(float valor) {
        var novoSaldo = this.saldo - valor;
        this.saldo = novoSaldo;
    }

    
    @Override
    public String toString() {
        return "ContaBancaria [nomeBanco=" + nomeBanco + ", agencia=" + agencia + ", conta=" + conta + "]";
    }


    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public Integer getAgencia() {
        return agencia;
    }

    public void setAgencia(Integer agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
        
}
