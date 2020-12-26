package com.integration.designedpiece;

import com.integration.constants.DriverType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebDriverFactory{
    private WebDriver webDriver;

    public WebDriverFactory(DriverType... browserType) {
        if(browserType.length==0) {
            webDriver = new WebDriverBuilder().getFirefoxDriver();
        }else{
            if(browserType[0].equals(DriverType.FIREFOX)){
                webDriver = new WebDriverBuilder().getFirefoxDriver();
            }else if(browserType[0].equals(DriverType.CHROME)){
                webDriver = new WebDriverBuilder().getChromeDriver();
            }else if(browserType[0].equals(DriverType.IE)){
                webDriver = new WebDriverBuilder().getInternetExplorerDriver();
            }else if (browserType[0].equals(DriverType.SAFARI)){
                webDriver = new WebDriverBuilder().getSafariDriver();
            }
        }
    }

    public WebDriver getWebDriver() {
        return this.webDriver;
    }
}
