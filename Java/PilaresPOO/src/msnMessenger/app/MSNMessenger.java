package msnMessenger.app;

public class MSNMessenger extends ServicoMensagem{
    public void enviarMensagem() {
        validarConnectadoInternet();
		System.out.println("Enviando mensagem pelo MSN Messenger");
	}
	public void receberrMensagem() {
		System.out.println("Recebendo mensagem pelo MSN Messenger");
	}
}
