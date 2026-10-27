package controledeContasBancarias;

public class ContaPoupanca extends ContaBancaria{
    public ContaPoupanca(String titular){
        super(titular);
    }
    public void aplicarRendimento(double valor){
        double rendimento  = getSaldo() * (valor / 100);

        depositar(rendimento);

    }
}
