package padroes.observe;

import padroes.Porteiro;

public class AniversarioSupresa {
    public static void main(String[] args) {

        Porteiro porteiro = new Porteiro();

        Namorada namorada = new Namorada();
        porteiro.resgistrarObservador(namorada);

        porteiro.resgistrarObservador(e -> {
            System.out.println("Supresa via lambda!");
            System.out.println("Ocoreu em: " + e.getMomento());
        });
        porteiro.monitora();
    }
}
