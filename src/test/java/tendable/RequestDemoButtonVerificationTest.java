package tendable;

import org.testng.annotations.Test;
import pageClasses.HomePage;
import pageClasses.OurSolutionPage;
import pageClasses.OurStoryPage;
import pageClasses.WhyTendablePage;

public class RequestDemoButtonVerificationTest extends BaseTest {
    @Test
    public void verifyRequestDemo() {
        OurSolutionPage ourSolutionPage = new OurSolutionPage(driver);
        HomePage homePage = new HomePage(driver);
        OurStoryPage ourStory = new OurStoryPage(driver);
        WhyTendablePage whyTendable = new WhyTendablePage(driver);

        //Verify Request Button in Home Page
        homePage.clickHomePage();
        homePage.verifyRequestButtonOn("Home Page");

        //Verify Request Button in Our Solution Page
        ourSolutionPage.clickOurSolution();
        homePage.verifyRequestButtonOn("Solution Page");

        //Verify Request Button in Our Story Page
        ourStory.clickOurStory();
        homePage.verifyRequestButtonOn("Our Story Page");

        //Verify Request Button in Why Tendable Page
        whyTendable.clickWhyTendable();
        homePage.verifyRequestButtonOn("Why Tendable Page");
    }
}
