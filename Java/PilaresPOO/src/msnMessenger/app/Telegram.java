package msnMessenger.app;

public class Telegram extends ServicoMensagem{
    public void enviarMensagem() {
        validarConnectadoInternet();
		System.out.println("Enviando mensagem pelo Telegram");
	}
	public void receberrMensagem() {
		System.out.println("Recebendo mensagem pelo Telegram");
	}
}
