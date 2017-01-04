package com.yonyou.iuap.searchcoulud.demo.utils;

/**
 * Created by zengxs on 2017/1/3.
 */
public class SolrQueryUtils {

    public static <T> T doQuery(String url, Class<T> clz) {
        String response = HttpClientUtils.doGet(url);
        if (String.class.isAssignableFrom(clz)) {
            return (T) response;
        }
        return JsonUtils.toObject(response, clz);
    }
}
