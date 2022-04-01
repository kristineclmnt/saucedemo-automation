package pageEvents;

import framework.ColumnNames;
import framework.CommonMethods;
import framework.Constants;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjects.LoginElements;
import testdata.TestDataHandler;

import java.io.IOException;

public class LoginEvents extends CommonMethods {

    TestDataHandler testDataHandler = new TestDataHandler();

    public LoginEvents(WebDriver driver) throws IOException {
        super(driver);
    }

    public void goToPage(String URLColumnName) throws IOException, InvalidFormatException {
        get(getDataFromTestDataSheet(URLColumnName, Constants.sheetURL));
    }

    public void login(String username, String password) throws IOException, InvalidFormatException {
        findElement(LoginElements.txtUsername).sendKeys(getDataFromTestDataSheet(username, Constants.sheetTestData));
        findElement(LoginElements.txtPassword).sendKeys(getDataFromTestDataSheet(password, Constants.sheetTestData));
        clickOnElementUsingActions(LoginElements.btnLogin);
        screenShot("Credentials");
    }

    public void validateSuccessfulLogin() throws IOException, InvalidFormatException {
        waitForPageToLoad(getDataFromTestDataSheet("PageName", Constants.sheetLoginEvents));
        screenShot("Homepage");
    }

    public void verifyLockedError(String errorType) throws IOException, InvalidFormatException {
        String actualErrorMessage = findElement(LoginElements.lblLoginErrorMsg).getText();
        String expectedErrorMessage = getDataFromTestDataSheet(errorType, Constants.sheetLoginEvents);

        waitForVisibility(LoginElements.lblLoginErrorMsg);
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
        screenShot("Locked Credentials");
    }

    public void verifyMissingUsernameError(String errorType) throws IOException, InvalidFormatException {
        String actualErrorMessage = findElement(LoginElements.lblLoginErrorMsg).getText();
        String expectedErrorMessage = getDataFromTestDataSheet(errorType, Constants.sheetLoginEvents);

        waitForVisibility(LoginElements.lblLoginErrorMsg);
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
        screenShot("Missing Credentials");
    }

    public void verifyMissingPasswordError(String errorType) throws IOException, InvalidFormatException {
        String actualErrorMessage = findElement(LoginElements.lblLoginErrorMsg).getText();
        String expectedErrorMessage = getDataFromTestDataSheet(errorType, Constants.sheetLoginEvents);

        waitForVisibility(LoginElements.lblLoginErrorMsg);
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
        screenShot("Missing Credentials");
    }

    public void verifyIncorrectError(String errorType) throws IOException, InvalidFormatException {
        String actualErrorMessage = findElement(LoginElements.lblLoginErrorMsg).getText();
        String expectedErrorMessage = getDataFromTestDataSheet(errorType, Constants.sheetLoginEvents);

        waitForVisibility(LoginElements.lblLoginErrorMsg);
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
        screenShot("Incorrect Credentials");
    }

    public void validateLoginPage() throws IOException, InvalidFormatException {
        String actualUsernamePlaceholder = findElement(LoginElements.txtUsername).getAttribute("placeholder");
        String actualPasswordPlaceholder = findElement(LoginElements.txtPassword).getAttribute("placeholder");
        String actualLoginBtnValue = findElement(LoginElements.btnLogin).getAttribute("value");

        String expectedUsernamePlaceholder = getDataFromTestDataSheet(ColumnNames.UsernamePlaceholder.name(), Constants.sheetLoginEvents);
        String expectedPasswordPlaceholder = getDataFromTestDataSheet(ColumnNames.PasswordPlaceholder.name(), Constants.sheetLoginEvents);
        String expectedLoginBtnValue = getDataFromTestDataSheet(ColumnNames.LoginBtnValue.name(), Constants.sheetLoginEvents);

        Assert.assertEquals(actualUsernamePlaceholder, expectedUsernamePlaceholder);
        Assert.assertEquals(actualPasswordPlaceholder, expectedPasswordPlaceholder);
        Assert.assertEquals(actualLoginBtnValue, expectedLoginBtnValue);
    }


    /**
     * Retrieves Data from the TestDataSheet
     */
    private String getDataFromTestDataSheet(String columnName, String sheet) throws IOException, InvalidFormatException {
        return testDataHandler.getSpecificColumnData(Constants.fileTestDataSheet, sheet, columnName);
    }
}
