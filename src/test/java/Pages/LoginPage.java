package Pages;


import Objects.LoginObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(xpath = "//*[@id='username']")
    private WebElement usernameElement;

    @FindBy(xpath = "//*[@id='noo-site']/header/div[1]/div/ul[2]/li[2]/a")
    private WebElement account;

    @FindBy(xpath="/html/body/p/a")
    private  WebElement dismissBttn;

    @FindBy(xpath = "//*[@id='password']")
    private WebElement parola;

    @FindBy(xpath="//*[@id='customer_login']/div[1]/form/p[3]/button")
    private WebElement loginBttn;

    @FindBy(tagName = "strong")
    private WebElement error;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void LoginInvalid(LoginObject loginObject){

        element.fillElement(usernameElement, loginObject.getUsernameInvalid());

        element.fillElement(parola, loginObject.getPassword());
        element.clickElement(loginBttn);
        element.validateElementText(error, loginObject.getMessage());




    }

}
