package tendable;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageClasses.ContactUsPage;
import pageClasses.HomePage;

public class MarketingFormTest extends BaseTest {
    @Test
    public void fillMarketingForm() {
        String expectedErrorMessage = "Sorry, there was an error submitting the form. Please try again.";
        String expectedRobotMessage = "Please verify that you are not a robot.";
        HomePage homePage = new HomePage(driver);
        ContactUsPage contactUsPage = new ContactUsPage(driver);

        homePage.clickHomePage();
        homePage.clickContactUs();
        contactUsPage.clickMarketingContact();
        contactUsPage.submitForm();
        contactUsPage.webDriverWait();
        String errorMessage = contactUsPage.getErrorMessage();
        Assert.assertTrue(errorMessage.equals(expectedErrorMessage) || errorMessage.contains(expectedRobotMessage));
    }
}