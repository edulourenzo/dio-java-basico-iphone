
public class App {

    public static void main(String[] args) throws Exception {
        AparelhoTelefonico myAparelho = new AparelhoTelefonico();
        NavegadorInternet myNavegador = new NavegadorInternet();
        ReprodutorMusical myReprodutor = new ReprodutorMusical();

        myAparelho.ligar("+55 (11) 9 9988-7766");
        myNavegador.exibirPagina("www.dio.io");
        myReprodutor.selecionarMusica("Pequena serenata noturna - Mozart");
    }
}
