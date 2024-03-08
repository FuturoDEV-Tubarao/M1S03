package tech.devinhouse.aula03.exercicios.exercicio02;

public class Main {
    
    public static void main(String[] args) {
    
        var funcionario1 = new Funcionario("Ragnar");
        System.out.println(funcionario1.getNome());
        System.out.println(funcionario1.getSalario());  // null
        funcionario1.setSalario(10000F);
        
        var funcionario2 = new Funcionario("Spock", 150000F);
        System.out.println(funcionario2.getNome());
        System.out.println(funcionario2.getSalario());

    }

}
