package pageObjects;

import framework.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class LoginElements extends CommonMethods {

    public LoginElements(WebDriver driver) throws IOException {
        super(driver);
    }

    public static By txtUsername = By.id("user-name");
    public static By txtPassword = By.id("password");
    public static By btnLogin = By.id("login-button");
    public static By lblLoginErrorMsg = By.xpath("//div[@class='error-message-container error']");


}
