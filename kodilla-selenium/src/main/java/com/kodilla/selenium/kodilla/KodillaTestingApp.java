package com.kodilla.selenium.kodilla;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KodillaTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://kodilla.com/pl/sign-in");

        driver.findElement(By.xpath("//html/body/div/div/form/fieldset/input")).sendKeys("testuser@gmail.com");
        driver.findElement(By.xpath("//html/body/div/div/form/fieldset[2]/input")).sendKeys("Haslo");
        driver.findElement(By.xpath("//*[@id=\"sign-in\"]/form/div[2]/button")).submit();
    }
}
