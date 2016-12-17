package com.eichinn.bridge_pattern.mail;

/**
 * Created by ei_chinn on 2016/12/17.
 */
public class Client {
    public static void main(String[] args) {
        MailTemplate m = new HtmlMail("from", "to", "subject", "context");
        MailServer mailServer = new Postfix(m);
        mailServer.sendMail();
    }
}
