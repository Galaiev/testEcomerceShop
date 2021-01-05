package webdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactorySingleton {

    private WebDriver driver;
    private static WebDriverFactorySingleton instance = null;

    public static WebDriverFactorySingleton getInstance() {
        if (instance == null) {
            instance = new WebDriverFactorySingleton();
        }
        return instance;
    }

    public WebDriver getDriver(){
        return driver;
    }

    public void initDriver(WebDriverType webDriverType) {
        switch (webDriverType) {
            case FIREFOX_DRIVER:
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case CHROME_DRIVER:
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
        }
        driver.manage().window().maximize();
    }

}
