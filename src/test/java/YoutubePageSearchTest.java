import Data.DataProviderInitializaiton;
import Pages.GoogleHomePage;
import Pages.YouTubePageSearch;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class YoutubePageSearchTest {
    WebDriver driver;
    GoogleHomePage googleHomePage;
    String sheetName = "GoogleSearchTest" ;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/selenium/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize(); //maximize window
        driver.manage().deleteAllCookies(); //delete cookies
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.google.ca/");

    }

    @AfterMethod
    public void quit(){
        driver.quit();

}
    @DataProvider
    public Object [][] getTestData(){
        Object data [][] = DataProviderInitializaiton.getTestData(sheetName);
        return data;

    }
@Test
    public void test(){
    YouTubePageSearch yt = new YouTubePageSearch();
    yt.searchYoutubePage("yt", "i love programming");

}
}