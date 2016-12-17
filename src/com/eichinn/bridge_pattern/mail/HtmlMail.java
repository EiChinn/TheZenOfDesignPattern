package com.eichinn.bridge_pattern.mail;

/**
 * Created by ei_chinn on 2016/12/17.
 */
public class HtmlMail extends MailTemplate {

    public HtmlMail(String from, String to, String subject, String context) {
        super(from, to, subject, context);
    }

    @Override
    public String getContext() {
        return "HtmlMail " + super.getContext();
    }
}
