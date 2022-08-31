package com.kodilla.selenium.ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EBayTestingApp {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        driver.get("https://www.ebay.pl/");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gdpr-banner-accept")));
        driver.switchTo().frame(0);
        driver.findElement(By.id("gdpr-banner-accept")).click();
        driver.switchTo().defaultContent();
        driver.findElement(By.id("gh-ac")).sendKeys("Laptop");
        driver.findElement(By.id("gh-btn")).click();
    }
}
