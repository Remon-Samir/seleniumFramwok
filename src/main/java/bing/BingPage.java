package bing;

import defaultPage.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BingPage extends Page {
        By searchField = By.xpath("//textarea[@id='sb_form_q' and @name='q']");

            public BingPage(WebDriver driver){
                super(driver);
            }

            public BingPage navigateTo (String url){
                driver.navigate().to(url);
                return this;
            }
            public BingSearchResultPage searchFor(String text) throws InterruptedException {
                Thread.sleep(3000);
                Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5));
                wait.until(d -> {driver.findElement(searchField).isEnabled() ;
                    driver.findElement(searchField).sendKeys(text);
                    driver.findElement(searchField).submit();
                    return true;
                });
                return new BingSearchResultPage(driver);
            }


}
