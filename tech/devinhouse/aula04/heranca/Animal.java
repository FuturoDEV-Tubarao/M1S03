package tech.devinhouse.aula04.heranca;

public class Animal {

    private String nome;


    public String falarMeuNome() {
        return "meu nome eh " + nome;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    

}
