package padroes;

import padroes.observe.EventoChegadoAniversariante;
import padroes.observe.ObservadorChegadaAniversariante;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {

     private List<ObservadorChegadaAniversariante> observadores = new ArrayList<>();

     public void resgistrarObservador(ObservadorChegadaAniversariante observador) {

         observadores.add(observador);
     }
     public void monitora() {
         Scanner entrada = new Scanner(System.in);

         String valor = "";
                 while("sair".equalsIgnoreCase(valor)) {
                     System.out.println("Aniversariante chegou? ");
                     valor = entrada.nextLine();
                     if ("sim".equalsIgnoreCase(valor)) {
                         // Criar o evento
                         EventoChegadoAniversariante evento = new EventoChegadoAniversariante(new Date());
                         // notificar os observadores!
                         observadores.stream()
                                 .forEach(o -> o.chegou(evento));
                            valor = "sair";
                     } else {
                         System.out.println("Alarme falso!");
                     }
                 }
                 entrada.close();
     }
}
