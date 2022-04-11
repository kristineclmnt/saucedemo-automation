package pageObjects;

import org.openqa.selenium.By;

public class LoginElements {

    public static By txtUsername = By.id("user-name");
    public static By txtPassword = By.id("password");
    public static By btnLogin = By.id("login-button");
    public static By lblLoginErrorMsg = By.xpath("//div[@class='error-message-container error']");

}
