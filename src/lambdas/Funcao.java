package lambdas;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {
        Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "par" : "impar";
        System.out.println(parOuImpar.apply(32));

        Function<String, String> oResultadoE = valor -> "Ovalor e: " + valor;

        Function<String, String> empolgado = valor -> valor + "!!!";

        String resultadoFinal =  parOuImpar.andThen(oResultadoE).andThen(empolgado).apply(32);

        System.out.println(resultadoFinal);
    }
}
