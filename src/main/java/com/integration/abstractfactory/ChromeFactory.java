package com.integration.abstractfactory;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeFactory extends ChromeDriver {
    public ChromeDriver getDriver(){
        return new ChromeDriver();
    }
}
