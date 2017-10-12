package com.asy.test.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Created by asy
 *
 * Do not use iexplore.exe from installed directory. Instead, use ie driver.
 *
 * For ie driver use : https://github.com/SeleniumHQ/selenium/wiki/InternetExplorerDriver
 *
 */
public class TestInternetExplorer11 {

    public static void main(String[] args) {
        System.setProperty("webdriver.ie.driver","C:\\selenium\\IEDriverServer_x64_3.6.0\\IEDriverServer.exe");
        WebDriver internetExplorerDriver = new InternetExplorerDriver();
        internetExplorerDriver.get("http://www.msn.com");

        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        internetExplorerDriver.close();
    }


}
