package pages;

import com.automation.qa.ttafmobilecore.page.BasicPage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by DilshanF on 11/7/2018.
 */
public class AmazonHomePage extends BasicPage {

    @FindAll({
            @FindBy(id = "nav-logobar-greeting"),
            @FindBy(id = "nav-link-accountList")
    })
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
    }

    public void click_signIn_button() {
        signIn_icon.click();
    }

}
