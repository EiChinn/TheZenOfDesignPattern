package com.eichinn.chain_of_responsibility_pattern;

/**
 * Created by ei_chinn on 2016/12/17.
 */
public class SHDnsServer extends DnsServer {
    @Override
    protected boolean isLocal(String domain) {
        return domain.endsWith(".sh.cn");
    }

    @Override
    protected Recorder echo(String domain) {
        Recorder recorder = super.echo(domain);
        recorder.setOwner("SH DNS");
        return recorder;
    }
}
