package bing;

import defaultPage.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BingPage extends Page {
        By searchField = By.xpath("//textarea[@id='sb_form_q'][@name='q']");

            public BingPage(WebDriver driver){
                super(driver);
            }

            public BingPage navigateTo (String url){
                driver.navigate().to(url);
                return this;
            }
            public BingSearchResultPage searchFor(String text){
                driver.findElement(searchField).sendKeys(text);
                driver.findElement(searchField).submit();
                return new BingSearchResultPage(driver);
            }


}
