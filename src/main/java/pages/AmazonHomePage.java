package pages;

import com.automation.qa.ttafmobilecore.page.BasicPage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import panels.AmazonHeaderPanel;

/**
 * Created by DilshanF on 11/7/2018.
 */
public class AmazonHomePage extends BasicPage {

    public AmazonHeaderPanel amazonHeaderPanel;

    @FindBy(id = "nav-logobar-greeting")
    private WebElement signIn_icon;
    /**
     * Initialize AmazonHomePage elements
     *
     * @param driver
     * @throws Exception
     */
    public AmazonHomePage(AppiumDriver driver) throws Exception {
        super(driver);
        //Initialize Elements
        PageFactory.initElements(driver, this);
        amazonHeaderPanel = new AmazonHeaderPanel(driver);
    }

    public boolean check_HomePage_Page_Title() throws Exception {
        String expectedTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        return driver.getTitle().equals(expectedTitle);
    }

    public void click_signIn_button(){
        signIn_icon.click();
    }

}
