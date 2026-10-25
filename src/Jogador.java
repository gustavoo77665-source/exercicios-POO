public class Jogador {
    String nome;
    int pontuacao;

    public void mostrarDados() {
       System.out.println(nome);
        System.out.printf("o jogador %s tem %d pontos!!!%n",nome,pontuacao);
  }
   public void AdicionarPontos(int pontos){
         pontuacao = pontos + pontuacao;
   }

}
