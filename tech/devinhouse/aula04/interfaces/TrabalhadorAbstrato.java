package tech.devinhouse.aula04.interfaces;

public abstract class TrabalhadorAbstrato {

    private String nome;

    public void fazerCoisas() {
        System.out.println("fix coisas");
    }

    public abstract void fazerOutrasCoisas();
    
}
