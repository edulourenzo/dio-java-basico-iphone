
public class AparelhoTelefonico extends IPhone {

    public void ligar(String numero) {
        System.out.println("ligando parao núemero: " + numero);
    }

    public void atender() {
        System.out.println("Atendendo ligação!");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz!");
    }
}
