public class mainContaBancaria {
    public static void main(String[] args){
        ContaBancaria t1 = new ContaBancaria("jadeilson",177662,700.00);
        ContaBancaria t2 = new ContaBancaria("carlos",229,400.00);

        System.out.printf("titular:%s | numero da conta:%d | saldo:%.2f%n",t1.titular,t1.numerodaConta,t1.saldo);
        System.out.printf("titular:%s | numero da conta:%d | saldo:%.2f",t2.titular,t2.numerodaConta,t2.saldo);


    }
}
