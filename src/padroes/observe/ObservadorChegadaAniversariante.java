package padroes.observe;

import padroes.observe.EventoChegadoAniversariante;

@FunctionalInterface
public interface ObservadorChegadaAniversariante {

   public void chegou(EventoChegadoAniversariante evento);
}
