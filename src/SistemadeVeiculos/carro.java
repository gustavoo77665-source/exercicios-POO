package SistemadeVeiculos;

public class carro extends veiculo{

    public carro(String nome){
        super(nome);
    }

    @Override
    public void acelerar() {
        System.out.println("O carro esta acelerando!");
    }
}
