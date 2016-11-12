package com.eichinn.utils;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by ei_chinn on 2016/11/5.
 * 维持此Map只保存MAX_ENTRIES个条目的稳定状态，在每次添加新条目时删除最旧的条目。
 * 在尝试获取被删除的旧条目时会返回null
 */
public class MaxEntriesLinkedHashMap<K, V> extends LinkedHashMap<K, V>{
    private final int MAX_ENTRIES;

    public MaxEntriesLinkedHashMap(int MAX_ENTRIES) {
        this.MAX_ENTRIES = MAX_ENTRIES;
    }

    public MaxEntriesLinkedHashMap(int initialCapacity, float loadFactor, boolean accessOrder, int MAX_ENTRIES) {
        super(Math.min(initialCapacity, MAX_ENTRIES), loadFactor, accessOrder);
        this.MAX_ENTRIES = MAX_ENTRIES;
    }



    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > MAX_ENTRIES;
    }
}
