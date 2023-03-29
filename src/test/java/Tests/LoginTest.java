package Tests;
import Objects.LoginObject;
import Objects.User;
import Pages.IndexPage;
import Pages.LoginPage;
import ShareData.Hooks;
import org.testng.annotations.Test;
public class LoginTest extends Hooks {

    @Test
    public void metodaTest()  {
        User user = new User();
        LoginObject loginObject = new LoginObject(testData);
        IndexPage indexPage1 = new IndexPage(getDriver());
        IndexPage indexPage = new IndexPage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());

        setupTheUser(user, loginObject);
        registering(user, indexPage);
        logingInUser(user, indexPage1);
        validatingWithInvalidParameters(loginObject, indexPage1, loginPage);


        logingInUser (user,indexPage1);
        testReport.attacheReport("pass", "I do the login process at this time with valid username and pass ");
        indexPage1.searchClickAndSendText ("sandal");
        testReport.attacheReport("pass", "I click on the searchbar and fill it up with some text then I do search");
        indexPage1.produsClick ();
        testReport.attacheReport("pass", "I click on one of the products");







    }

    private void validatingWithInvalidParameters(LoginObject loginObject, IndexPage indexPage1, LoginPage loginPage) {
        loginPage.LoginInvalid(loginObject);
        indexPage1.pageMethods.scrolldown(250);
        testReport.attacheReport("pass", "I manage to validate invalid login");
    }
    private void setupTheUser(User user, LoginObject loginObject) {
        user.setUsername(loginObject.getUsername());
        user.setEmail(loginObject.getEmail());
        user.setPassword(loginObject.getPassword());
    }
    private void logingInUser (User user, IndexPage indexPage1)  {
            indexPage1.helping();
            testReport.attacheReport("pass", "I redirect to the login page");

            indexPage1.accountClick2();
            testReport.attacheReport("pass", "I click on the username field to fill it with text");


            indexPage1.accountSendText(user.getUsername());
            testReport.attacheReport("pass", "I fill the username with text, with the username");


            indexPage1.passwordClickClick();
            testReport.attacheReport("pass", "I click on the password field to fill it with text");


            indexPage1.passSendText(user.getPassword());
            testReport.attacheReport("pass", "I fill the password section with text, with the password");


            indexPage1.loginClick();
            testReport.attacheReport("pass", "I click on the login button");

            indexPage1.pageMethods.scrolldown(250);
            indexPage1.logout();
        }
    private void registering (User user, IndexPage indexPage)  {
            indexPage.dismiss();
            testReport.attacheReport("pass", "I click on dismiss");


            indexPage.accountClick();
            testReport.attacheReport("pass", "I click on account");


            indexPage.accountClick();


            indexPage.UsernameSend(user.getUsername());
            testReport.attacheReport("pass", "I fill the username section with text");


            indexPage.emailSend(user.getEmail());

            testReport.attacheReport("pass", "I fill the email section with text");


            indexPage.passwordSend(user.getPassword());

            testReport.attacheReport("pass", "I fill the password section with text");


            indexPage.registerClisk();
            testReport.attacheReport("pass", "I click on the register button");


            indexPage.pageMethods.scrolldown(250);
            indexPage.logout();
            testReport.attacheReport("pass", "I do the logout process");

        }
    }
