public class Banco {
    private String titular;
    private double saldo;
    private int numerodaConta;

    Banco(String tiutlar,int numerodaConta){
        this.titular = tiutlar;
        this.numerodaConta = numerodaConta;
        this.saldo = 100;
    }
    public void depositar(double valor){
        if (saldo <= 0){
           System.out.println("valor invalido");
        }else{
            saldo = valor + saldo;
        }
    }
    public void sacar(double valor){
        this.saldo = saldo;
        if (valor > saldo){
            System.out.println("valor invalido!");
        }else{
            saldo = saldo - valor;
        }
    }
    public void consultarSaldo(){
        System.out.printf("seu saldo é de %.2f reais %n",saldo);
    }

}
