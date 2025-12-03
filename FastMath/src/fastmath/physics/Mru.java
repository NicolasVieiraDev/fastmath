package fastmath.physics;

public class Mru {

    private double distancia;
    private double velocidade;
    private double tempo;

    public Mru(double distancia, double tempo, double velocidade) {
        this.distancia = distancia;
        this.tempo = tempo;
        this.velocidade = velocidade;
    }

    public Mru(double distancia, double tempo) {
        this.distancia = distancia;
        this.tempo = tempo;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getTempo() {
        return tempo;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public double calcularVelocidade(){
        return distancia / tempo;
    }

    public double calcularDistancia(){
        return velocidade * tempo;
    }

    public double calcularTempo(){
        return distancia/ tempo;
    }
}
