package tech.devinhouse.aula01;

public class Principal {

    public static void main(String[] args) {

        Cliente johnSnow = new Cliente();
        johnSnow.setNome("John");
        johnSnow.setSobrenome("Snow");
        johnSnow.setCpf(12345678901L);
        johnSnow.criarNomeCompleto();

        Conta conta1 = new Conta();
        conta1.setSaldo(1000D);
        conta1.setTitular(johnSnow);

        System.out.println(conta1.getTitular().getNome()); // john
    
    }

}
