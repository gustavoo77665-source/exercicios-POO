package sistemadeCheckout;

public class produtoImportado extends produto {
    private double taxaAlfandega;

    public produtoImportado(String nome, double preco, double taxaAlfandega) {
        super(nome, preco);
        this.taxaAlfandega = taxaAlfandega;
    }

    public double getTaxaAlfandega() {
        return taxaAlfandega;
    }

    public void setTaxaAlfandega(double taxaAlfandega) {
        this.taxaAlfandega = taxaAlfandega;
    }
    @Override
    public void exibirDados(){
        System.out.printf("nome do produto:%s%n preco do produto:%.2f%n taxa na alfandega:%.2f",getNome(),getPreco(),taxaAlfandega);
    }
}