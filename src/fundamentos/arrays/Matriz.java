package fundamentos.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos aluno?");
        int qtdeAlunos = entrada.nextInt();

        System.out.println("Quantas notas por aluno?");
        int qtdeNotas = entrada.nextInt();

        double[][] notaDaTurma = new double[qtdeAlunos][qtdeNotas];

        double total = 0;
        for (int a = 0; a < notaDaTurma.length; a++){
            for (int n = 0; n <notaDaTurma[a].length; n++){
                System.out.printf("Informe a nota %d do aluno %d: ", n + 1, a + 1 );
                notaDaTurma[a][n] = entrada.nextDouble();
                total += notaDaTurma[a][n];
            }
        }
        double media = total / (qtdeAlunos * qtdeNotas);
        System.out.println("Media da turma e: " + media);

        for (double[] notasDoAluno: notaDaTurma) {
            System.out.println(Arrays.toString(notasDoAluno));
        }

        entrada.close();
    }
}
