package pageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OurStoryPage extends BasePage {
    By ourStory = By.linkText("Our Story");

    public OurStoryPage(WebDriver driver) {
        super(driver);
    }

    public String ourStory() {
        driver.findElement(ourStory).click();
        return driver.getCurrentUrl();
    }

    public void clickOurStory() {
        driver.findElement(ourStory).click();
    }
}
