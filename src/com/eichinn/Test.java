package com.eichinn;

import com.eichinn.utils.MaxEntriesLinkedHashMap;

/**
 * Created by chenrong on 2016/11/3.
 */
public class Test {
    public static void main(String[] args) {
        MaxEntriesLinkedHashMap<String, String> melhm = new MaxEntriesLinkedHashMap<>(3);
        melhm.put("1", "1");
        System.out.println(melhm);
        melhm.put("2", "2");
        System.out.println(melhm);
        melhm.put("3", "3");
        System.out.println(melhm);
        melhm.put("4", "4");
        System.out.println(melhm);
        melhm.put("5", "5");
        System.out.println(melhm);
        System.out.println(melhm.get("1"));
    }
}
