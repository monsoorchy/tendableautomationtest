package pageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WhyTendablePage extends BasePage {
    By whyTendable = By.linkText("Why Tendable?");

    public WhyTendablePage(WebDriver driver) {
        super(driver);
    }

    public String whyTendableUrl() {
        driver.findElement(whyTendable).click();
        return driver.getCurrentUrl();
    }

    public void clickWhyTendable() {
        driver.findElement(whyTendable).click();
    }
}
