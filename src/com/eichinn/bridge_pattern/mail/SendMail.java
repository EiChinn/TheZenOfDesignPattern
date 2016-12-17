package com.eichinn.bridge_pattern.mail;

/**
 * Created by ei_chinn on 2016/12/17.
 */
public class SendMail extends MailServer {
    public SendMail(MailTemplate m) {
        super(m);
    }

    @Override
    public void sendMail() {
        m.add(" SendMail");
        super.sendMail();
    }
}
