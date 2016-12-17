package com.eichinn.observer_pattern;

import java.util.Observable;
import java.util.Observer;
import java.util.Random;

/**
 * Created by ei_chinn on 2016/12/17.
 */
public abstract class DnsServer extends Observable implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        Recorder recorder = (Recorder)arg;
        if (isLocal(recorder)) {
            recorder.setIp(genIpAddress());
        } else {
            responseFromUpperServer(recorder);
        }

        sign(recorder);
    }

    public void setUpperServer(DnsServer dnsServer) {
        deleteObservers();
        addObserver(dnsServer);
    }

    private void responseFromUpperServer(Recorder recorder) {
        setChanged();
        notifyObservers(recorder);
    }

    protected abstract void sign(Recorder recorder);

    protected abstract boolean isLocal(Recorder recorder);

    private String genIpAddress() {
        Random random = new Random();
        String address = random.nextInt(255) + "." + random.nextInt(255) + "." + random.nextInt(255) + "." + random.nextInt(255);
        return address;
    }
}
