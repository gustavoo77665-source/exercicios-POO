package SistemaBiblioteca;

public class Livro {
    private int id;
    private String titulo;
    private String autor;
    private Boolean disponivel = true;

    public Livro(int id,String titulo,String autor){
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(){
        this.titulo = titulo;
    }

    public int getId(){
        return id;
    }
    public void setId(){
        this.id = id;
    }

    public String getAutor(){
        return autor;
    }
    public void setAutor(){
        this.autor = autor;
    }

    public Boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Boolean disponivel){
        this.disponivel = disponivel;
    }

    public void checarDados(){
        System.out.printf(" id:%d%n titulo:%s%n autor:%s%n disponivel?:%b%n",getId(),getTitulo(),getAutor(),getDisponivel());
    }
}
