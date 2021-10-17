package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleHomePage {

    @FindBy(xpath = "//input[@class='gLFyf gsfi']")
    WebElement googleSearchBar;

    @FindBy(xpath = "//div[@class='lJ9FBc']//child::input[@class='gNO89b']")
    WebElement googleSearchBtn;

    public void googleSearch(String GoogleSearch) throws InterruptedException {
        googleSearchBar.sendKeys(GoogleSearch);
        //Thread.sleep(2000);
        googleSearchBtn.click();

    }
}

