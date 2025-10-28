public class PessoaIMC {
    private double peso;
    private double altura;

    public PessoaIMC(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }
}
