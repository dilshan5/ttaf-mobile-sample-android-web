package pages;

import com.automation.qa.ttafmobilecore.page.BasicPage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import panels.AmazonHeaderPanel;

/**
 * Created by DilshanF on 11/8/2018.
 */
public class AmazonLoginPage extends BasicPage {
    public AmazonHeaderPanel amazonHeaderPanel;

    @FindBy(id = "signInSubmit")
    private WebElement signIn_button;

    /**
     * Initialize AmazonLoginPage elements
     *
     * @param driver
     * @throws Exception
     */
    public AmazonLoginPage(AppiumDriver driver) throws Exception {
        super(driver);
        //Initialize Elements
        PageFactory.initElements(driver, this);
        amazonHeaderPanel = new AmazonHeaderPanel(driver);
    }

    public boolean verify_Current_Page() throws Exception {
        return driver.getCurrentUrl().toLowerCase().contains("/ap/signin?");
    }
}
