package fundamentos.classe;

public class AreaCirTeste {

    public static void main(String[] args) {

        AreaCirc a1 = new AreaCirc(10);
        a1.pi = 3.14;
        System.out.println(a1.area());

        AreaCirc a2 = new AreaCirc(5);
        a1.pi = 3.14;
        System.out.println(a2.area());

    }
}
