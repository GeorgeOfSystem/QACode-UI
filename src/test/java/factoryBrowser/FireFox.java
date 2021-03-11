package factoryBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class FireFox implements IBrowser {
    String driverPath = "C:\\Users\\George\\Desktop\\UPB\\QACode\\ui\\src\\test\\resources\\geckoDriver";
    public WebDriver driver;

    @Override
    public WebDriver create() {
        System.setProperty("webdriver.gecko.driver", driverPath);
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);
        driver = new FirefoxDriver(capabilities);
        return driver;
    }
}
