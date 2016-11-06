package com.eichinn.memento_pattern;

import com.eichinn.utils.MaxEntriesLinkedHashMap;
import com.sun.istack.internal.NotNull;

/**
 * Created by chenrong on 2016/11/5.
 */
public class Caretaker {
    private static final int MAX_AMOUNT = 20;//为防止内存溢出，只保存最新的20条备份（利用MaxEntriesLinkedHashMap)
    private MaxEntriesLinkedHashMap<String, IMemento> mementoMap = new MaxEntriesLinkedHashMap<>(MAX_AMOUNT);

    /**
     * 返回指定tag的memento，或者null如果该memento从未被保存又或者已作为旧条目被移除
     * @param tag
     * @return
     */
    public IMemento getMemento(String tag) {
        return mementoMap.get(tag);
    }

    public void setMemento(@NotNull String tag, IMemento memento) {
        mementoMap.put(tag, memento);
    }
}
