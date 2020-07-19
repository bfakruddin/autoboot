package com.integration.abstractfactory;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;

public class DriverFactory implements DriverAbstractFactory{

    private WebDriver driver;

    public DriverFactory() {
    }

    public DriverFactory(String seleniumDriver) {
        this.setDriver(seleniumDriver);
    }

    /**
     * setDriver For Selenium WebDrive
     * */
    private void setDriver(String browsertype){
        if(browsertype.equalsIgnoreCase("firefox")){
            this.driver = new FireFoxFactory();
        }else if (browsertype.equalsIgnoreCase("chrome")){
            this.driver = new ChromeFactory();
        }else if(browsertype.equalsIgnoreCase("ie")){
            this.driver = new IEFactory();
        }else{
            this.driver = null;
        }
    }

    public WebDriver getWebDriver() {
        return this.driver;
    }

}
