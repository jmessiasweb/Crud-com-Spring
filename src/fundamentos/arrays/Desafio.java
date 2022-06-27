package fundamentos.arrays;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantas notas: ");

        int qtNotas = entrada.nextInt();

        double[] notas = new double[qtNotas];

        for (int i = 0; i < notas.length; i++){
            System.out.println("Informe a nota" + i + i + ":");
            notas[i] = entrada.nextDouble();
        }

        double total = 0;
        for (double nota: notas){
            total += nota;
        }
        double media = total / notas.length;
        System.out.println("A media e " + media + "!");

        entrada.close();
    }
}
