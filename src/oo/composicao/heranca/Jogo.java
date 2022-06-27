package oo.composicao.heranca;

public class Jogo {
    public static void main(String[] args) {

        Montro montro = new Montro();
        montro.x = 10;
        montro.y = 10;

        Heroi heroi = new Heroi(10, 11);
//        heroi.x = 10;
//        heroi.y = 11;


        System.out.println("Mostro tem => " + montro.vida);
        System.out.println("Heroi tem => " + heroi.vida);

        montro.atacar(heroi);
        heroi.atacar(montro);
        System.out.println("Mostro tem => " + montro.vida);
        System.out.println("Heroi tem => " + heroi.vida);





    }

}
