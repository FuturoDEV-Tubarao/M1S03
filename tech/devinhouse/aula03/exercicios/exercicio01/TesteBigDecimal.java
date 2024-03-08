package tech.devinhouse.aula03.exercicios.exercicio01;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TesteBigDecimal {

    public static void main(String[] args) {
        
        BigDecimal salario = BigDecimal.valueOf(20000.7858655874646);

        var constante = BigDecimal.TEN;

        Float valorFloat = 5000F;

        var resultado = salario.multiply(BigDecimal.valueOf(0.2043543523))
            .setScale(2, RoundingMode.HALF_UP);

        System.out.println(resultado);

    }
    
}
