package tech.devinhouse.aula04.pratica2;

public class Divisao implements Operacao {

    @Override
    public double calcular(double valor1, double valor2) {
        return valor1 / valor2;
    }

    @Override
    public String getDescricao() {
        return "Divisão";
    }
    
}
