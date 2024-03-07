package tech.devinhouse.aula02.finals;

public class Principal {
    
    public static void main(String[] args) {
        
        final Integer idade = 20;
        System.out.println(idade);
        // idade = 30; // nao compila pq idade é final
        // System.out.println(idade);

    }

}
