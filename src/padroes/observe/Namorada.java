package padroes.observe;

public class Namorada implements ObservadorChegadaAniversariante {

    @Override
    public void chegou(EventoChegadoAniversariante evento) {

        System.out.println("Avisar os convidados");
        System.out.println("Apagar as luzes");
        System.out.println("Esperar um pouco");
        System.out.println("e... supresa!!!");
    }
}