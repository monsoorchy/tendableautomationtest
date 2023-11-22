package pageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
    // Define locators
    public HomePage(WebDriver driver) {
        super(driver);
    }

    By tendableHome = By.xpath("//a[@class='logo']//img");
    By contactUsHome = By.linkText("Contact Us");
    WebElement element = driver.findElement(By.xpath("//*[@id='searchPanel']//following::a[@class='button']"));

    public void clickHomePage() {
        driver.findElement(tendableHome).click();
    }

    public String homePageUrl() {
        driver.findElement(tendableHome).click();
        return driver.getCurrentUrl();
    }

    public void verifyRequestButtonOn(String message) {
        try {
            if (element.isDisplayed()) {
                System.out.println("Element is present on " + message);
            } else {
                System.out.println("Element is not present on " + message);
            }
        } catch (StaleElementReferenceException e) {
            //refresh the page
            driver.navigate().refresh();
            //re-find the element
            WebElement element = driver.findElement(By.xpath("//*[@id='searchPanel']//following::a[@class='button']"));
            if (element.isDisplayed()) {
                System.out.println("Element is present on " + message);
            } else {
                System.out.println("Element is not present on " + message);
            }
        }
    }

    public void clickContactUs() {
        driver.findElement(contactUsHome).click();
    }
}