package tech.devinhouse.aula02.construtores;

public class Principal {

    public static void main(String[] args) {
        
        Pessoa pessoa1 = new Pessoa();

        Pessoa pessoa2 = new Pessoa("tiago", 25, 123L);
        System.out.println(pessoa2);
        System.out.println("Data de Criacao: " + pessoa2.getDataCriacao());

    }
    
}
