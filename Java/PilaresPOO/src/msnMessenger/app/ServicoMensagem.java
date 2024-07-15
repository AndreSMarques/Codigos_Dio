package msnMessenger.app;

public abstract class ServicoMensagem {
    public abstract void enviarMensagem();
    public abstract void receberrMensagem();

    protected void validarConnectadoInternet() {
        System.out.println("Validadno se está conectado a internet");
    }
}
