public class Cachorro {
    String nome;
    public void latir(){
      System.out.println("Au Au!!");

    }
    public static void main(String[] args){
        Cachorro c = new Cachorro();
        String Nome = c.nome = "mila";
        System.out.printf("Nome: %s%n",Nome);
        c.latir();

    }
}
