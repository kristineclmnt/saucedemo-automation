package logic;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.CreateSession;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import pageEvents.HomepageEvents;
import pageEvents.LoginEvents;
import pageObjects.LoginElements;

import java.io.IOException;

public class StepDefinition {

    LoginElements loginElements;
    LoginEvents loginEvents;
    HomepageEvents homepageEvents;
    WebDriver driver;

    public StepDefinition() throws IOException {
        driver = CreateSession.getWebDriver();
        loginElements = new LoginElements(driver);
        loginEvents = new LoginEvents(driver);
        homepageEvents = new HomepageEvents(driver);
    }

    @Given("^user navigates to the \"([^\"]*)\" website$")
    public void urlNavigation(String url) throws Throwable {
        loginEvents.goToPage(url);
    }

    @Then("^the login page UI is validated$")
    public void loginPageValidation() throws IOException, InvalidFormatException {
        loginEvents.validateLoginPage();
    }

    @When("^a user logs in with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userLogin(String username, String password) throws Throwable {
        loginEvents.login(username, password);
    }

    @Then("^user is redirected to the Saucedemo homepage$")
    public void successfulLogin() throws Throwable {
        loginEvents.validateSuccessfulLogin();
    }

    @Then("^a \"([^\"]*)\" error message will be displayed")
    public void unsuccessfulLogin(String errorType) throws Throwable {
        switch (errorType) {
            case "LOCKED":
                loginEvents.verifyLockedError(errorType);
                break;
            case "INCORRECT":
                loginEvents.verifyIncorrectError(errorType);
                break;
            case "MISSING USERNAME":
                loginEvents.verifyMissingUsernameError(errorType);
                break;
            case "MISSING PASSWORD":
                loginEvents.verifyMissingPasswordError(errorType);
                break;
            default:
                System.out.println("Unexpected error type");
        }
    }

    @Given("^the user has logged in successfully$")
    public void loginSuccessfully() throws Throwable {
        urlNavigation("SAUCEDEMOSITE");
        loginEvents.login("STANDARDUSER", "PASSWORD");
        loginEvents.validateSuccessfulLogin();
    }

    @When("^the homepage page UI is validated$")
    public void homepageValidation() throws IOException, InvalidFormatException {
        homepageEvents.validateHomepage();
    }

    @When("^the user filters the products by Name Z to A$")
    public void filterZtoA() {
        homepageEvents.filterByDescendingName();
    }

    @Then("^the products will be displayed in a descending name order$")
    public void validateZtoA() throws InterruptedException, IOException, InvalidFormatException {
        homepageEvents.validateDescendingName();
    }

    @When("^the user filters the products by Price High to Low$")
    public void filterHighToLow() {
        homepageEvents.filterByDescendingPrice();
    }

    @Then("^the products will be displayed in a descending price order$")
    public void validateHighToLow() throws InterruptedException, IOException, InvalidFormatException {
        homepageEvents.validateDescendingPrice();
    }

    @When("^the user filters the products by Price Low to High$")
    public void filterLowToHigh() {
        homepageEvents.filterByAscendingPrice();
    }

    @Then("^the products will be displayed in a ascending price order$")
    public void validateLowToHigh() throws InterruptedException, IOException, InvalidFormatException {
        homepageEvents.validateAscendingPrice();
    }

    @Given("^the user adds products to the cart$")
    public void addToCart() {
        homepageEvents.addToCart();
    }

    @Then("^the user's cart is updated$")
    public void validateCartBadge() {
        homepageEvents.validateCartBadge();
    }

}
