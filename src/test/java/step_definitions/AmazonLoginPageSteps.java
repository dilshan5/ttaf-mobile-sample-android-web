package step_definitions;

import com.automation.qa.ttafmobilecore.driver.DriverManager;
import cucumber.api.java.en.Then;
import io.appium.java_client.AppiumDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import pages.AmazonLoginPage;

/**
 * Created by DilshanF on 11/8/2018.
 */
public class AmazonLoginPageSteps {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(AmazonLoginPageSteps.class));
    AppiumDriver driver = DriverManager.getDriver();
    AmazonLoginPage amazonLoginPage;

    @Then("^I should be redirected to Login page$")
    public void i_should_be_redirected_to_page() throws Throwable {
        Reporter.log("Then I should be redirected to Login page");
        amazonLoginPage = new AmazonLoginPage(driver);
        boolean pageType = amazonLoginPage.verify_Current_Page();
        Assert.assertTrue(pageType, "Navigate to invalid Page.");
        LOGGER.info("I am on the Login Page");
    }
}
