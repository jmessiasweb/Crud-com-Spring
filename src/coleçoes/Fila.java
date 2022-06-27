package coleçoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

//      offer e add -> adicionam elementos na fila
//      Diferença e o comportamento quando a fila esta cheia!

        fila.add("Ana");
        fila.offer("Bia"); // retorna fase
        fila.add("Carlos");  //Lnça uma exeção
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");

        /*
        peek e Element -> abter o proximos
        da fila (sem remover)
         */

        System.out.println(fila.peek());
        System.out.println(fila.element());

        /*
        poll e Remove -> obter o proximo elemento
        da fila e remove!
         */

        System.out.println(fila.poll());

         /*
        fila.size()
        fila.clear()
        fila.isEmpty()
        fila.contains(...)
         */

    }
}
