package ProjetoBiblioteca;

public class Livros extends Materiais{
    String autor;

    public  Livros(String nome,int paginas,String autor){
        super(nome,paginas);
        this.autor = autor;
    }

    public String getAutor(){
        return autor;
    }


}
