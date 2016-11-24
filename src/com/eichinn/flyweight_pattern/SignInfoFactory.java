package com.eichinn.flyweight_pattern;

import java.util.HashMap;

/**
 * Created by ei_chinn on 2016/11/24.
 */
public class SignInfoFactory {
    private static HashMap<String, SignInfo> pool = new HashMap<>();

    public static SignInfo getSignInfo(String key) {
        SignInfo result = null;

        if (!pool.containsKey(key)) {
            System.out.println(key + "-----建立对象，并放置到池中");
            result = new SignInfo4Pool(key);
            pool.put(key, result);
        } else {
            result = pool.get(key);
            System.out.println(key + "-----直接从池中获取");
        }
        return result;
    }
}
