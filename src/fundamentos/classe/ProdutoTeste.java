package fundamentos.classe;

public class ProdutoTeste {

    public static void main(String[] args) {

        Produto p1 = new Produto("Notbook");
        p1.nome =   "Notebook";
        p1.preco = 4356.89;
        Produto.desconto = 0.25;

        var p2 = new Produto("Caneta Preta");
//            p2.nome = "Caneta Preta";
        p2.preco = 12.56;
        Produto.desconto = 0.29;

        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto();
        double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;

        System.out.printf("Media do carrinho = R$ %.2f.", mediaCarrinho);
    }

}
