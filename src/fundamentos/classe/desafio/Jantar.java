package fundamentos.classe.desafio;

public class Jantar {

    public static void main(String[] args) {

        Comida c1 = new Comida("Arroz", 0.223);
        Comida c2 = new Comida("Feijao", 0.300);

        Pessoa p = new Pessoa("joao", 99.8);

        System.out.println(p.apresentar());
        p.comer(c1);

        System.out.println(p.apresentar());
        p.comer(c2);
    }
}