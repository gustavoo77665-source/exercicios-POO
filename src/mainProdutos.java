public class mainProdutos {
    public static void main(String[] args){
        Produtos p1 = new Produtos("fone bluetooth",101,149.90,20);
        Produtos p2 = new Produtos("mouse gamer",102,89.90,35);
        Produtos p3 = new Produtos("teclado mecanico",103,259.90,12);


        System.out.printf("produto:%s | codigo:%d | preco:%.2f | estoque:%d%n",p1.nome,p1.codigo,p1.preco,p1.estoque);
        System.out.printf("produto:%s | codigo:%d | preco:%.2f | estoque:%d%n",p2.nome,p2.codigo,p2.preco,p2.estoque);
        System.out.printf("produto:%s | codigo:%d | preco:%.2f | estoque:%d%n",p3.nome,p3.codigo,p3.preco,p3.estoque);
    }
}
