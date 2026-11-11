package folhadePagamento;

public class main {
    public static void main(String[] args){
        funcionarioHorista fh = new funcionarioHorista("carlos",50);
        funcionarioMensalista fm = new funcionarioMensalista("jota",3000);

        fh.apresentar();
        fm.apresentar();

        fh.calcularSalario();
        fm.calcularSalario();

    }
}
