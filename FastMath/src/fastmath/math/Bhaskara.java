package fastmath.math;

public class Bhaskara {

    private Double A;
    private Double B;
    private Double C;

    public Bhaskara(Double A, Double B, Double C){
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public Double getA() {
        return A;
    }

    public void setA(Double a) {
        A = a;
    }

    public Double getB() {
        return B;
    }

    public void setB(Double b) {
        B = b;
    }

    public Double getC() {
        return C;
    }

    public void setC(Double c) {
        C = c;
    }

    public double delta(){
        return Math.pow(B, 2) - 4 * A * C;
    }

    public double x1(){
        return (-B + Math.sqrt(delta())) / (2 * A);
    }

    public double x2(){
        return (-B - Math.sqrt(delta())) / (2 * A);
    }
}