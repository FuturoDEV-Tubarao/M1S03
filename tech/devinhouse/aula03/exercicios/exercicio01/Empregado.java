package tech.devinhouse.aula03.exercicios.exercicio01;

public class Empregado {

    private Long cpf;

    private String nome;

    private Float salario;


    public void promover(float percentual) {
        var percentualFracionario = percentual / 100;
        var valorParaAumentar = this.salario * percentualFracionario;
        this.salario += valorParaAumentar;
    }


    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
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
