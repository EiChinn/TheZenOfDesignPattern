package com.eichinn.observer_pattern;

/**
 * Created by ei_chinn on 2016/12/17.
 */
public class TopDnsServer extends DnsServer {
    @Override
    protected void sign(Recorder recorder) {
        recorder.setOwner("Top DnsServer");
    }

    @Override
    protected boolean isLocal(Recorder recorder) {
        return true;
    }
}
