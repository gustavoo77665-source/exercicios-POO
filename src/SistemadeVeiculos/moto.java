package SistemadeVeiculos;

public class moto extends veiculo{
    public moto(String marca) {
        super(marca);
    }

    @Override
    public void acelerar() {
        System.out.println("A moto esta acelerando!");
    }
}
