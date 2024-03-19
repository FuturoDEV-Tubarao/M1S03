package tech.devinhouse.aula04.pratica2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {    

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o primeiro valor: ");
            double valor1 = scanner.nextDouble();
    
            System.out.print("Digite o segundo valor: ");
            double valor2 = scanner.nextDouble();

            System.out.println();  // pulando uma linha no console
    
            System.out.println("Informe a operação desejada: ");
            System.out.println("1 - Adição, 2 - Subtração, 3 - Multiplicação, 4 - Divisão");
            int codigoOperacao = scanner.nextInt();
    
            Operacao operacao;  // polimorfismo 
            if (codigoOperacao == 1)
                operacao = new Adicao();
            else if (codigoOperacao == 2)
                operacao = new Subtracao();
            else if (codigoOperacao == 3)
                operacao = new Multiplicacao();
            else
                operacao = new Divisao();

            if (valor2 == 0 && operacao.getDescricao().equals("Divisão"))
                throw new CalculadoraException("Vai causar divisao por zero");
            
            double resultado = operacao.calcular(valor1, valor2);
            System.out.println("O resultado da operação " + operacao.getDescricao() + 
                " é " + resultado);
        } catch (InputMismatchException e) {   // unchecked 
            System.out.println("Você entrou com um valor não numérico!!!");
        } catch (CalculadoraException e) {     // checked
            System.out.println( e.getMessage() );
        }
       
    }

}
