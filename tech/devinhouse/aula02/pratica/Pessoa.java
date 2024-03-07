package tech.devinhouse.aula02.pratica;

public class Pessoa {

    private String nome;

    private String sobrenome;

    private Integer idade;  

    private String profissao;

    private boolean doadorDeOrgaos; 

    private float peso;


    public String obterNomeCompleto() {
        String nomeCompleto = nome + " " + sobrenome;
        return nomeCompleto;
    }

    public int obterIdadeEmMeses() {
       int idadeEmMeses = idade * 12;
       return idadeEmMeses;
    }


    public String toString() {
        return "Pessoa [nome=" + nome + ", sobrenome=" + sobrenome + 
            ", idade=" + idade + "]";
    }
        

     // getters / setters 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public boolean isDoadorDeOrgaos() {
        return doadorDeOrgaos;
    }

    public void setDoadorDeOrgaos(boolean doadorDeOrgaos) {
        this.doadorDeOrgaos = doadorDeOrgaos;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    } 

}
