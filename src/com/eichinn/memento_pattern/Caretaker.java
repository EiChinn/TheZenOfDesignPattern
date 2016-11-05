package com.eichinn.memento_pattern;

import com.sun.istack.internal.NotNull;

import java.util.HashMap;

/**
 * Created by chenrong on 2016/11/5.
 */
public class Caretaker {
    private HashMap<String, Memento> mementoMap = new HashMap<>();

    public Memento getMemento(String tag) {
        return mementoMap.get(tag);
    }

    public void setMemento(@NotNull String tag, Memento memento) {
        mementoMap.put(tag, memento);
    }
}
