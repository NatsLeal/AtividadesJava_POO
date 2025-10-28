public class Main {
    public static void main(String[] args) {

        // 1 - PessoaNome
        System.out.println("- Exercício 01 -");
        PessoaNome p1 = new PessoaNome("Natália");
        p1.apresentar();
        System.out.println();

        // 2 - Calculadora
        System.out.println("- Exercício 02 -");
        Calculadora calc = new Calculadora();
        System.out.println("Soma: " + calc.somar(5, 3));
        System.out.println("Subtração: " + calc.subtrair(5, 3));
        System.out.println();

        // 3 - NumeroDobro
        System.out.println("- Exercício 03 -");
        NumeroDobro num = new NumeroDobro(7);
        System.out.println("Dobro: " + num.dobro());
        System.out.println();

        // 4 - Verificador
        System.out.println("- Exercício 04 -");
        Verificador v = new Verificador();
        System.out.println("É par? " + v.ehPar(8));
        System.out.println();

        // 5 - Aluno
        System.out.println("- Exercício 05 -");
        Aluno aluno = new Aluno("João", 7.5, 8.0, 6.5);
        System.out.println("Média: " + aluno.calcularMedia());
        System.out.println();

        // 6 - Comparador
        System.out.println("- Exercício 06 -");
        Comparador comp = new Comparador();
        System.out.println("Maior: " + comp.maior(10, 5));
        System.out.println();

        // 7 - Tabuada
        System.out.println("- Exercício 07 -");
        Tabuada tab = new Tabuada();
        tab.imprimirTabuada(6);
        System.out.println();

        // 8 - MatematicaFatorial
        System.out.println("- Exercício 08 -");
        MatematicaFatorial matFat = new MatematicaFatorial();
        System.out.println("Fatorial de 5: " + matFat.fatorial(5));
        System.out.println();

        // 9 - PessoaIdade
        System.out.println("- Exercício 09 -");
        PessoaIdade p2 = new PessoaIdade(27);
        System.out.println("Maior de idade? " + p2.maiorDeIdade());
        System.out.println();

        // 10 - Conversor
        System.out.println("- Exercício 10 -");
        Conversor conv = new Conversor();
        System.out.println("30°C = " + conv.celsiusParaFahrenheit(30) + "°F");
        System.out.println();

        // 11 - Contador
        System.out.println("- Exercício 11 -");
        Contador cont = new Contador();
        System.out.println("Pares até 10: " + cont.contarPares(10));
        System.out.println();

        // 12 - NumeroPrimo
        System.out.println("- Exercício 12 -");
        NumeroPrimo primo = new NumeroPrimo();
        System.out.println("7 é primo? " + primo.ehPrimo(7));
        System.out.println();

        // 13 - MatematicaOperacoes (raiz quadrada)
        System.out.println("- Exercício 13 -");
        MatematicaOperacoes matOp = new MatematicaOperacoes();
        System.out.println("Raiz de 81: " + matOp.raizQuadrada(81));
        System.out.println();

        // 14 - MatematicaOperacoes (potência)
        System.out.println("- Exercício 14 -");
        System.out.println("2^5 = " + matOp.potencia(2, 5));
        System.out.println();

        // 15 - Sequencia (imprimir até N)
        System.out.println("- Exercício 15 -");
        Sequencia seq = new Sequencia();
        seq.imprimirAteN(5);
        System.out.println();

        // 16 - Sequencia (somar até N)
        System.out.println("- Exercício 16 -");
        System.out.println("Soma até 5: " + seq.somarAteN(5));
        System.out.println();

        // 17 - PessoaIMC
        System.out.println("- Exercício 17 -");
        PessoaIMC pessoaIMC = new PessoaIMC(85, 1.67);
        System.out.println("IMC: " + pessoaIMC.calcularIMC());
        System.out.println();

        // 18 - Comparador3
        System.out.println("- Exercício 18 -");
        Comparador3 comp3 = new Comparador3();
        System.out.println("Menor de (8, 3, 5): " + comp3.menorDeTres(8, 3, 5));
        System.out.println();

    }
}
