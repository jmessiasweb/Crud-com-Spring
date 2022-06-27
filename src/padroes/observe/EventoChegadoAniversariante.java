package padroes.observe;

import java.util.Date;

public class EventoChegadoAniversariante {

    private final Date momento;

    public EventoChegadoAniversariante(Date momento) {
        this.momento = momento;
    }
    public Date getMomento() {
        return momento;
    }
}
