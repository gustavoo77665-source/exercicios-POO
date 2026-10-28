package SistemaBiblioteca;
import java.util.ArrayList;

public class Biblioteca {
    ArrayList<Livro> livros = new ArrayList<>();

     public void cadastrarLivros(Livro novolivro) {
         livros.add(novolivro);
     }

     public void exibirLivrosCadastrados(){
         if (livros.isEmpty()){
             System.out.println("A biblioteca no momento nao tem nenhum livro cadastrado");
         }
         System.out.println("--LIVROS CADASTRADOS--");

         for(Livro l:livros){
         l.checarDados();
         }
     }

     public void emprestarLivroporID(int idProcurado){
         boolean encontrado = false;
         for(Livro l : livros){
             encontrado = true;

             if(l.getId() == idProcurado ){
                 System.out.println("--LIVRO ENCONTRADO--");

                 l.setDisponivel(false);
                 System.out.println("emprestado com sucesso!!,você tem um prazo de:4 dias para devolve-lo");
                 l.setDisponivel(false);
             }
         }
             if (encontrado == false){
                 System.out.printf("o livro de id:%d não foi encontrado.",idProcurado);
             }

     }
     public void devolverLivro(int id ){
         for(Livro l : livros){
         if(id == l.getId() ){
             System.out.println("LIVRO DEVOLVIDO COM SUCESSO!");
             l.setDisponivel(true);
         }
         else{
             System.out.println("ID ERRADO.");
         }
         }

     }


}
