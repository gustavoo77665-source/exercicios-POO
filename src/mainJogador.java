public class mainJogador {
    public static void main(String[] args) {
        Jogador j = new Jogador();
        Jogador d = new Jogador();


        j.nome = "Noobmaster";
        d.nome = "THOR009";

        j.pontuacao = 100000;
        d.pontuacao = 5;

        j.AdicionarPontos(5000000);
        j.mostrarDados();

        d.AdicionarPontos(4);
        d.mostrarDados();
    }
}
