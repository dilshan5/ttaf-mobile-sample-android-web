package step_definitions;

import com.automation.qa.ttafmobilecore.driver.DriverFactory;
import com.automation.qa.ttafmobilecore.driver.DriverManager;
import cucumber.api.java.en.Given;
import org.apache.log4j.Logger;
import pages.AmazonHomePage;

/**
 * Created by DilshanF on 11/7/2018.
 */
public class AmazonHomePageSteps extends DriverFactory {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(AmazonHomePageSteps.class));
    AmazonHomePage amazonHomePage;

    @Given("^I visit the web site as a guest user$")
    public void i_visit_the_web_site_as_a_guest_user() throws Throwable {
        amazonHomePage = new AmazonHomePage(DriverManager.getTLDriver());
        LOGGER.info("I am on Amazon Home page");
    }


    @Given("I click on Sign in  button on Home page")
    public void i_click_on_Sign_in_button_on_Home_page() {
        amazonHomePage.click_signIn_button();
    }
}
