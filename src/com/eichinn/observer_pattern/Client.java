package com.eichinn.observer_pattern;

/**
 * Created by ei_chinn on 2016/12/17.
 */
public class Client {
    public static void main(String[] args) {
        DnsServer shDnsServer = new SHDnsServer();
        DnsServer chinaTopDnsServer = new ChinaTopDnsServer();
        DnsServer topDnsServer = new TopDnsServer();

        shDnsServer.setUpperServer(chinaTopDnsServer);
        chinaTopDnsServer.setUpperServer(topDnsServer);

        Recorder recorder = new Recorder();
        recorder.setDomain("www.google.com");

        shDnsServer.update(null, recorder);
        System.out.println(recorder);
    }
}
