package pageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OurSolutionPage extends BasePage {
    By ourSolution = By.linkText("Our Solution");

    public OurSolutionPage(WebDriver driver) {
        super(driver);
    }

    public String ourSolution() {
        driver.findElement(ourSolution).click();
        return driver.getCurrentUrl();
    }

    public void clickOurSolution() {
        driver.findElement(ourSolution).click();
    }
}