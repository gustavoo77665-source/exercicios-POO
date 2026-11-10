package produtosEcommerce;

public class produtoFisico extends produto{
    double produtoKg;
    double taxa = 5.00;

    public produtoFisico(String nome,int precoBase,Double produtoKg){
        super(nome,precoBase);
        this.produtoKg = produtoKg;
    }


    @Override
    public void calcularPrecoFinal() {

    double multiplicacao = produtoKg * taxa;

    double precoFinal = multiplicacao + precoBase;

    System.out.println("preço final:"+ precoFinal);

    }
}
