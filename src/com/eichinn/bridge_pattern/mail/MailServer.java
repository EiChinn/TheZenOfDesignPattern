package com.eichinn.bridge_pattern.mail;

/**
 * Created by ei_chinn on 2016/12/17.
 */
public abstract class MailServer {
    protected final MailTemplate m;

    public MailServer(MailTemplate m) {
        this.m = m;
    }

    public void sendMail() {
        System.out.println("sendMail: " + m.getContext());
    }
}
