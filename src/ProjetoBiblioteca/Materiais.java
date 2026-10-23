package ProjetoBiblioteca;

public class Materiais {
    private String nome;
    private int paginas;

    public  Materiais(String nome,int paginas){
        this.nome = nome;
        this.paginas = paginas;
    }

    public void  setPaginas(int paginas){
        if(paginas<=100){
            System.out.println("numero invalido de paginas");
        }else{
        this.paginas = paginas;
        }
    }

    public int getPaginas(){
        return paginas;
    }


    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
}
