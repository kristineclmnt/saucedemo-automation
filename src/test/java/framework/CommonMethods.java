package framework;

import logger.Log;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CommonMethods extends Assertions {

    WebDriver driver = null;
    public final int timeOut = 45;
    protected FileInputStream configFis;

    public CommonMethods(WebDriver driver) throws IOException {
        super(driver);
        this.driver = driver;
    }

    public void get(String url) {
        driver.get(url);
    }


    public void clickOnElementUsingActions(By element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(element));
        actions.click().perform();
    }


    public void waitForPageToLoad(String PageName) {
        String pageLoadStatus;
        JavascriptExecutor js;

        do {
            js = (JavascriptExecutor) driver;
            pageLoadStatus = (String) js.executeScript("return document.readyState");

        } while (!pageLoadStatus.equals("complete"));
        Log.info(PageName + " page loaded successfully");
    }


    public boolean waitForVisibility(By targetElement) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, timeOut);
            wait.until(ExpectedConditions.visibilityOfElementLocated(targetElement));
            return true;
        } catch (TimeoutException e) {
            System.out.println("Element is not visible: " + targetElement);
            System.out.println();
            System.out.println(e.getMessage());
            throw new TimeoutException();

        }
    }


    public WebElement findElement(By locator) {
        try {
            WebElement element = driver.findElement(locator);
            return element;
        } catch (NoSuchElementException e) {
            Log.logError(this.getClass().getName(), "findElement", "Element not found " + locator);
            throw new NoSuchElementException(e.getMessage());
        }
    }

}

