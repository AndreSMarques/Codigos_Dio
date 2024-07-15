package msnMessenger;

import msnMessenger.app.FacebookMessenger;
import msnMessenger.app.MSNMessenger;
import msnMessenger.app.ServicoMensagem;
import msnMessenger.app.Telegram;

public class ComputerPedrinho {
    public static void main(String[] args) {
        ServicoMensagem smi = null;

        String appEscolhido = "tlg";

        if (appEscolhido.equals("msn")) {
            smi = new MSNMessenger();
        }
        else if (appEscolhido.equals("fbm")) {
            smi = new FacebookMessenger();
        }
        else if (appEscolhido.equals("tlg")) {
            smi = new Telegram();
        }

        smi.enviarMensagem();
        smi.receberrMensagem();

    }
}
