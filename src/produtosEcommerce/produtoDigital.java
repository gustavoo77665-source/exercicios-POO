package produtosEcommerce;

public class produtoDigital extends produto{
    double tamanhodoArquivo;

    public produtoDigital(String nome,int precoBase,double tamanhodoArquivo){
        super(nome,precoBase);
        this.tamanhodoArquivo = tamanhodoArquivo;
    }

    @Override
    public void calcularPrecoFinal() {
        double percentual = 10;
        double valorPorcentagem = (percentual * precoBase) / 100;
        double valorFinal = precoBase + valorPorcentagem;
        System.out.println("o valor final do produto digital é de "+valorFinal +"reais");

    }
}
