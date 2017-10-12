package com.asy.test.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

/**
 * Created by asy
 *
 * Do not use launcher.exe from installed directory. Instead, use opera driver.
 *
 * For opera driver use : https://github.com/operasoftware/operachromiumdriver/releases
 *
 *
 */
public class TestOpera {
    public static void main(String[] args) {
        //System.setProperty("webdriver.opera.driver","C:\\Program Files (x86)\\Opera\\launcher.exe");
        System.setProperty("webdriver.opera.driver","C:\\selenium\\operadriver_win64\\operadriver.exe");
        //System.setProperty("opera.binary","C:\\Program Files (x86)\\Opera\\launcher.exe");

        OperaOptions operaOptions = new OperaOptions();
        operaOptions.setBinary("C:\\Program Files (x86)\\Opera\\launcher.exe");

        WebDriver operaDriver = new OperaDriver(operaOptions);
        operaDriver.get("http://www.milliyet.com.tr");

        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        operaDriver.close();
        
    }
}
