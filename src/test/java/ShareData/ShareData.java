package ShareData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ShareData {

    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    public void setupChrome(){
        ChromeOptions option = new ChromeOptions ();
        option.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver1/chromedriver.exe");
        driver = new ChromeDriver(option);

        driver.manage().window().maximize();

        driver.get("https://shop.demoqa.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
    }

    public void clearBrowser(){

        driver.quit();
    }

}
