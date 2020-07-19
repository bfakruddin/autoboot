package com.integration.practicing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WebDriverFactory implements WebDriverAbstractFactory {
    private WebDriver driver;

    /*public WebDriverFactory() {
    }

    public WebDriverFactory(String browserType) {
        switch (browserType.toLowerCase()){
            case "firefox":
                System.setProperty("webdriver.firefox.marionette", "/Users/babafakruddindudekula/Documents/Technical-Practicing/Automation/selenium-drivers/geckodriver.exe");
                DesiredCapabilities capabilities=DesiredCapabilities.firefox();
                capabilities.setCapability("marionette", true);
                driver = new FirefoxDriver();
                break;
            case "internetexplorer":
                driver = new InternetExplorerDriver();
                break;
            case "chrome":
                driver = new ChromeDriver();
                break;
            default:
                driver = new FirefoxDriver();
                break;
        }
    }*/

    public WebDriver setWebDriver(String browserType) {
        switch (browserType.toLowerCase()){
            case "firefox":
                System.setProperty("webdriver.firefox.marionette", "/Users/babafakruddindudekula/Documents/Technical-Practicing/Automation/selenium-drivers/geckodriver.exe");
                DesiredCapabilities capabilities=DesiredCapabilities.firefox();
                capabilities.setCapability("marionette", true);
                driver = new FirefoxDriver();
                break;
            case "internetexplorer":
                driver = new InternetExplorerDriver();
                break;
            case "chrome":
                driver = new ChromeDriver();
                break;
            default:
                driver = new FirefoxDriver();
                break;
        }
        return driver;
    }

    public WebDriver getWebDriver() {
        return this.driver;
    }
}
