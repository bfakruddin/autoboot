package com.integration.abstractfactory;

import org.apache.http.client.HttpClient;
import org.openqa.selenium.WebDriver;

public interface DriverAbstractFactory {
    public WebDriver getWebDriver();
}
