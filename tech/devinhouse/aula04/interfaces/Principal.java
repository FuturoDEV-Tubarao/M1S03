package tech.devinhouse.aula04.interfaces;

import tech.devinhouse.aula04.heranca.EstagiarioHomeOffice;

public class Principal {
    
    public static void main(String[] args) {
    
        Trabalhador trabalhador;  // polimorfismo
        String tipo = "home-office";
        String subtipo = "estagiario";

        if (tipo.equals("presencial")) {
            trabalhador = new FuncionarioPresencial();
        } else {
            if (subtipo.equals("estagiario"))
                trabalhador = new EstagiarioHomeOffice();
            else
                trabalhador = new FuncionarioHomeOffice();
        }

        trabalhador.baterPonto();  // definido somente em tempo de execucao

    }

}
