package com.eichinn.flyweight_pattern;

/**
 * Created by ei_chinn on 2016/11/24.
 */
public class Client {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            String subject = "subject" + i;
            for (int j = 0; j < 30; j++) {
                String key = subject + "考试地点" + j;
                SignInfoFactory.getSignInfo(key);
            }
        }

        SignInfo signInfo = SignInfoFactory.getSignInfo("subject1考试地点1");
    }
}
