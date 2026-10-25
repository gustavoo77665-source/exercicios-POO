public class mainAnime {
    public static void main(String[] args){
        Anime a1 =  new Anime("naruto",400,9.5);
        Anime a2 = new Anime("Bleach",600,10.0);
        System.out.printf("Anime:%s episodeos:%d nota:%.1f%n",a1.titulo,a1.episodios,a1.nota);
        System.out.printf("Anime:%s episodeos:%d nota:%.1f",a2.titulo,a2.episodios,a2.nota);
    }
}
