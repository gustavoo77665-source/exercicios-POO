package sistemadeCheckout;

public class produto {
    private String nome;
    private Double preco;

    public produto(String nome,Double preco){
        this.nome = nome;
        this.preco = preco;
    }
    public produto(){

    }


    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void exibirDados(){
        System.out.printf("nome do produto:%s%n preco do produto:%.2f%n",nome,preco);
    }
}
