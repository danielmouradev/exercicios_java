package entities;

import interf.Notificavel;

public class EmailNotificacao implements Notificavel {

    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println(mensagem);
    }
}
