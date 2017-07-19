package com.hightech.apidoc.common.constants;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.Map;

/**
 * Created by mengwei on 17/7/19.
 */
public class AppConfig {
    private static Map<String,String>  property= Maps.newHashMap();

    public static String get(String key){
        return property.get(key);
    }

    public static void set(String key,String value){
        property.put(key,value);
    }
}
