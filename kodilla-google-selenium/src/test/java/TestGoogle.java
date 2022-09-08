import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.GoogleResults;
import pages.GoogleSearch;

import java.util.List;

public class TestGoogle {
    WebDriver driver;
    WebDriverWait wait;

    @Before
    public void testSetup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\olga.soroka\\IdeaProjects\\kodilla-course\\chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
        driver.navigate().to("https://www.google.com");
        driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div")).click();
    }

//    @After
//    public void tearDown() {
//        driver.close();
//    }

    @Test
    public void testGooglePage() {
        GoogleSearch googleSearch = new GoogleSearch(driver);
        googleSearch.searchResults();
    }

    @Test
    public void testGoogleResult(){
        GoogleResults googleResults = new GoogleResults(driver);
        googleResults.clickAndGetRandomResult();
    }
}
