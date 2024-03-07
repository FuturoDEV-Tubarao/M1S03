package tech.devinhouse.aula02.statics;

import java.time.LocalDateTime;

public class Principal {
    
    public static void main(String[] args) {

        int max = Math.max(18, 25);
        System.out.println(max);

        var agora = LocalDateTime.now();
        System.out.println(agora);

        int soma = Calculadora.somar(50, 80);
        System.out.println("Soma = " + soma);
        
    }

}
