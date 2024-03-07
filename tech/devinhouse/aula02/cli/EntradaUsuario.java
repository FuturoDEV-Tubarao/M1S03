package tech.devinhouse.aula02.cli;

import java.util.Scanner;

public class EntradaUsuario {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu primeiro nome: ");
        String nome = scanner.next();
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("O nome informado foi " + nome + 
            " e a idade informada foi " + idade);

    }

}
