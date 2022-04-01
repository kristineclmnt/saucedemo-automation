package pageEvents;

import framework.ColumnNames;
import framework.CommonMethods;
import framework.Constants;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjects.HomepageElements;
import testdata.TestDataHandler;

import java.io.IOException;

public class HomepageEvents extends CommonMethods {

    TestDataHandler testDataHandler = new TestDataHandler();

    public HomepageEvents(WebDriver driver) throws IOException {
        super(driver);
    }

    public void validateHomepage() throws IOException, InvalidFormatException {
        String homePageSheet = Constants.sheetHomepageEvents;

        String actualBackpackProduct = findElement(HomepageElements.lnkBackpack).getText();
        String actualBackpackProductDesc = findElement(HomepageElements.lblBackpackDesc).getText();
        String actualBackpackPrice = findElement(HomepageElements.lblBackpackPrice).getText();
        String actualBikeLightProduct = findElement(HomepageElements.lnkBikeLight).getText();
        String actualBikeLightDesc = findElement(HomepageElements.lblBikeLightDesc).getText();
        String actualBikeLightPrice = findElement(HomepageElements.lblBikeLightPrice).getText();
        String actualBoltShirtProduct = findElement(HomepageElements.lnkBoltShirt).getText();
        String actualBoltShirtDesc = findElement(HomepageElements.lblBoltShirtDesc).getText();
        String actualBoltShirtPrice = findElement(HomepageElements.lblBoltShirtPrice).getText();
        String actualJacketProduct = findElement(HomepageElements.lnkJacket).getText();
        String actualJacketDesc = findElement(HomepageElements.lblJacketDesc).getText();
        String actualJacketPrice = findElement(HomepageElements.lblJacketPrice).getText();
        String actualOnesieProduct = findElement(HomepageElements.lnkOnesie).getText();
        String actualOnesieDesc = findElement(HomepageElements.lblOnesieDesc).getText();
        String actualOnesiePrice = findElement(HomepageElements.lblOnesiePrice).getText();
        String actualRedShirtProduct = findElement(HomepageElements.lnkRedShirt).getText();
        String actualRedShirtDesc = findElement(HomepageElements.lblRedShirtDesc).getText();
        String actualRedShirtPrice = findElement(HomepageElements.lblRedShirtPrice).getText();

        String expectedBackpackProduct = getDataFromTestDataSheet(ColumnNames.Backpack.name(), homePageSheet);
        String expectedBackpackProductDesc = getDataFromTestDataSheet(ColumnNames.BackpackDesc.name(), homePageSheet);
        String expectedBackpackPrice = getDataFromTestDataSheet(ColumnNames.BackpackPrice.name(), homePageSheet);
        String expectedBikeLightProduct = getDataFromTestDataSheet(ColumnNames.BikeLight.name(), homePageSheet);
        String expectedBikeLightDesc = getDataFromTestDataSheet(ColumnNames.BikeLightDesc.name(), homePageSheet);
        String expectedBikeLightPrice = getDataFromTestDataSheet(ColumnNames.BikeLightPrice.name(), homePageSheet);
        String expectedBoltShirtProduct = getDataFromTestDataSheet(ColumnNames.BoltShirt.name(), homePageSheet);
        String expectedBoltShirtDesc = getDataFromTestDataSheet(ColumnNames.BoltShirtDesc.name(), homePageSheet);
        String expectedBoltShirtPrice = getDataFromTestDataSheet(ColumnNames.BoltShirtPrice.name(), homePageSheet);
        String expectedJacketProduct = getDataFromTestDataSheet(ColumnNames.Jacket.name(), homePageSheet);
        String expectedJacketDesc = getDataFromTestDataSheet(ColumnNames.JacketDesc.name(), homePageSheet);
        String expectedJacketPrice = getDataFromTestDataSheet(ColumnNames.JacketPrice.name(), homePageSheet);
        String expectedOnesieProduct = getDataFromTestDataSheet(ColumnNames.Onesie.name(), homePageSheet);
        String expectedOnesieDesc = getDataFromTestDataSheet(ColumnNames.OnesieDesc.name(), homePageSheet);
        String expectedOnesiePrice = getDataFromTestDataSheet(ColumnNames.OnesiePrice.name(), homePageSheet);
        String expectedRedShirtProduct = getDataFromTestDataSheet(ColumnNames.RedShirt.name(), homePageSheet);
        String expectedRedShirtDesc = getDataFromTestDataSheet(ColumnNames.RedShirtDesc.name(), homePageSheet);
        String expectedRedShirtPrice = getDataFromTestDataSheet(ColumnNames.RedShirtPrice.name(), homePageSheet);

        Assert.assertEquals(actualBackpackProduct, expectedBackpackProduct);
        Assert.assertEquals(actualBackpackProductDesc, expectedBackpackProductDesc);
        Assert.assertEquals(actualBackpackPrice, expectedBackpackPrice);
        Assert.assertEquals(actualBikeLightProduct, expectedBikeLightProduct);
        Assert.assertEquals(actualBikeLightDesc, expectedBikeLightDesc);
        Assert.assertEquals(actualBikeLightPrice, expectedBikeLightPrice);
        Assert.assertEquals(actualBoltShirtProduct, expectedBoltShirtProduct);
        Assert.assertEquals(actualBoltShirtDesc, expectedBoltShirtDesc);
        Assert.assertEquals(actualBoltShirtPrice, expectedBoltShirtPrice);
        Assert.assertEquals(actualJacketProduct, expectedJacketProduct);
        Assert.assertEquals(actualJacketDesc, expectedJacketDesc);
        Assert.assertEquals(actualJacketPrice, expectedJacketPrice);
        Assert.assertEquals(actualOnesieProduct, expectedOnesieProduct);
        Assert.assertEquals(actualOnesieDesc, expectedOnesieDesc);
        Assert.assertEquals(actualOnesiePrice, expectedOnesiePrice);
        Assert.assertEquals(actualRedShirtProduct, expectedRedShirtProduct);
        Assert.assertEquals(actualRedShirtDesc, expectedRedShirtDesc);
        Assert.assertEquals(actualRedShirtPrice, expectedRedShirtPrice);
    }


    public void filterByDescendingName() {
        clickOnElementUsingActions(HomepageElements.ddlFilter);
        findElement(HomepageElements.ddlFilterDescName).click();
    }

    public void filterByDescendingPrice() {
        clickOnElementUsingActions(HomepageElements.ddlFilter);
        findElement(HomepageElements.ddlFilterDescPrice).click();
    }

    public void filterByAscendingPrice() {
        clickOnElementUsingActions(HomepageElements.ddlFilter);
        findElement(HomepageElements.ddlFilterAscPrice).click();
    }

    public void validateDescendingName() throws InterruptedException, IOException, InvalidFormatException {
        String actualFirstProduct = findElement(HomepageElements.lnkFirstProduct).getText();
        String actualLastProduct = findElement(HomepageElements.lnkLastProduct).getText();

        String expectedFirstProduct = getDataFromTestDataSheet(ColumnNames.RedShirt.name(), Constants.sheetHomepageEvents);
        String expectedLastProduct = getDataFromTestDataSheet(ColumnNames.Backpack.name(), Constants.sheetHomepageEvents);

        Assert.assertEquals(actualFirstProduct, expectedFirstProduct);
        Assert.assertEquals(actualLastProduct, expectedLastProduct);
    }

    public void validateDescendingPrice() throws InterruptedException, IOException, InvalidFormatException {
        String actualFirstProduct = findElement(HomepageElements.lnkFirstProduct).getText();
        String actualLastProduct = findElement(HomepageElements.lnkLastProduct).getText();

        String expectedFirstProduct = getDataFromTestDataSheet(ColumnNames.Jacket.name(), Constants.sheetHomepageEvents);
        String expectedLastProduct = getDataFromTestDataSheet(ColumnNames.Onesie.name(), Constants.sheetHomepageEvents);

        Assert.assertEquals(actualFirstProduct, expectedFirstProduct);
        Assert.assertEquals(actualLastProduct, expectedLastProduct);
    }

    public void validateAscendingPrice() throws InterruptedException, IOException, InvalidFormatException {
        String actualFirstProduct = findElement(HomepageElements.lnkFirstProduct).getText();
        String actualLastProduct = findElement(HomepageElements.lnkLastProduct).getText();

        String expectedFirstProduct = getDataFromTestDataSheet(ColumnNames.Onesie.name(), Constants.sheetHomepageEvents);
        String expectedLastProduct = getDataFromTestDataSheet(ColumnNames.Jacket.name(), Constants.sheetHomepageEvents);

        Assert.assertEquals(actualFirstProduct, expectedFirstProduct);
        Assert.assertEquals(actualLastProduct, expectedLastProduct);
    }

    public void addToCart() {
        waitForVisibility(HomepageElements.lnkCart);
        clickOnElementUsingActions(HomepageElements.btnAddToCart);
        int cartCount = Integer.parseInt(findElement(HomepageElements.lnkCartBadge).getText());

        while (cartCount != 6) {
            clickOnElementUsingActions(HomepageElements.btnAddToCart);
            cartCount++;
        }
    }

    public void validateCartBadge() {
        Assert.assertEquals(findElement(HomepageElements.lnkCartBadge).getText(), "6");

        int cartCount = Integer.parseInt(findElement(HomepageElements.lnkCartBadge).getText());

        while (cartCount != 1) {
            clickOnElementUsingActions(HomepageElements.btnRemoveFromCart);
            cartCount--;
        }

        Assert.assertEquals(findElement(HomepageElements.lnkCartBadge).getText(), "1");
    }

    /**
     * Retrieves Data from the TestDataSheet
     */
    private String getDataFromTestDataSheet(String columnName, String sheet) throws IOException, InvalidFormatException {
        return testDataHandler.getSpecificColumnData(Constants.fileTestDataSheet, sheet, columnName);
    }
}
