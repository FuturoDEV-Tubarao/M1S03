package tech.devinhouse.aula05.enumeracoes;

public class Principal {
    
    public static void main(String[] args) {
        
        Localizacao localizacao = new Localizacao();

        localizacao.setCidade("Tubarão");
        localizacao.setDirecao(PontoCardeal.NORTE);

        int ordinal = PontoCardeal.SUL.ordinal();

        PontoCardeal norte = PontoCardeal.valueOf("NORTE");

    }

}
