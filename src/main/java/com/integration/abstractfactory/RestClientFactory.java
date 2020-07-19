package com.integration.abstractfactory;

import org.apache.http.client.methods.CloseableHttpResponse;

import java.util.HashMap;

public interface RestClientFactory {
    public CloseableHttpResponse get(String url);
    public CloseableHttpResponse get(String url, HashMap<String, String> headerMap);
    public CloseableHttpResponse post(String url, String entityString, HashMap<String, String> headerMap);
}
