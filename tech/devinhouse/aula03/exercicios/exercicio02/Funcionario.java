package tech.devinhouse.aula03.exercicios.exercicio02;

public class Funcionario {
    
    private String nome;

    private Float salario;


    public Funcionario(String nome) {
        this.nome = nome;
    }

    public Funcionario(String nome, Float salario) {
        this(nome);
        // this.nome = nome;
        this.salario = salario;
    }

    
    public void aumentar(Float valor) {
        // this.salario = this.salario + valor;  // mesma coisa
        this.salario += valor;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

}
