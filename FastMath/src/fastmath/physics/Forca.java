package fastmath.physics;

public class Forca {

    private double massa;
    private double aceleracao;

    public Forca(double massa, double aceleracao){
        this.massa = massa;
        this.aceleracao = aceleracao;
    }

    public double getAceleracao() {
        return aceleracao;
    }

    public void setAceleracao(double aceleracao) {
        this.aceleracao = aceleracao;
    }

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public double calcularForca(){
        return massa * aceleracao;
    }
}
