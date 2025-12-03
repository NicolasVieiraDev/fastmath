package fastmath.math;

public class Porcentagem {

    private Double valorBase;
    private Double porcentagem;

    public Porcentagem(Double valorBase, Double porcentagem){
        this.valorBase = valorBase;
        this.porcentagem = porcentagem;
    }

    public Double getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(Double porcentagem) {
        this.porcentagem = porcentagem;
    }

    public Double getValorBase() {
        return valorBase;
    }

    public void setValorBase(Double valorBase) {
        this.valorBase = valorBase;
    }

    public double calcularPorcentagem(){
        return valorBase * (porcentagem / 100);
    }

    public double calcularAumento(){
        return valorBase + (valorBase * (porcentagem /100));
    }

    public double calcularDesconto(){
        return valorBase - (valorBase * (porcentagem / 100));
    }

    public double calcularPercentualDe(double valor){
       return (valor / valorBase) * 100;
    }

    public double calcularVariacaoPercentual(double novoValor){
        return ((novoValor - valorBase) / valorBase) * 100;
    }
}
