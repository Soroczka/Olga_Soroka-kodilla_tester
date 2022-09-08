package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

public class GoogleResults extends AbstractPage{
    //@FindBy(css = "div[jscontroller] > div >div > .yuRUbf > a[href]")
    @FindBy(css = "div[jscontroller] > div >div > .yuRUbf > a[href]")
    private List<WebElement> results;
    public GoogleResults(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }


    public static int generateRandomInt(List<WebElement> results){
        Random random = new Random();
        return random.nextInt(results.size());
    }

    public void iSeeResults() {
        System.out.println("I see results");
        System.out.println(results.size());
    }

    public void clickAndGetRandomResult(){
        GoogleSearch googleSearch = new GoogleSearch(driver);
        googleSearch.searchResults();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result-stats")));

        int randomValue = generateRandomInt(results);
        System.out.println(randomValue);
        results.get(randomValue).click();
    }

    public List<WebElement> getResults() {
        return results;
    }
}
