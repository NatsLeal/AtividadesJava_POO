public class Comparador3 {
    public int menorDeTres(int a, int b, int c) {
        int menor = a;
        if (b < menor) menor = b;
        if (c < menor) menor = c;
        return menor;
    }
}
