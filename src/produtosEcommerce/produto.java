package produtosEcommerce;

public class produto {
    String nome;
    int precoBase;

    public produto(String nome,int precoBase) {
        this.nome = nome;
        this.precoBase = precoBase;
    }
    public produto(){

    }
    public void calcularPrecoFinal(){
       System.out.println(precoBase);
    }

}
