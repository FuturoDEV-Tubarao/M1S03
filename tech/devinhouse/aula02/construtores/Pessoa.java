package tech.devinhouse.aula02.construtores;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Pessoa {
    
   private String nome;
   private Integer idade;
   private Long cpf;
   private Boolean doador;
   private LocalDate dataDeNascimento;
   private LocalDateTime dataCriacao;


   public Pessoa() {
    this.dataCriacao = LocalDateTime.now(); // data e hora atual 
   }

   public Pessoa(String nome, Integer idade) {
    this();
    this.nome = nome;
    this.idade = idade;
   }

   public Pessoa(String nome, Integer idade, Long cpf) {
    this(nome, idade);
    this.cpf = cpf;
   }

   public Pessoa(String nome, Integer idade, Long cpf, Boolean doador, LocalDate dataDeNascimento,
        LocalDateTime dataCriacao) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.doador = doador;
        this.dataDeNascimento = dataDeNascimento;
        this.dataCriacao = dataCriacao;
    }

    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + ", cpf=" + cpf + "]";
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getIdade() {
        return idade;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    public Long getCpf() {
        return cpf;
    }
    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }
    public Boolean getDoador() {
        return doador;
    }
    public void setDoador(Boolean doador) {
        this.doador = doador;
    }
    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }
    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }
    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
    
}
