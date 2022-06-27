import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        String dias = dia(1, 2, 3);
        System.out.println(dias);

    }

    public static String dia(int dia1, int dia2, int dia3) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o dia: ");

        int dia = entrada.nextInt();

        if (1 == dia) {
            dia = dia1;
            System.out.println("Bom dia");
        } else if (2 == dia) {
            dia = dia2;
            System.out.println("Boa tarde");
        } else if (3 == dia) {
            dia = dia3;
            System.out.println("Boa tarde");
        }
        return "Valor de entrada invalido";
    }
}


