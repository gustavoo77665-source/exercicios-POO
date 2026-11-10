package produtosEcommerce;

public class main {
    public static void main(String []args){
        produtoFisico pf = new produtoFisico("vassoura",20,1.000);
        produtoDigital pd = new produtoDigital("rashguard",40,500);
        pf.calcularPrecoFinal();
        pd.calcularPrecoFinal();
    }
}
