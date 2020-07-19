package com.integration.designedpiece;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WebDriverBuilder {
    private FirefoxDriver firefoxDriver;
    private InternetExplorerDriver internetExplorerDriver;
    private ChromeDriver chromeDriver;

    public FirefoxDriver getFirefoxDriver() {
        System.setProperty("webdriver.firefox.marionette", "/Users/babafakruddindudekula/Documents/Technical-Practicing/Automation/selenium-drivers/geckodriver.exe");

        DesiredCapabilities capabilities=DesiredCapabilities.firefox();

        capabilities.setCapability("marionette", true);
        firefoxDriver = new FirefoxDriver();
        return this.firefoxDriver;
    }

    public InternetExplorerDriver getInternetExplorerDriver() {
        this.internetExplorerDriver = internetExplorerDriver;
        return this.internetExplorerDriver;
    }

    public ChromeDriver getChromeDriver() {
        this.chromeDriver = chromeDriver;
        return this.chromeDriver;
    }
}
