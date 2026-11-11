package folhadePagamento;

public class funcionarioMensalista extends funcionario{
    int salarioMensal = 0;

    public funcionarioMensalista(String nome,int salarioMensal) {
        super(nome);
        this.salarioMensal = salarioMensal;
    }

    @Override
    public void apresentar() {
        System.out.printf("Ola meu nome é %s e eu sou um funcionario mensalista!!%n",nome);
    }

    @Override
    public void calcularSalario() {
     System.out.printf("por mes eu ganho %d reais!!",salarioMensal);
    }
}
