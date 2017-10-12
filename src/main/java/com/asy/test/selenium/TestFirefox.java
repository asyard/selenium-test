package com.asy.test.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by asy
 */
public class TestFirefox {

    public static void main(String[] args) {
        System.setProperty("webdriver.firefox.marionette","C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
        //System.setProperty("webdriver.gecko.driver","C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
        WebDriver firefoxDriver = new FirefoxDriver();

        firefoxDriver.get("http://www.amazon.com");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        firefoxDriver.close();

    }


}
