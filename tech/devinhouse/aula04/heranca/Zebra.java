package tech.devinhouse.aula04.heranca;

public class Zebra extends Animal {
    
    private int quantidadeDeListras;


    public int getQuantidadeDeListras() {
        return quantidadeDeListras;
    }

    public void setQuantidadeDeListras(int quantidadeDeListras) {
        this.quantidadeDeListras = quantidadeDeListras;
    }

    @Override
    public String toString() {
        return "Zebra [nome="+ this.getNome() + " quantidadeDeListras=" + quantidadeDeListras + "]";
    }
    
}
