package fundamentos.operadores;

public class DesafioLogicos {
    public static void main(String[] args) {
        // trabalho na terça (v ou f)
        // trabalho na quinta (v ou f)

        boolean trabalho1 = true;
        boolean trabalho2 = false;

        boolean comprouTv50 = trabalho1 && trabalho2;
        boolean comprouTv32 = trabalho1 ^ trabalho2;
        boolean comprouSorvete =trabalho1 || trabalho2;
        //Operador Unario!
        boolean maisSaudavel = !comprouSorvete;


        System.out.println("comprou Tv 50\"?" + comprouTv50);
        System.out.println("comprou tv 32\"?" +comprouTv32);
        System.out.println("Comprou tv 32\"Sorvete?" + comprouSorvete);

        //Operador Unario!
        System.out.println("mais saudavel?" + maisSaudavel);
    }
}
