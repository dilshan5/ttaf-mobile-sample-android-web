package panels;

import com.automation.qa.ttafmobilecore.page.BasicPage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonHeaderPanel extends BasicPage {
    private WebDriverWait wait = new WebDriverWait(driver, 100);
    @FindBy(id = "nav-search-keywords")
    private WebElement searchBox;

    @FindBy(css = "input.nav-input")
    private WebElement searchIcon;

    @FindBy(id = "nav-button-cart")
    private WebElement addToCart;

    /**
     * Initialize AmazonHeaderPanel elements
     *
     * @param driver
     * @throws Exception
     */
    public AmazonHeaderPanel(AppiumDriver driver) throws Exception {
        super(driver);
        //Initialize Elements
        PageFactory.initElements(driver, this);
    }

    public void search_for(String keyword) throws Exception {
     //   wait.until(ExpectedConditions.visibilityOf(searchBox));
        searchBox.sendKeys(keyword);
     //   wait.until(ExpectedConditions.elementToBeClickable(searchIcon));
        searchIcon.click();
    }

    public void click_Add_to_cart() throws Exception {
     //   wait.until(ExpectedConditions.elementToBeClickable(addToCart));
        addToCart.click();
    }
}
