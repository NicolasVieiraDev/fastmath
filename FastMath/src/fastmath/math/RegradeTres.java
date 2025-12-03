package fastmath.math;

public class RegradeTres {

    private Integer A;
    private Integer B;
    private Integer C;

    public RegradeTres(Integer A, Integer B, Integer C){
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public Integer getA() {
        return A;
    }

    public void setA(Integer a) {
        A = a;
    }

    public Integer getB() {
        return B;
    }

    public void setB(Integer b) {
        B = b;
    }

    public Integer getC() {
        return C;
    }

    public void setC(Integer c) {
        C = c;
    }

    public double calcularDireta(){
        return (double) (B * C) / A;
    }

    public double calcularInversa(){
        return (double) (A * B) / C;
    }
}
