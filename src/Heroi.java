public class Heroi {
    private String nome;
    private int idade;
    private int nivel;
    private int vida;


    public Heroi(String nome,int idade){
        this.nome = nome;
        this.idade = idade;
        this.vida = 100;
        this.nivel = 1;

    }


    public void receberDano(int dano){
        this.vida = vida;
       if (dano > vida ){
           vida = 0;
       }else{
            vida = vida - dano;
            System.out.printf("nivel de vida atual:%d%n",vida);
       }
       if(vida == 0){
           System.out.println("voce morreu");
       }
    }

    public void subirNivel(int nivel){
        this.nivel += 1;

    }


    public void curar(int cura){
        this.vida = vida;
        if(vida + cura == 100){
            System.out.println("cura invalida!!");
        }else{
            vida = cura+vida;
            System.out.printf("nivel de vida atual:%d%n",vida);
        }
    }

}
