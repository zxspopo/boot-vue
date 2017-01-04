package com.yonyou.iuap.searchcoulud.demo.utils;

import java.io.IOException;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import com.yonyou.iuap.iweb.exception.ValidException;

/**
 * Created by zengxs on 2017/1/3.
 */
public class HttpClientUtils {

    private static final HttpClientBuilder builder = HttpClientBuilder.create();

    public static String doGet(String url) {
        try (CloseableHttpClient client = builder.build()) {
            HttpGet get = new HttpGet(url);
            CloseableHttpResponse response = client.execute(get);
            return EntityUtils.toString(response.getEntity());
        } catch (IOException e) {
            throw new ValidException("调用查询服务失败!", e);
        }
    }
}
