package tech.devinhouse.aula02.cli;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        // usando construtor padrao/default
        // Cliente cliente = new Cliente();
        //   cliente.setNome("John Snow");
        //   cliente.setIdade(25);
        //   cliente.setProfissao("Vigilante");

        // usando um construtor que recebe os parametros
        Cliente cliente = new Cliente("John Snow", 25, "Vigilante");
        
        // criando um obj de conta bancaria
        LocalDateTime dataDeCriacao = LocalDateTime.of(2022, Month.JULY, 30, 
            10, 0, 0);
        ContaBancaria contaBancaria = new ContaBancaria("Banco Bamerindus", 123, "987X", 
            1000F, cliente, dataDeCriacao);

        // imprimindo nome em maiusculo
        System.out.println(cliente.obterNomeEmMaiusculo());

        // imprimindo dados do cliente
        System.out.println(cliente.obterDadosFormatados());

        System.out.println("Informe o valor do saque: ");

        Scanner scanner = new Scanner(System.in);
        float valor = scanner.nextFloat();
        contaBancaria.sacar(valor);
        var saldoAtual = contaBancaria.getSaldo();

        System.out.println("Saque realizado! Saldo atual = " + saldoAtual);

    }

}
