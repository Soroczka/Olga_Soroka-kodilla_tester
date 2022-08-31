package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllegroTestApp {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.get("https://allegro.pl");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"opbox-gdpr-consents-modal\"]/div/div[2]/div/div[2]/button[1]")));
        driver.findElement(By.xpath("//*[@id=\"opbox-gdpr-consents-modal\"]/div/div[2]/div/div[2]/button[1]")).click();
        WebElement categoryCombo = driver.findElement(By.xpath("//*[@data-box-id=\"h4GzErVDTJybCQTEmPd4NA==MGW2gATtQkKizzQ2dQGp-A==\"]/div/form/div[3]/div/select"));
        Select categorySelect = new Select(categoryCombo);
        categorySelect.selectByVisibleText("Elektronika");
        driver.findElement(By.xpath("//*[@data-box-id=\"h4GzErVDTJybCQTEmPd4NA==MGW2gATtQkKizzQ2dQGp-A==\"]/div/form/input")).sendKeys("Mavic mini");
        driver.findElement(By.xpath("//*[@data-box-id=\"h4GzErVDTJybCQTEmPd4NA==MGW2gATtQkKizzQ2dQGp-A==\"]/div/form/button")).submit();

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
