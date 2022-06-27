package generics;

public class PoresTeste {
    public static void main(String[] args) {

        Pares<Integer, String> resultadoConcurso = new Pares<>();

        resultadoConcurso.adcionar(1, "Maria");
        resultadoConcurso.adcionar(2, "Pedro");
        resultadoConcurso.adcionar(3, "Gui");
        resultadoConcurso.adcionar(4, "Ana");
        resultadoConcurso.adcionar(2, "Rebeca");

        System.out.println(resultadoConcurso.getValor(1));
        System.out.println(resultadoConcurso.getValor(4));
        System.out.println(resultadoConcurso.getValor(2));
    }
}
