package SistemadeNotificação;

public class notificarNumero implements notificacao{
    int numero;

    public notificarNumero(int numero){
        this.numero = numero;
    }

    @Override
    public void notificar() {

        System.out.println("Notificacao por sms");
    }
}
