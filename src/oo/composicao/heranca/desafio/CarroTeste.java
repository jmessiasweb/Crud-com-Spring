package oo.composicao.heranca.desafio;


public class CarroTeste {
    public static void main(String[] args) {

        Carro c1 = new Civic();
        c1.acelera();


        System.out.println(c1);
        System.out.println(c1);
        System.out.println(c1);

        Carro c2 = new Ferrari(400);
        c2.acelera();
        c2.acelera();
        System.out.println(c2);

    }

}
