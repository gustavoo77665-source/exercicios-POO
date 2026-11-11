package SistemadeVeiculos;

public abstract class veiculo {
    String marca;

    public veiculo(String marca){
        this.marca = marca;
    }

    public abstract void acelerar();

}
