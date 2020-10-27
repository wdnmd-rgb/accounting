package com.util;

import java.util.HashMap;
import java.util.Map;

public class Result {
    public Map<String, Object> setNumList(Integer num, Object list) {
        return getStringObjectMap(num, list);
    }

    public static Map<String, Object> getStringObjectMap(Integer num, Object list) {
        Map<String, Object> resultMap = new HashMap<String, Object>();

        resultMap.put("code", 0);

        resultMap.put("msg", "");

        resultMap.put("count", num);

        resultMap.put("data", list);
        return resultMap;
    }
}

