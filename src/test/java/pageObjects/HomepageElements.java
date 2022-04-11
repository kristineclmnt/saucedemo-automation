package pageObjects;

import org.openqa.selenium.By;

public class HomepageElements {

    public static By lblProduct = By.xpath("//span[contains(text(),'Products')]");
    public static By btnAddToCart = By.xpath("(//button[text()='Add to cart'])[1]");
    public static By btnRemoveFromCart = By.xpath("//button[contains(@class,'btn btn_secondary')]");
    public static By lnkCartBadge = By.className("shopping_cart_badge");
    public static By lnkCart = By.className("shopping_cart_link");

    public static By lnkBackpack = By.xpath("//a[@id='item_4_title_link']//div[1]");
    public static By lblBackpackDesc = By.xpath("//a[@id='item_4_title_link']/following-sibling::div[1]");
    public static By lblBackpackPrice = By.xpath("(//div[@class='inventory_item_price'])[1]");

    public static By lnkBikeLight = By.xpath("//a[@id='item_0_title_link']//div[1]");
    public static By lblBikeLightDesc = By.xpath("//a[@id='item_0_title_link']/following-sibling::div[1]");
    public static By lblBikeLightPrice = By.xpath("(//div[@class='inventory_item_price'])[2]");

    public static By lnkBoltShirt = By.xpath("//a[@id='item_1_title_link']//div[1]");
    public static By lblBoltShirtDesc = By.xpath("//a[@id='item_1_title_link']/following-sibling::div[1]");
    public static By lblBoltShirtPrice = By.xpath("(//div[@class='inventory_item_price'])[3]");

    public static By lnkJacket = By.xpath("//a[@id='item_5_title_link']//div[1]");
    public static By lblJacketDesc = By.xpath("//a[@id='item_5_title_link']/following-sibling::div[1]");
    public static By lblJacketPrice = By.xpath("(//div[@class='inventory_item_price'])[4]");

    public static By lnkOnesie = By.xpath("//a[@id='item_2_title_link']//div[1]");
    public static By lblOnesieDesc = By.xpath("//a[@id='item_2_title_link']/following-sibling::div[1]");
    public static By lblOnesiePrice = By.xpath("(//div[@class='inventory_item_price'])[5]");

    public static By lnkRedShirt = By.xpath("//a[@id='item_3_title_link']//div[1]");
    public static By lblRedShirtDesc = By.xpath("//a[@id='item_3_title_link']/following-sibling::div[1]");
    public static By lblRedShirtPrice = By.xpath("(//div[@class='inventory_item_price'])[6]");

    public static By ddlFilter = By.tagName("select");
    public static By ddlFilterDescName = By.xpath("(//select[@class='product_sort_container']//option)[2]");
    public static By ddlFilterAscName = By.xpath("(//select[@class='product_sort_container']//option)[1]");
    public static By ddlFilterDescPrice = By.xpath("(//select[@class='product_sort_container']//option)[4]");
    public static By ddlFilterAscPrice = By.xpath("(//select[@class='product_sort_container']//option)[3]");

    public static By lnkFirstProduct = By.xpath("(//div[@class='inventory_item_name'])[1]");
    public static By lnkLastProduct = By.xpath("(//div[@class='inventory_item_name'])[6]");
    public static By lblFirstPrice = By.xpath("(//div[@class='inventory_item_price'])[1]");
    public static By lblLastPrice = By.xpath("(//div[@class='inventory_item_price'])[6]");

}
