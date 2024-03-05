public class Cliente {

    private String nome;

    private String sobrenome; 

    private Long cpf;    


    public String criarNomeCompleto() {
        return nome + " " + sobrenome;
    }

    // getters and setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome.toUpperCase();
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }
    
}
