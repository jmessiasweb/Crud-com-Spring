package fundamentos.controle;

import java.util.Scanner;

public class DesafioSemana {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String dia = entrada.next();

        if ("segunda".equalsIgnoreCase(dia)){
            System.out.println("1");
        }else if ("terça".equalsIgnoreCase(dia)){
            System.out.println("2");
        }else if ("quarta".equalsIgnoreCase(dia)) {
            System.out.println("3");
        }else if ("quinta".equalsIgnoreCase(dia)) {
            System.out.println("4");
        }else if ("sexta".equalsIgnoreCase(dia)) {
            System.out.println("5");
        }else if ("sabado".equalsIgnoreCase(dia)) {
            System.out.println("6");
        }else if ("domingo".equalsIgnoreCase(dia)) {
            System.out.println("7");
        }

        entrada.close();

    }
}
