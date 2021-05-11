package com.allen.ai.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Singleton00 {
    public static Map<String, String> cache = new ConcurrentHashMap<String, String>();
}
