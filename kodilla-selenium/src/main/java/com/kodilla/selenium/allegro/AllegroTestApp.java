package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class AllegroTestApp {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.get("https://allegro.pl/");
        //cookies
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"opbox-gdpr-consents-modal\"]/div/div[2]/div/div[2]/button[1]")));
        driver.findElement(By.xpath("//*[@id=\"opbox-gdpr-consents-modal\"]/div/div[2]/div/div[2]/button[1]")).click();
        //wyszukiwanie
        WebElement categoryCombo = driver.findElement(By.cssSelector(".mp7g_oh > select[class*='mr3m_1']"));
        Select categorySelect = new Select(categoryCombo);
        categorySelect.selectByVisibleText("Elektronika");
        driver.findElement(By.cssSelector("input[data-role='search-input']")).sendKeys("Mavic mini");
        driver.findElement(By.className(".b1vwg")).submit();
        //pobieranie listy elementów
        List<WebElement> elements = new ArrayList<>();
        elements = driver.findElements(By.cssSelector("section>article"));
        for (WebElement element: elements){
            System.out.println(element.getText());
        }


        //dla e-baya
//        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        driver.get("https://www.ebay.pl/");
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gdpr-banner-accept")));
//        driver.switchTo().frame(0);
//        driver.findElement(By.id("gdpr-banner-accept")).click();
//        WebElement categoryCombo = driver.findElement(
//                By.xpath("//*[@id=\"gh-cat-td\"]/div/select"));
//        Select categorySelect = new Select(categoryCombo);
//        categorySelect.selectByVisibleText("Fotografia i Kamery");
//        driver.findElement(By.xpath("//*[@id=\"gh-ac-box\"]/div/input[1]")).sendKeys("Mavic mini");
//        driver.findElement(By.xpath("//*[@id=\"gh-f\"]/table/tbody/tr/td[3]/input")).submit();
    }
}
