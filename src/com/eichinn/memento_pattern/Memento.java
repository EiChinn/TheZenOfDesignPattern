package com.eichinn.memento_pattern;

import java.util.HashMap;

/**
 * Created by chenrong on 2016/11/5.
 */
public class Memento {
    private HashMap<String, Object> stateMap;

    public Memento(HashMap<String, Object> stateMap) {
        this.stateMap = stateMap;
    }

    public HashMap<String, Object> getStateMap() {
        return stateMap;
    }

    public void setStateMap(HashMap<String, Object> stateMap) {
        this.stateMap = stateMap;
    }
}
