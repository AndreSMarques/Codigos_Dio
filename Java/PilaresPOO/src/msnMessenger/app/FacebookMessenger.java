package msnMessenger.app;

public class FacebookMessenger extends ServicoMensagem{
    public void enviarMensagem() {
        validarConnectadoInternet();
		System.out.println("Enviando mensagem pelo Facebook Messenger");
	}
	public void receberrMensagem() {
		System.out.println("Recebendo mensagem pelo Facebook Messenger");
	}
}
