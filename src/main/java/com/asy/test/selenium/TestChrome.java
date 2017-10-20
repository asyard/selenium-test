package com.asy.test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

    private static String userName = "";
    private static String userPass = "";

    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
        System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("http://www.gmail.com");

        new WebDriverWait(chromeDriver, 20).until(
                webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));

        WebDriverWait wait = new WebDriverWait(chromeDriver, 10);

        WebElement userNameTextbox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("identifierId")));
        userNameTextbox.click();
        userNameTextbox.sendKeys(userName);

        chromeDriver.findElement(By.id("identifierNext")).click();

        WebElement passwordTextbox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        passwordTextbox.click();
        passwordTextbox.sendKeys(userPass);

        chromeDriver.findElement(By.id("passwordNext")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("T-I-KE")));

        chromeDriver.close();
    }

}
