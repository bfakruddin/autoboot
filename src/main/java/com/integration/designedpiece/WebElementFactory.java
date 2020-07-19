package com.integration.designedpiece;

import org.openqa.selenium.*;

import java.util.List;

public class WebElementFactory implements WebElement{
    private WebElement webElement;

    @Override
    public void click() {
        this.webElement.click();
    }

    @Override
    public void submit() {
        this.webElement.submit();
    }

    @Override
    public void sendKeys(CharSequence... keysToSend) {
        System.out.println("Entered into sending keys webelement method");
        this.webElement.sendKeys(keysToSend);
    }

    @Override
    public void clear() {
        this.webElement.clear();
    }

    @Override
    public String getTagName() {
        return this.webElement.getTagName();
    }

    @Override
    public String getAttribute(String name) {
        return this.webElement.getAttribute(name);
    }

    @Override
    public boolean isSelected() {
        return this.webElement.isSelected();
    }

    @Override
    public boolean isEnabled() {
        return this.webElement.isEnabled();
    }

    @Override
    public String getText() {
        return this.webElement.getText();
    }

    @Override
    public List<WebElement> findElements(By by) {
        return this.webElement.findElements(by);
    }

    @Override
    public WebElement findElement(By by) {
        return this.webElement.findElement(by);
    }

    @Override
    public boolean isDisplayed() {
        return this.webElement.isDisplayed();
    }

    @Override
    public Point getLocation() {
        return this.webElement.getLocation();
    }

    @Override
    public Dimension getSize() {
        return this.webElement.getSize();
    }

    @Override
    public Rectangle getRect() {
        return this.webElement.getRect();
    }

    @Override
    public String getCssValue(String propertyName) {
        return this.webElement.getCssValue(propertyName);
    }

    @Override
    public <X> X getScreenshotAs(OutputType<X> target) throws WebDriverException {
        return this.webElement.getScreenshotAs(target);
    }

    public void setWebElement(WebElement webElement) {
        this.webElement = webElement;
    }

    public WebElement getWebElement(){
        return this.webElement;
    }
}
