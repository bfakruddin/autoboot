package com.runner;

import com.computer.SystemInfo;
import com.integration.constants.DriverType;
import com.integration.constants.TestType;
import com.integration.designedpiece.TestFactory;
import com.integration.designedpiece.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class TestRunner {
    public static void main(String[] args) {
        /*System.setProperty("webdriver.firefox.marionette", "/Users/babafakruddindudekula/Documents/Technical-Practicing/Automation/selenium-drivers/geckodriver.exe");

        DesiredCapabilities capabilities=DesiredCapabilities.firefox();

        capabilities.setCapability("marionette", true);

        WebDriver driverFactory = new DriverFactory("Firefox").getWebDriver();
]=-
        driverFactory.get("http://www.google.com");

        driverFactory.quit();*/

        /*WebDriver driver = new WebDriverFactory("firefox").getWebDriver();
        driver.get("http://www.google.com");
        driver.quit();*/

        /**
         * Below Code is creating instance for our Test type and kick off your testing
         * */
        TestFactory testFactory = new TestFactory(TestType.WEB, DriverType.FIREFOX);
        TestFactory.WebActions actions = testFactory.new WebActions();

        testFactory.get("http://google.com");
        testFactory.findElement(By.xpath("//input[@title='Search']")).sendKeys("Hello world");
        actions.clear();
        actions.sendKeys("India");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        testFactory.quit();

        SystemInfo systemInfo = new SystemInfo();
        System.out.println(systemInfo.getHostName());

        /**
         * Below code to read system properties for logging and reporting in automation framework
         * */
        /*Properties systemProps = System.getProperties();
        Set<Map.Entry<Object, Object>> sets = systemProps.entrySet();

        System.out.println(systemProps.getProperty("user.name"));


        System.out.println("systems properties:");
        for(Map.Entry<Object,Object> entry : sets) {
            System.out.println("name: " + entry.getKey() + ", value: " + entry.getValue());
        }*/



        /*///Applications/Google Chrome.app/Contents/MacOS
        ProcessBuilder processBuilder = new ProcessBuilder();

        //Get Google installation is available or not with version
        processBuilder.command("bash", "-c", "/Applications/Google\\ Chrome.app/Contents/MacOS/Google\\ Chrome --version");
        processBuilder.command("bash", "-c", "/Applications/Firefox.app/Contents/MacOS/firefox --version");
        processBuilder.command("bash", "-c", "/usr/libexec/PlistBuddy -c \"print :CFBundleShortVersionString\" /Applications/Safari.app/Contents/Info.plist");

        try {

            Process process = processBuilder.start();

            StringBuilder output = new StringBuilder();

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(process.getInputStream()));

            String line;
            while ((line = reader.readLine()) != null) {
                output.append(line + "\n");
            }

            int exitVal = process.waitFor();
            if (exitVal == 0) {
                System.out.println("Success!");
                System.out.println(output);
                System.exit(0);
            } else {
                System.out.println("Failed!");
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

    }
}
