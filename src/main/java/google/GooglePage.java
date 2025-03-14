package google;

import defaultPage.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GooglePage extends Page {

    By logo = By.xpath("//img[@class='lnXdpd']");

    public GooglePage(WebDriver driver) {
        super(driver);
    }

    public GooglePage navigateTo (String url){
        driver.navigate().to(url);
        return this;
    }
    public boolean isLogoDisplayed(){
        return driver.findElement(logo).isDisplayed();
    }
    public String getTitle(){
       return driver.getTitle();
    }
}
