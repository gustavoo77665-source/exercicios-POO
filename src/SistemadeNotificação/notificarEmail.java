package SistemadeNotificação;

public class notificarEmail implements notificacao{
    String email;
    String destinatario;

    public notificarEmail(String email,String destinatario){
        this.destinatario = destinatario;
        this.email = email;
    }


    @Override
    public void notificar() {
        System.out.println("*Notificacao email,mudança de estado*");
    }
}
