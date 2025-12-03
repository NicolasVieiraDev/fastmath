package fastmath.physics;

public class Mruv {

    private double velocidadeInicial;
    private double velocidadeFinal;
    private double aceleracao;
    private double tempo;
    private double deslocamento;
    private double posicaoInicial;
    private double posicaoFinal;

    public Mruv(Double velocidadeInicial, Double velocidadeFinal, Double aceleracao,
                Double tempo, Double deslocamento) {
        this.velocidadeInicial = velocidadeInicial;
        this.velocidadeFinal = velocidadeFinal;
        this.aceleracao = aceleracao;
        this.tempo = tempo;
        this.deslocamento = deslocamento;
    }

    public Mruv(Double velocidadeInicial, Double aceleracao, Double tempo) {
        this.velocidadeInicial = velocidadeInicial;
        this.aceleracao = aceleracao;
        this.tempo = tempo;
    }

    public double getAceleracao() {
        return aceleracao;
    }

    public void setAceleracao(double aceleracao) {
        this.aceleracao = aceleracao;
    }

    public double getDeslocamento() {
        return deslocamento;
    }

    public void setDeslocamento(double deslocamento) {
        this.deslocamento = deslocamento;
    }

    public double getPosicaoFinal() {
        return posicaoFinal;
    }

    public void setPosicaoFinal(double posicaoFinal) {
        this.posicaoFinal = posicaoFinal;
    }

    public double getPosicaoInicial() {
        return posicaoInicial;
    }

    public void setPosicaoInicial(double posicaoInicial) {
        this.posicaoInicial = posicaoInicial;
    }

    public double getTempo() {
        return tempo;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }

    public double getVelocidadeFinal() {
        return velocidadeFinal;
    }

    public void setVelocidadeFinal(double velocidadeFinal) {
        this.velocidadeFinal = velocidadeFinal;
    }

    public double getVelocidadeInicial() {
        return velocidadeInicial;
    }

    public void setVelocidadeInicial(double velocidadeInicial) {
        this.velocidadeInicial = velocidadeInicial;
    }

    public double calcularVelocidadeFinal(){
        return velocidadeInicial + aceleracao * tempo;
    }

    public double calcularAceleracao(){
        return (velocidadeFinal - velocidadeInicial) / tempo;
    }

    public double calcularDeslocamento(double deltaS){
        deltaS = velocidadeInicial * tempo + (aceleracao * Math.pow(tempo, 2)) / 2;
        return deltaS;
    }

    public double calcularTorricelli(double deltaS){
        deltaS = calcularAceleracao();
        return Math.sqrt(Math.pow(velocidadeInicial, 2) + 2 * aceleracao * deltaS);
    }
}
