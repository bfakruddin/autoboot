package com.integration.abstractfactory;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEFactory extends InternetExplorerDriver {
    public InternetExplorerDriver getDriver(){
        return new InternetExplorerDriver();
    }
}
