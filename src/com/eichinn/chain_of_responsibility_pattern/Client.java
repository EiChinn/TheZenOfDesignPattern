package com.eichinn.chain_of_responsibility_pattern;

/**
 * Created by ei_chinn on 2016/12/17.
 */
public class Client {
    public static void main(String[] args) {
        DnsServer ShDnsServer = new SHDnsServer();
        DnsServer chinaTopDnsServer = new ChinaTopDnsServer();
        DnsServer topDnsServer = new TopDnsServer();

        ShDnsServer.setUpperServer(chinaTopDnsServer);
        chinaTopDnsServer.setUpperServer(topDnsServer);

        System.out.println(ShDnsServer.resolve("www.google.com"));
    }
}
