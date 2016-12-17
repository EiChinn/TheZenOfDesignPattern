package com.eichinn.bridge_pattern.mail;

/**
 * Created by ei_chinn on 2016/12/17.
 */
public class TextMail extends MailTemplate {
    public TextMail(String from, String to, String subject, String context) {
        super(from, to, subject, context);
    }

    @Override
    public String getContext() {
        return "TextMail " + super.getContext();
    }
}
