package tech.devinhouse.aula02.desafio;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {

        var personagem = new Personagem();

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a referência:");
        String referencia = scanner.nextLine();
        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        personagem.setNome(nome);
        personagem.setIdade(idade);
        personagem.setReferencia(referencia);
        personagem.setDataCadastramento(LocalDate.of(2023, Month.MARCH, 6));
        
        // imprimir nome em maiusculo
        System.out.println(personagem.obterNomeEmMaiusculo());
        // imprimir as 3 primeiras letras do nome
        System.out.println(personagem.obterTresPrimeirasLetrasDoNome());
        // imprimir dados do personagem
        System.out.println(personagem);
        
    }

}
