package bing;

import defaultPage.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class BingSearchResultPage extends Page {

    By thirdSearchResult = By.xpath("//h2/a[text()='TestNG Tutorial']");
    WebDriver driver;
    public BingSearchResultPage(WebDriver driver){
        super(driver);
    }

    public String getThirdSearchResult() {
          ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(thirdSearchResult));
        return driver.findElement(thirdSearchResult).getText();
    }
}
