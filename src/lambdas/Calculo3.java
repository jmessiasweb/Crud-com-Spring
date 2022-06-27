package lambdas;

import java.util.function.BinaryOperator;

public class Calculo3 {
    public static void main(String[] args) {

        BinaryOperator<Double> soma = (x, y) -> { return x + y; };
        System.out.println(soma.apply(3.0, 5.0));

        soma = (x, y) -> x * y;
        System.out.println(soma.apply(2.0, 5.0));

        BinaryOperator<Integer> soma1 = (x, y) -> { return x + y; };
        System.out.println(soma1.apply(3, 5));

        soma1 = (x, y) -> x * y;
        System.out.println(soma1.apply(2, 5));
    }
}
