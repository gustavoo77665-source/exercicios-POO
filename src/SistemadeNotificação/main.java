package SistemadeNotificação;

public class main {
    public static void main(String[] args){
        notificarNumero notificarNumero = new notificarNumero(778898);
        notificarEmail notificarEmail = new notificarEmail("inansnx@gmail.com","carlos");
        notificarNumero.notificar();
        notificarEmail.notificar();
    }
}
