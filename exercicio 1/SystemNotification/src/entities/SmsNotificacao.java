package entities;

import interf.Notificavel;

public class SmsNotificacao implements Notificavel {
    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println(mensagem);
    }
}
