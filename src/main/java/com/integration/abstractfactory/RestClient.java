package com.integration.abstractfactory;

import org.apache.http.client.methods.CloseableHttpResponse;

import java.util.HashMap;

public class RestClient implements RestClientFactory {
    public CloseableHttpResponse get(String url) {
        return null;
    }

    public CloseableHttpResponse get(String url, HashMap<String, String> headerMap) {
        return null;
    }

    public CloseableHttpResponse post(String url, String entityString, HashMap<String, String> headerMap) {
        return null;
    }


}
