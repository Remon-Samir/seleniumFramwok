package testGoogle;

import bing.BingPage;
import google.GooglePage;


import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends TestCase {

    @Test
    public void testGooglePageTitleInBrowser(){
        Assert.assertEquals( new GooglePage(driver).navigateTo("https://www.google.com/ncr").getTitle(), "Google");
    }
    @Test
    public void testDisplayingGoogleLogo(){
        Assert.assertTrue(new GooglePage(driver).navigateTo("https://www.google.com/ncr").isLogoDisplayed());
    }
@Test
    public void testThirdResultInFirefox(){
        Assert.assertEquals(new BingPage(driver).navigateTo("https://www.bing.com").searchFor("TestNG").getThirdSearchResult(), "TestNG Tutorial");
}
}
