package com.eichinn.memento_pattern;

import java.util.HashMap;

/**
 * Created by ei_chinn on 2016/11/5.
 */
public class Originator {
    //内部状态
    private String state1 = "";
    private String state2 = "";
    private String state3 = "";

    public String getState1() {
        return state1;
    }

    public void setState1(String state1) {
        this.state1 = state1;
    }

    public String getState2() {
        return state2;
    }

    public void setState2(String state2) {
        this.state2 = state2;
    }

    public String getState3() {
        return state3;
    }

    public void setState3(String state3) {
        this.state3 = state3;
    }

    //创建一个备忘录
    public IMemento createMemento() {
        return new Memento(BeanUtils.backupProp(this));
    }

    //恢复一个备忘录
    public void restoreMemento(IMemento memento) {
        if (memento != null) {
            BeanUtils.restoreProp(this, ((Memento)memento).getStateMap());
        } else {
            System.out.println("can't restore a null memento");
        }
    }

    @Override
    public String toString() {
        return "Originator{" +
                "state1='" + state1 + '\'' +
                ", state2='" + state2 + '\'' +
                ", state3='" + state3 + '\'' +
                '}';
    }

    //私有静态内部类，防止Originator以外的类修改备忘录
    private static class Memento implements IMemento{
        private HashMap<String, Object> stateMap;

        private Memento(HashMap<String, Object> stateMap) {
            this.stateMap = stateMap;
        }

        private HashMap<String, Object> getStateMap() {
            return stateMap;
        }

        private void setStateMap(HashMap<String, Object> stateMap) {
            this.stateMap = stateMap;
        }
    }
}
