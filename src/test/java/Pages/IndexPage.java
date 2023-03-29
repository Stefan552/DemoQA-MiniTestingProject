package Pages;

import HelpMethods.PageMethods;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IndexPage extends BasePage {
    @FindBy(xpath = "//*[@id='noo-site']/div[2]/div[2]/div/div/div[3]/div")
    private WebElement product;

    @FindBy(xpath = "//*[@id='noo-site']/header/div[3]/div[2]/form/input[1]")
    private WebElement searchLine;

    @FindBy(xpath = "//*[@id='noo-site']/header/div[2]/div/div/div/a")
    private WebElement searchElement;


    @FindBy ( xpath = "//*[@id='customer_login']/div[1]/form/p[3]/button" )
    private WebElement loginButton;

    @FindBy ( xpath = "//*[@id='password']" )
    private WebElement password;

    @FindBy ( xpath = "//*[@id='post-8']/div/div/div/p[1]/a" )
    private WebElement logout;

    @FindBy ( xpath = "//*[@id='username']" )
    private WebElement account2;

    @FindBy ( xpath = "//*[@id='customer_login']/div[2]/form/p[4]/button" )
    private WebElement registerButton;

    @FindBy ( xpath = "//*[@id='reg_password']" )
    private WebElement passwordElement;

    @FindBy ( xpath = "//*[@id='reg_email']" )
    private WebElement emailElement;

    @FindBy ( xpath = "//*[@id='reg_username']" )
    private WebElement usernameRegister;

    @FindBy ( xpath = "//*[@id='noo-site']/header/div[1]/div/ul[2]/li[2]/a" )
    private WebElement account;

    @FindBy ( xpath = "/html/body/p/a" )
    private WebElement dismissBttn;


    public IndexPage ( WebDriver driver ) {
        super ( driver );
    }
    public LoginPage produsClick ( ) {
        element.clickElement (product );

        return new LoginPage ( driver );
    }
    public LoginPage searchClickAndSendText(String searchText){
        element.clickElement ( searchElement );
        element.fillElement ( searchLine,searchText );
      searchLine.sendKeys ( Keys.ENTER );
        return new LoginPage ( driver );
    }

    public LoginPage registerClisk ( ) {
        element.clickElement ( registerButton );

        return new LoginPage ( driver );
    }

    public LoginPage passwordSend ( String password ) {
        element.fillElement ( passwordElement , password );
        return new LoginPage ( driver );
    }

    public LoginPage emailSend ( String email ) {
        element.fillElement ( emailElement , email );
        return new LoginPage ( driver );
    }

    public LoginPage UsernameSend ( String username ) {
        element.fillElement ( usernameRegister , username );
        return new LoginPage ( driver );

    }

    public LoginPage dismiss ( ) {
        element.clickElement ( dismissBttn );
        return new LoginPage ( driver );
    }

    public LoginPage accountClick ( ) {
        element.clickElement ( account );

        return new LoginPage ( driver );

    }

    public LoginPage accountClick2 ( ) {
        element.clickElement ( account2 );
        return new LoginPage ( driver );
    }

    public LoginPage accountSendText ( String accountName ) {
        element.fillElement ( account2 , accountName );
        return new LoginPage ( driver );
    }

    public void helping ( ) {
        PageMethods helper = new PageMethods ( driver );
        helper.navigateToPage ( "https://shop.demoqa.com/my-account/" );

    }

    public LoginPage logout ( ) {
        element.clickElement ( logout );
        return new LoginPage ( driver );
    }

    public LoginPage passwordClickClick ( ) {
        element.clickElement ( password );

        return new LoginPage ( driver );

    }

    public LoginPage passSendText ( String passWord ) {
        element.fillElement ( password , passWord );
        return new LoginPage ( driver );
    }

    public LoginPage loginClick ( ) {
        element.clickElement ( loginButton );

        return new LoginPage ( driver );

    }


}
