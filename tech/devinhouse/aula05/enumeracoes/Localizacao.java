package tech.devinhouse.aula05.enumeracoes;

public class Localizacao {
    
    private float latitude;
    
    private float longitude;

    private String cidade;

    private PontoCardeal direcao;   // norte, sul, leste , oeste


    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setDirecao(PontoCardeal direcao) {
        this.direcao = direcao;
    }

    public PontoCardeal getDirecao() {
        return direcao;
    }
    
}
