package fundamentos.controle;

import javax.swing.*;

public class IfEse {
    public static void main(String[] args) {

        String valor = JOptionPane.showInputDialog("Informe o numero");
        int numero = Integer.parseInt(valor);

        if (numero % 2 == 0) {
            System.out.println("Numero par!");
        } else {
            System.out.println("Numero impar!");
        }
    }
}