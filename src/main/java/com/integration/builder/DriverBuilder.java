package com.integration.builder;

import org.apache.http.client.HttpClient;
import org.openqa.selenium.WebDriver;

public class DriverBuilder {
    private WebDriver driver;
    private HttpClient httpClient;

    public DriverBuilder setDriver(String toolType) {
        switch (toolType){
            case "selenium":
                return (DriverBuilder)this.driver;
            case "webservice":
//                return this.httpClient;
                break;
            default:
                break;
        }
        return null;
    }

    /*public DriverBuilder setHttpClient(HttpClient httpClient) {
        this.httpClient = httpClient;
    }*/
}
