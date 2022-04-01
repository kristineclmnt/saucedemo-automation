package framework;

import logger.Log;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

/**
 * All the validation methods and method to take screenshot
 * are defined in this class.
 */
public class Assertions {
    private WebDriver driver;
    private File file;
    private String testScreenshotDir;

    public Assertions(WebDriver driver) {
        file = new File("");
        testScreenshotDir = file.getAbsoluteFile()
                + "//src//test//java//outputFiles//";
        this.driver = driver;
    }


    /**
     * Take a screenshot
     *
     * @return path where screenshot has been saved
     */
    public String screenShot() {
        String screenshotPath = "_screenshot_" + new SimpleDateFormat("MM-dd-yyyy-HH-mm-ss")
                .format(new GregorianCalendar().getTime())
                + ".png";

        System.out.println(screenshotPath);
        File scrFile = ((TakesScreenshot) driver)
                .getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scrFile, new File(testScreenshotDir + screenshotPath));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            screenshotPath = "";
        }
        return screenshotPath;
    }


    /**
     * Take a screenshot (Pass a name)
     *
     * @param message string for the name of screenshot
     */
    public void screenShot(String message) {
        String screenshotPath = new SimpleDateFormat("MM-dd-yyyy-HH-mm-ss")
                .format(new GregorianCalendar().getTime()) + message + "_screenshot_" + ".png";

        System.out.println(screenshotPath);
        File scrFile = ((TakesScreenshot) driver)
                .getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scrFile, new File(testScreenshotDir + screenshotPath));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            screenshotPath = "";
        }
    }

}


