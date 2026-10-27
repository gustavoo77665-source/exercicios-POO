package controledeContasBancarias;

public class main {
    public static void main(String[] args){
        ContaBancaria cb = new ContaBancaria("Gustavo");
        cb.depositar(5000);

        ContaPoupanca cp = new ContaPoupanca("gustavinho");
        cp.depositar(10000);
        cp.aplicarRendimento(5.0);

        System.out.println("valor depois do rendimento"+cp.getSaldo());
    }
}
