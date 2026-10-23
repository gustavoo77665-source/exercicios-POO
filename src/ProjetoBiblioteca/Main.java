package ProjetoBiblioteca;

public class Main {
    public static void main(String[] args){
     Livros l = new Livros("memorias do subsolo",120,"Dostoievsky");
     revista r = new revista("balanciaga",40);

     l.setNome("noites estreladas");
     r.setNome("vitoria secrets");

     r.verCatalogo();
    }
}
