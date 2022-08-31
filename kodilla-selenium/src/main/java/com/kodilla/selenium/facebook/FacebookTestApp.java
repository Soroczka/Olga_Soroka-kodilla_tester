package com.kodilla.selenium.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class FacebookTestApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://pl-pl.facebook.com/");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/button[2]")));
        driver.findElement(By.xpath("//div/button[2]")).click();
        driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("year")));
        //WebElement yearCombo = driver.findElement(By.id("year"));
        WebElement yearCombo = driver.findElement(
                By.xpath("//*[@id=\"birthday_wrapper\"]/div/span/span/select[3]"));
        Select yearSelect = new Select(yearCombo);
        yearSelect.selectByIndex(5);
    }
}
