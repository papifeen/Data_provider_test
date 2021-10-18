package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YouTubePageSearch {

    @FindBy(xpath = "//input[@class='gLFyf gsfi']")
    WebElement googleSearchBar;

    @FindBy(xpath = "/html/body/div[7]/div/div[9]/div[1]/div/div[2]/div[2]/div/div/div[1]/div/div/div/div/div/div/div[1]/a/h3")
    WebElement goToYoutubePage;

    @FindBy(id = "search")
    WebElement ytSearchBar;

    @FindBy(id = "search-icon-legacy")
    WebElement ytSearchBtn;

    public void searchYoutubePage(String googleSearch, String ytSearch){
        googleSearchBar.sendKeys(googleSearch);
        goToYoutubePage.click();
        ytSearchBar.sendKeys(ytSearch);
        ytSearchBtn.click();

    }

}

