package entities;

import interf.Notificavel;

public class NotificacaoCombinada implements Notificavel {

    private EmailNotificacao email;
    private SmsNotificacao sms;

    public NotificacaoCombinada(EmailNotificacao email, SmsNotificacao sms) {
        this.email = email;
        this.sms = sms;
    }



    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println(mensagem);
    }
}
