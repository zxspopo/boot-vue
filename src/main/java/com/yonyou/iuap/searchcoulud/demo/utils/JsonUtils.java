package com.yonyou.iuap.searchcoulud.demo.utils;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

/**
 * Created by zengxs on 2017/1/4.
 */
public class JsonUtils {

    private static final Gson gson = new Gson();

    public static <T> T toObject(String value, Class<T> clz) {
        return gson.fromJson(value, clz);
    }

    public static <T> List<T> toList(String value,Class<T> clz) {
        List<T> list = new ArrayList<T>();

        JsonArray array = new JsonParser().parse(value).getAsJsonArray();
        for(JsonElement elem : array){
            list.add(gson.fromJson(elem, clz));
        }
        return list;
    }

    public static String toString(Object object) {
        return gson.toJson(object);
    }

}
