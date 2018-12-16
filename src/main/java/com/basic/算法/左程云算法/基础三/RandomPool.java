package com.basic.算法.左程云算法.基础三;

import java.util.HashMap;

/**
 * @author Blse
 * @date 2018/12/6
 * @description
 */
public class RandomPool {

    public static HashMap<String, Integer> strMap;
    public static HashMap<Integer, String> intMap;
    public static int size = 0;

    public static void add(String str) {
        strMap.put(str, size);
        intMap.put(size, str);
        size++;
    }

    public static void delete(String str) {
        int val = strMap.get(str);
        String key = intMap.get(size);
        strMap.remove(str);
        intMap.remove(val);
        size--;
        strMap.put(key, size);
        intMap.put(size, key);
    }

}
