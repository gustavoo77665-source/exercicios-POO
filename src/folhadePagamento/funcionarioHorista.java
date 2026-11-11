package folhadePagamento;

public class funcionarioHorista extends funcionario{
    int horas = 0;
    int taxaHoras = 50;

    public funcionarioHorista(String nome,int horas){
        super(nome);
        this.horas = horas;
    }

    @Override
    public void apresentar() {
        System.out.printf("Ola!meu nome é %s e sou um funcionario horista!%n",nome);
    }

    @Override
    public void calcularSalario() {
        int valorSalario = horas * taxaHoras;
        System.out.printf("este mes eu ganhei %d reais!!%n",valorSalario);
    }
}
