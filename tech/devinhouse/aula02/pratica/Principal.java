package tech.devinhouse.aula02.pratica;

public class Principal {
    
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("John");
        pessoa.setSobrenome("Snow");
        pessoa.setIdade(20);
        pessoa.setPeso(70.5F);
        pessoa.setProfissao("Analista");
        pessoa.setDoadorDeOrgaos(true);

        System.out.println(pessoa);
        String nomeCompleto = pessoa.obterNomeCompleto();
        System.out.println(nomeCompleto);
        System.out.println("Idade em meses = " + pessoa.obterIdadeEmMeses());


        System.out.println();
        System.out.println("-----------------");
        System.out.println();

        Calculadora calc = new Calculadora();
        int resultado = calc.somar(1, 2);
        System.out.println("O resultado é: " + resultado); // 3
        resultado = calc.subtrair(6, 2);
        System.out.println("O resultado é: " + resultado); // 4
        
    }

}
