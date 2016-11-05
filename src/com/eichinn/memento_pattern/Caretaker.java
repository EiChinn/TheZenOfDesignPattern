package com.eichinn.memento_pattern;

/**
 * Created by chenrong on 2016/11/5.
 */
public class Caretaker {
    private Memento memento;

    public Caretaker() {
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
