package tech.devinhouse.aula03.exercicios.exercicio03;

import java.util.StringTokenizer;

public class Contador {

    private String frase;


    public Contador(String frase) {
        this.frase = frase;
    }


    // implementando usando o método 'split'
    public int contarPalavras() {
        String[] palavras = this.frase.split(" ");
        return palavras.length;
    }

    // implementando usando o 'StringTokenizer'
    public int contarPalavras2() {
        StringTokenizer tokenizer = new StringTokenizer(frase, " ");
        int quantidade = tokenizer.countTokens();
        return quantidade;
    }
   
}
