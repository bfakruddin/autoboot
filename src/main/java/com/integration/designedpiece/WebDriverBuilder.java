package com.integration.designedpiece;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverBuilder {
    private FirefoxDriver firefoxDriver;
    private InternetExplorerDriver internetExplorerDriver;
    private ChromeDriver chromeDriver;
    private SafariDriver safariDriver;

    public SafariDriver getSafariDriver() {
        safariDriver = new SafariDriver();
        return safariDriver;
    }

    public FirefoxDriver getFirefoxDriver() {
        System.setProperty("webdriver.gecko.driver",
                "/Users/babafakruddindudekula/Documents/Technical-Practicing/Automation/selenium-drivers/geckodriver");

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
        System.setProperty("webdriver.chrome.driver", "/Users/babafakruddindudekula/Documents/Technical-Practicing/Automation/selenium-drivers/chromedriver");
        this.chromeDriver = new ChromeDriver();
        return this.chromeDriver;
    }
}
