package com.eichinn.utils;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by chenrong on 2016/11/5.
 * 维持此Map只保存MAX_ENTRIES个条目的稳定状态，在每次添加新条目时删除最旧的条目。
 * 在尝试获取被删除的旧条目时返回null
 */
public class MaxEntriesLinkedHashMap<K, V> extends LinkedHashMap<K, V>{
    private final int MAX_ENTRIES;

    public MaxEntriesLinkedHashMap(int MAX_ENTRIES) {
        this.MAX_ENTRIES = MAX_ENTRIES;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > MAX_ENTRIES;
    }
}
