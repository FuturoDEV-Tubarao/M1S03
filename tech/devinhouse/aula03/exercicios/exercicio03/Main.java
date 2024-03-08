package tech.devinhouse.aula03.exercicios.exercicio03;

public class Main {
    
    public static void main(String[] args) {
    
        String frase = "Futuro Dev Tubarão";
        Contador contador = new Contador(frase);
        int qtd = contador.contarPalavras();
        System.out.println("A quantidade de palavras da frase é " + qtd);

        contador = new Contador("Toca no Calleri que é gol");
        qtd = contador.contarPalavras2();
        System.out.println("A quantidade de palavras da frase é " + qtd);

    }

}
