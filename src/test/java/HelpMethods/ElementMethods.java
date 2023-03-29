package HelpMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ElementMethods {

    private WebDriver driver;

    public ElementMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void clickElement(WebElement element){
        waitElementVisible(element);
        element.click();
    }

    public void waitElementVisible(WebElement element){
        WebDriverWait waitExplicit = new WebDriverWait(driver, Duration.ofSeconds(10));
        waitExplicit.until(ExpectedConditions.visibilityOf(element));
    }

    public void fillElement(WebElement element, String value){
        waitElementVisible(element);
        element.sendKeys(value);
    }

    public void validateElementText(WebElement element, String value){
        String actualValue = element.getText();
        Assert.assertEquals(value, actualValue);
    }

    public void SelectElementText(WebElement element, String value){
        waitElementVisible(element);
        Select elementSelect = new Select(element);
        elementSelect.selectByVisibleText(value);

    }

    public void SelectElementValue(WebElement element, String value){
        waitElementVisible(element);
        Select elementSelect = new Select(element);
        elementSelect.selectByValue(value);

    }

    public void moveToElement(WebElement element){
        waitElementVisible(element);
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
    }

}
