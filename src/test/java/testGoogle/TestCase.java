package testGoogle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public abstract class TestCase {
    WebDriver driver;
    ChromeOptions options;
    @BeforeMethod
    public void setup(){
        options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("window-size=1920,1080");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
