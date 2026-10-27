package sistemadeCheckout;

public class main {
    public static void main(String[] args){
        produto p = new produto("camisa",20.50);

        produtoImportado pi = new produtoImportado("perfume arabe",170.05,300);

        pi.exibirDados();
        p.exibirDados();
    }
}
