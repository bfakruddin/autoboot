package com.integration;

import org.apache.http.client.HttpClient;
import org.openqa.selenium.WebDriver;

public interface Driver {
    public WebDriver getDriver();
    public HttpClient getHttpClient();
}
