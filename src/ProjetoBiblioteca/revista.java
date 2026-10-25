package ProjetoBiblioteca;

public class revista extends Materiais{
    String catalogo;

    public revista(String nome,int paginas){
        super(nome,paginas);
    }

    public void verCatalogo(){
        System.out.printf("estou vendo o catalogo da %s!",getNome());
    }


}
