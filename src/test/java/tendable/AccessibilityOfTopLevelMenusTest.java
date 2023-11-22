package tendable;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageClasses.HomePage;
import pageClasses.OurSolutionPage;
import pageClasses.OurStoryPage;
import pageClasses.WhyTendablePage;

public class AccessibilityOfTopLevelMenusTest extends BaseTest {
    @Test
    public void verifyAccessibilityOfOurSolution() {
        String expectedOurSolutionUrl = "https://www.tendable.com/our-solution";
        String expectedHomeUrl = "https://www.tendable.com/";
        String expectedWhyTendable = "https://www.tendable.com/why-tendable";
        String expectedOurStory = "https://www.tendable.com/our-story";

        OurSolutionPage ourSolutionPage = new OurSolutionPage(driver);
        HomePage homePage = new HomePage(driver);
        OurStoryPage ourStory = new OurStoryPage(driver);
        WhyTendablePage whyTendable = new WhyTendablePage(driver);

        //Verify Our Solution link
        String ourSolutionUrl = ourSolutionPage.ourSolution();
        Assert.assertEquals(ourSolutionUrl, expectedOurSolutionUrl, "Our Solution link is not accessible");

        //Verify Home Page
        homePage.clickHomePage();
        String homePageUrl = homePage.homePageUrl();
        Assert.assertEquals(homePageUrl, expectedHomeUrl, "Home Page link is not accessible");

        //Verify Our Story link
        ourStory.clickOurStory();
        String ourStoryUrl = ourStory.ourStory();
        Assert.assertEquals(ourStoryUrl, expectedOurStory, "Our Story link is not accessible");

        //Verify Why Tendable
        whyTendable.clickWhyTendable();
        String whyTendableUrl = whyTendable.whyTendableUrl();
        Assert.assertEquals(whyTendableUrl, expectedWhyTendable, "Why Tendable link is not accessible");

    }
}
