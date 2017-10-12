package com.asy.test.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by asy
 *
 *
 * Do not use chrome.exe from installed directory. Instead, use : https://sites.google.com/a/chromium.org/chromedriver/downloads
 *
 * Current version :  ChromeDriver 2.33 (Supports Chrome v60-62)
 *
 */
public class TestChrome {

    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
        System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("http://www.yahoo.com");

        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        chromeDriver.close();
    }

}
