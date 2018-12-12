package step_definitions;

import com.automation.qa.ttafmobilecore.driver.DriverFactory;
import com.automation.qa.ttafmobilecore.driver.DriverManager;
import cucumber.api.java.en.Then;
import org.apache.log4j.Logger;
import org.testng.Assert;
import pages.AmazonLoginPage;

/**
 * Created by DilshanF on 11/8/2018.
 */
public class AmazonLoginPageSteps extends DriverFactory {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(AmazonLoginPageSteps.class));
    AmazonLoginPage amazonLoginPage;

    @Then("^I should be redirected to Login page$")
    public void i_should_be_redirected_to_page() throws Throwable {
        amazonLoginPage = new AmazonLoginPage(DriverManager.getTLDriver());
        boolean pageType = amazonLoginPage.verify_Current_Page();
        Assert.assertTrue(pageType, "Navigate to invalid Page.");
        LOGGER.info("I am on the Login Page");
    }
}
