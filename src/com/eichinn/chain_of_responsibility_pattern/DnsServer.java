package com.eichinn.chain_of_responsibility_pattern;

import java.util.Random;

/**
 * Created by ei_chinn on 2016/12/17.
 */
public abstract class DnsServer {
    private DnsServer upperServer;

    public final Recorder resolve(String domain) {
        Recorder recorder = null;
        if (isLocal(domain)) {
            recorder = echo(domain);
        } else {
            recorder = upperServer.resolve(domain);
        }

        return recorder;
    }

    public void setUpperServer(DnsServer upperServer) {
        this.upperServer = upperServer;
    }

    protected abstract boolean isLocal(String domain);

    protected Recorder echo(String domain) {
        Recorder recorder = new Recorder();
        recorder.setIp(genIpAddress());
        recorder.setDomain(domain);
        return recorder;
    }

    private String genIpAddress() {
        Random random = new Random();
        String address = random.nextInt(255) + "." + random.nextInt(255) + "." + random.nextInt(255) + "." + random.nextInt(255);
        return address;
    }
}
