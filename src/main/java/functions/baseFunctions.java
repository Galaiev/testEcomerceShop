package functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import webdriver.WebDriverFactorySingleton;

public class baseFunctions {

    public WebDriver driver = WebDriverFactorySingleton.getInstance().getDriver();

    public void waitElement(By elementToWait) {
        WebDriverWait waitElement = new WebDriverWait(WebDriverFactorySingleton.getInstance().getDriver(), 10);
        waitElement.until(ExpectedConditions.visibilityOfElementLocated(elementToWait));
    }

    public void waitElemenetByName(By elementToWait) {
        WebDriverWait waitElement = new WebDriverWait(WebDriverFactorySingleton.getInstance().getDriver(), 10);
        waitElement.until(ExpectedConditions.visibilityOf(driver.findElement(elementToWait)));
    }

    public void waitVisibleElement(WebElement elementToWait){
        WebDriverWait waitElement = new WebDriverWait(WebDriverFactorySingleton.getInstance().getDriver(), 10);
        waitElement.until(ExpectedConditions.visibilityOf(elementToWait));
    }
}
