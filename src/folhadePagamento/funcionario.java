package folhadePagamento;

public abstract class funcionario {
    String nome;

    public funcionario(String nome){
        this.nome = nome;
    }

    public abstract void apresentar();

    public abstract void calcularSalario();
}
