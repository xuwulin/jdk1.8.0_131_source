package com.xwl.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xwl
 * @date 2021/2/7 16:05
 * @description
 */
public class HashMapTest {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("k1", 1);
        map.put("k2", 2);
        map.put("k3", 3);
        System.out.println(map);
    }
}
