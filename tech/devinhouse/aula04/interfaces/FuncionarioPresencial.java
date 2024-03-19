package tech.devinhouse.aula04.interfaces;

public class FuncionarioPresencial implements Trabalhador {

    @Override
    public void baterPonto() {
        System.out.println("Bateu ponto via biometria!");;
    }
    
}
