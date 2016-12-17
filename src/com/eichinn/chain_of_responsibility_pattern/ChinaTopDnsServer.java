package com.eichinn.chain_of_responsibility_pattern;

/**
 * Created by ei_chinn on 2016/12/17.
 */
public class ChinaTopDnsServer extends DnsServer {
    @Override
    protected boolean isLocal(String domain) {
        return domain.endsWith(".cn");
    }

    @Override
    protected Recorder echo(String domain) {
        Recorder recorder = super.echo(domain);
        recorder.setOwner("China Top DNS");
        return recorder;
    }
}
