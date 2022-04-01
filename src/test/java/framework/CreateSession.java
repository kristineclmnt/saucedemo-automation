package framework;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import logger.Log;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;


public class CreateSession {

    private static ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();

    @Before
    public static void createDriver() {

        String browserName = System.getProperty("browser");

        String headless = System.getProperty("headless");

        DesiredCapabilities capability = new DesiredCapabilities();

        if (browserName == null)
            browserName = "chrome";

        if (headless != null && headless.equalsIgnoreCase("yes")) {

            System.setProperty("phantomjs.binary.path", "libs//phantomjs");
            String user_agent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/100.0.4896.60 Safari/537.36";
            DesiredCapabilities cap = DesiredCapabilities.phantomjs();
            cap.setCapability(PhantomJSDriverService.PHANTOMJS_PAGE_SETTINGS_PREFIX + "userAgent", user_agent);
            cap.setCapability(PhantomJSDriverService.PHANTOMJS_PAGE_SETTINGS_PREFIX + "loadImages", true);
            cap.setCapability(PhantomJSDriverService.PHANTOMJS_PAGE_SETTINGS_PREFIX + "javascriptEnabled", true);

            webDriver.set(new PhantomJSDriver(cap));
        } else if (browserName.equalsIgnoreCase("Firefox")) {
            WebDriverManager.firefoxdriver().setup();
            capability.setBrowserName("Firefox");
            webDriver.set(new FirefoxDriver());

        } else if (browserName.equalsIgnoreCase("chrome")) {
            String OS = System.getProperty("os.name");
            if (OS.contains("Windows")) {
                WebDriverManager.chromedriver().setup();
                capability.setBrowserName("Chrome");
                capability.setPlatform(Platform.WIN10);
                webDriver.set(new ChromeDriver());
            } else if (OS.contains("Linux")) {
                WebDriverManager.chromedriver().setup();
                capability.setBrowserName("Chrome");
                capability.setPlatform(Platform.LINUX);
                webDriver.set(new ChromeDriver());
            } else if (OS.contains("Mac")) {
                WebDriverManager.chromedriver().setup();
                capability.setBrowserName("Chrome");
                capability.setPlatform(Platform.MAC);
                webDriver.set(new ChromeDriver());
            }
        }
        getWebDriver().manage().window().maximize();
    }


    public static WebDriver getWebDriver() {
        System.out.println("WebDriver: " + webDriver.get());
        return webDriver.get();
    }


    @After
    public void teardown(Scenario scenario) {

        if (scenario.isFailed()) {
            try {
                TakesScreenshot ts = (TakesScreenshot) getWebDriver();

                File source = ts.getScreenshotAs(OutputType.FILE);

                FileUtils.copyFile(source, new File(".//src//test//java//outputFiles//" + "FailScreenshot" +
                        new SimpleDateFormat("MM-dd-yyyy-HH-mm-ss")
                                .format(new GregorianCalendar().getTime())
                        + ".png"));
                Log.info("Scenario failed and screenshot saved in outputFiles folder");
            } catch (Exception e) {

                Log.info("Exception while taking screenshot " + e.getMessage());

            }
        }
        Log.info("Shutting down driver" + "\n" + "----------------------------------------------");
        System.out.println("\n");

        getWebDriver().quit();
    }

}
