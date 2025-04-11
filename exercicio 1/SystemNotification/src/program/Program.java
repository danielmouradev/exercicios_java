package program;

import entities.EmailNotificacao;
import entities.NotificacaoCombinada;
import entities.SmsNotificacao;
import interf.Notificavel;

public class Program {
    public static void main(String[] args) {

        Notificavel notificacao = new NotificacaoCombinada(new EmailNotificacao(), new SmsNotificacao());
        notificacao.enviarNotificacao("Alerta: Sistema indisponível");
    }
}
