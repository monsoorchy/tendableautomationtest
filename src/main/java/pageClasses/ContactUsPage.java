package pageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ContactUsPage extends BasePage {
    public ContactUsPage(WebDriver driver) {
        super(driver);
    }

    By marketingContact = By.xpath("(//button[@class='body-button bg-plain-600 toggle-control'])[1]");
    By fullName = By.xpath("(//input[@id='form-input-fullName'])[1]");
    By organisationName = By.xpath("(//input[@id='form-input-organisationName'])[1]");
    By phoneNumber = By.xpath("(//input[@id='form-input-cellPhone'])[1]");
    By email = By.xpath("(//input[@id='form-input-email'])[1]");
    By errorMessage = By.xpath("//*[@class='ff-form-errors']");

    By submitButton = By.xpath("//input[@type='hidden']//preceding-sibling::div//following-sibling::button");

    By agree = By.xpath("//*[contains(@class,'hidden radioButtons')]//following-sibling::label//input");

    public void clickMarketingContact() {
        driver.findElement(marketingContact).click();
    }

    public void submitForm() {
        String fullName = "John Rex";
        String organisationName = "Teed Inc";
        String phoneNumber = "010-44551126";
        String email = "john@teed.com";

        driver.findElement(this.fullName).sendKeys(fullName);
        driver.findElement(this.organisationName).sendKeys(organisationName);
        driver.findElement(this.phoneNumber).sendKeys(phoneNumber);
        driver.findElement(this.email).sendKeys(email);
        WebElement agree = driver.findElement(this.agree);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement submitBtn = wait.until(ExpectedConditions.presenceOfElementLocated(submitButton));

        javascriptClick(agree);
        javascriptClick(submitBtn);
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }

    public WebElement webDriverWait() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessage));
    }

    public void javascriptClick(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
    }
}

