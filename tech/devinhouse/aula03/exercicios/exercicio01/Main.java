package tech.devinhouse.aula03.exercicios.exercicio01;

public class Main {
    
    public static void main(String[] args) {
        
        // isntanciei um objeto do tipo empregado
        Empregado empregado = new Empregado();
        empregado.setCpf(12345678901L);
        empregado.setNome("James Kirk");
        empregado.setSalario(20000F);

        // invoquei o método 'promover' para aumentar o salário
        empregado.promover(20);

        // imprimindo no console o salario reajustado para conferencia
        System.out.println("Salario reajustado = " + empregado.getSalario());
    }

}
