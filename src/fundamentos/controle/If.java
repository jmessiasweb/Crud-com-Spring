package fundamentos.controle;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Infome a media: ");
        double media = entrada.nextDouble();

        if (media < 10 && media >= 7.0) {

            System.out.print("Aprovado!");
            System.out.print("Parabens!");
        }
        if (media < 7 && media > 4.5)
            System.out.print("Recuperação");
        boolean criterioReprovacaoAtigido =
                media < 4.5 && media >= 0;
        if(criterioReprovacaoAtigido){
            System.out.print("Reprovado");
        }

        System.out.print("Reprovado");

        entrada.close();
    }

}
