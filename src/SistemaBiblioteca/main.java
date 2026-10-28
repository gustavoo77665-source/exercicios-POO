package SistemaBiblioteca;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Biblioteca b = new Biblioteca();
        Scanner sc = new Scanner(System.in);

        boolean resposta = false;

        while (resposta == false) {
            System.out.println("OQUE VOCE GOSTARIA DE FAZER??");
            System.out.println("1-CADASTRAR UM LIVRO");
            System.out.println("2-EXIBIR LIVROS CADASTRADOS");
            System.out.println("3-PEGAR UM LIVRO EMPRESTADO");
            System.out.println("4-DEVOLVER UM LIVRO");
            System.out.println("5-SAIR DO SISTEMA");

            int opcao = sc.nextInt();
            sc.nextLine();

            if(opcao == 1){
                System.out.println("DIGITE O ID DO LIVRO:");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.println("DIGITE O TITULO DO LIVRO:");
                String titulo = sc.nextLine();
                sc.nextLine();

                System.out.println("DIGITE O AUTOR DO LIVRO:");
                String autor = sc.nextLine();

                Livro novo = new Livro(id,titulo,autor);

                b.cadastrarLivros(novo);
                System.out.println("LIVRO CADASTRADO COM SUCESSO");
            }
            else if (opcao == 2) {
                b.exibirLivrosCadastrados();
            }
            else if (opcao == 3) {
                System.out.println("DIGITE O ID DO LIVRO REQUERIDO");
                int id = sc.nextInt();

                b.emprestarLivroporID(id);
            }
            else if (opcao == 4) {
                System.out.println("DIGITE O ID DO LIVRO");
                int id = sc.nextInt();

                b.devolverLivro(id);
            } else if (opcao == 5) {
                resposta = true;
            }
        }

    }
}