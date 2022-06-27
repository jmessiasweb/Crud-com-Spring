package fundamentos.operadores;

public class Atribuicao {
    public static void main(String[] args) {

        int a = 3;
        int b = a;
        int c = a + b;

        // c = c + b;
        c += b;

        // c = c - a;
        c -= a;

        // c = c * b
        c *= b;

        // c = c / a;
        c /= a;

        System.out.println(c);

        // c = c % 2; 0 ou 1  (%(resto) operador de modulação)
        c %= 2;

        System.out.println(c);

    }
}
