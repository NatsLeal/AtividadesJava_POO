public class PessoaNome {
    private String nome;

    public PessoaNome(String nome) {
        this.nome = nome;
    }

    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome);
    }
}
