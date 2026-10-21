public class mainBanco {
    public static void main(String[] args){
        Banco t = new Banco("Gustavo",007);
        t.depositar(100);
        t.consultarSaldo();

        t.sacar(20);
        t.consultarSaldo();

        t.depositar(40000);
        t.consultarSaldo();
    }

}

