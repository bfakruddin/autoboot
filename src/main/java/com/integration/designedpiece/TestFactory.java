package com.integration.designedpiece;

import com.integration.constants.DriverType;
import com.integration.constants.TestType;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
import org.openqa.selenium.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.List;
import java.util.Set;

public class TestFactory implements TestAbstractFactory {
    private WebDriver webDriver;
    private HttpClient httpClient;
    private WebElement webElement = null;
    private WebActions actions = null;

    public HttpClient getHttpClient() {
        return httpClient;
    }

    public TestFactory() {    }

    public TestFactory(TestType testType, DriverType... driverType) {
        if(testType.equals(TestType.WEB)){
            if(driverType.length==0) {
                WebDriverFactory webDriverFactory = new WebDriverFactory(DriverType.FIREFOX);
                this.webDriver = webDriverFactory.getWebDriver();
//                webElement = new WebElementFactory();
            }else{
                WebDriverFactory webDriverFactory = new WebDriverFactory(driverType[0]);
                this.webDriver = webDriverFactory.getWebDriver();
            }
        }else{        }
    }

    public WebDriver getWebDriver(DriverType driverType){
        return this.webDriver;
    }

    /**
     * Selenium WebDriver override methods
     */
    @Override
    public void get(String s) {
        this.webDriver.get(s);
    }

    @Override
    public String getCurrentUrl() {
        return this.webDriver.getCurrentUrl();
    }

    @Override
    public String getTitle() {
        return this.webDriver.getTitle();
    }

    @Override
    public List<WebElement> findElements(By by) {
        return this.webDriver.findElements(by);
    }

    @Override
    public WebElement findElement(By by) {
//        System.out.println("Entered into Find element method");
        webElement = webDriver.findElement(by);
//        actions = new WebActions();
//        actions.setWebElement(webElement);
        return webElement;
    }

    @Override
    public String getPageSource() {
        return this.webDriver.getPageSource();
    }

    @Override
    public void close() {
        this.webDriver.close();
    }

    @Override
    public void quit() {
        this.webDriver.quit();
    }

    @Override
    public Set<String> getWindowHandles() {
        return this.webDriver.getWindowHandles();
    }

    @Override
    public String getWindowHandle() {
        return this.webDriver.getWindowHandle();
    }

    @Override
    public TargetLocator switchTo() {
        return this.webDriver.switchTo();
    }

    @Override
    public Navigation navigate() {
        return this.webDriver.navigate();
    }

    @Override
    public Options manage() {
        return this.webDriver.manage();
    }

    /**
     * HTTP Client Methods Overrides
     * */
    @Override
    public HttpParams getParams() {
        return null;
    }

    @Override
    public ClientConnectionManager getConnectionManager() {
        return null;
    }

    @Override
    public HttpResponse execute(HttpUriRequest httpUriRequest) throws IOException, ClientProtocolException {
        return null;
    }

    @Override
    public HttpResponse execute(HttpUriRequest httpUriRequest, HttpContext httpContext) throws IOException, ClientProtocolException {
        return null;
    }

    @Override
    public HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest) throws IOException, ClientProtocolException {
        return null;
    }

    @Override
    public HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws IOException, ClientProtocolException {
        return null;
    }

    @Override
    public <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler) throws IOException, ClientProtocolException {
        return null;
    }

    @Override
    public <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) throws IOException, ClientProtocolException {
        return null;
    }

    @Override
    public <T> T execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) throws IOException, ClientProtocolException {
        return null;
    }

    @Override
    public <T> T execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) throws IOException, ClientProtocolException {
        return null;
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public void setWebDriver(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void setHttpClient(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public WebElement getWebElement() {
        return webElement;
    }

    public void setWebElement(WebElement webElement) {
        this.webElement = webElement;
    }

    public WebActions getActions() {
        return actions;
    }

    public void setActions(WebActions actions) {
        this.actions = actions;
    }

    public class WebActions implements WebElement{
//        WebElement webElement;

        /*public WebActions(){
            TestFactory testFactory = new TestFactory();
            webElement = testFactory.getWebElement();
        }*/

        @Override
        public void click() {
            webElement.click();
        }

        @Override
        public void submit() {
            webElement.submit();
        }

        @Override
        public void sendKeys(CharSequence... keysToSend) {
//            System.out.println("Entered into sending keys webelement method");
            webElement.sendKeys(keysToSend);
        }

        @Override
        public void clear() {
            webElement.clear();
        }

        @Override
        public String getTagName() {
            return webElement.getTagName();
        }

        @Override
        public String getAttribute(String name) {
            return webElement.getAttribute(name);
        }

        @Override
        public boolean isSelected() {
            return webElement.isSelected();
        }

        @Override
        public boolean isEnabled() {
            return webElement.isEnabled();
        }

        @Override
        public String getText() {
            return webElement.getText();
        }

        @Override
        public List<WebElement> findElements(By by) {
            return webElement.findElements(by);
        }

        @Override
        public WebElement findElement(By by) {
            return webElement.findElement(by);
        }

        @Override
        public boolean isDisplayed() {
            return webElement.isDisplayed();
        }

        @Override
        public Point getLocation() {
            return webElement.getLocation();
        }

        @Override
        public Dimension getSize() {
            return webElement.getSize();
        }

        @Override
        public Rectangle getRect() {
            return webElement.getRect();
        }

        @Override
        public String getCssValue(String propertyName) {
            return webElement.getCssValue(propertyName);
        }

        @Override
        public <X> X getScreenshotAs(OutputType<X> target) throws WebDriverException {
            return webElement.getScreenshotAs(target);
        }

        public void setWebElement(WebElement webElmnt) {
            webElement = webElmnt;
        }

        public WebElement getWebElement(){
            return webElement;
        }
    }
}



