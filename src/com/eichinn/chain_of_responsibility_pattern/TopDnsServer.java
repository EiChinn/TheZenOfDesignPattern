package com.eichinn.chain_of_responsibility_pattern;

/**
 * Created by ei_chinn on 2016/12/17.
 */
public class TopDnsServer extends DnsServer {
    @Override
    protected boolean isLocal(String domain) {
        return true;
    }

    @Override
    protected Recorder echo(String domain) {
        Recorder recorder = super.echo(domain);
        recorder.setOwner("Top DNS");
        return recorder;
    }
}
