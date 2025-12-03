package fastmath.physics;

public class Energia {

    private double massa;
    private double velocidade;
    private double altura;
    private double gravidade = 9.8;

    public Energia(double massa, double altura, double gravidade){
        this.massa = massa;
        this.altura = altura;
        this.gravidade = gravidade;
    }

    public Energia(double massa, double velocidade){
        this.massa = massa;
        this.velocidade = velocidade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getGravidade() {
        return gravidade;
    }

    public void setGravidade(double gravidade) {
        this.gravidade = gravidade;
    }

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public double calcularEnergiaCinetica(){
        return (massa * Math.pow(velocidade, 2)) / 2;
    }

    public double calcularEnergiaPotencial(){
        return massa * gravidade * altura;
    }
}
