package tech.devinhouse.aula04.heranca;

public class Principal {
    
    public static void main(String[] args) {
        
        Zebra zebra = new Zebra();
        zebra.setQuantidadeDeListras(30);

        zebra.setNome("Marty");
        zebra.falarMeuNome();

        System.out.println(zebra);

        Animal outraZebra = new Zebra();  // polimorfismo
        outraZebra.setNome("Zé");
        // outraZebra.setQuantidadeDeListras(50); // nao compila pq na classe Animal nao tem este atributo de qtd de listras

    }

}
