package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import webdriver.WebDriverFactorySingleton;

public class LoginPage {
    public LoginPage() { PageFactory.initElements(WebDriverFactorySingleton.getInstance().getDriver(), this); }

    @FindBy(id = "email")
    public WebElement emailLogin;

    @FindBy(id = "passwd")
    public WebElement emailPassword;

    @FindBy(id = "SubmitLogin")
    public WebElement submitBtn;

    public pageAfterLogin loginUser (String loginEmail, String loginPassword) {
        emailLogin.sendKeys(loginEmail);
        emailPassword.sendKeys(loginPassword);
        submitBtn.click();

    }
}
