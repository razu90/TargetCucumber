package page_objects;

import command_providers.CommandAction;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ShoppingCart {

    private final By SearchBox = By.id("search");
    private final By SearchIcon = By.xpath("//*[text()='go']");
    private final By SelectGiftCard = By.linkText("Thank You");
    private final By SelectGiftCardDesign = By.linkText("Balloon Thanks Target GiftCard");
    private final By AddToCart = By.xpath("//*[text()='Add to cart']");
    private final By CheckOut = By.xpath("//button[text()='View cart & checkout']");
    private final By TotalItem = By.xpath("//*[text()='1 item']");


    private static final Logger LOGGER = LogManager.getLogger(ShoppingCart.class);
    public WebDriver driver;

    public ShoppingCart(WebDriver driver) {
        this.driver = driver;
    }

    public ShoppingCart SearchForGiftCard() {
        CommandAction.wait(driver, By.id("search")).waitForElementToBeVisible();
        CommandAction.element(driver, SearchBox).setValue("Target Gift Card");
        CommandAction.wait(driver, SearchIcon).waitForElementToBeVisible();
        CommandAction.element(driver, SearchIcon).click();
        LOGGER.debug("User Search The Gift Card");
        return this;
    }

    public ShoppingCart choseGiftCard() {
        CommandAction.wait(driver, SelectGiftCard).waitForElementToBeVisible();
        CommandAction.element(driver, SelectGiftCard).click();
        CommandAction.wait(driver, SelectGiftCardDesign).waitForElementToBeVisible();
        CommandAction.element(driver, SelectGiftCardDesign).click();
        LOGGER.debug("User Chose The Gift Card");
        return this;
    }

    public ShoppingCart selectDeliveryMethod(String dMethod) {
        CommandAction.wait(driver, By.xpath("//*[text()=" + dMethod)).waitForElementToBeVisible();
        CommandAction.element(driver, By.xpath("//*[text()=" + dMethod)).click();
        LOGGER.debug("User Select The Delivery Method As " + dMethod);
        return this;
    }

    public ShoppingCart selectValue(String value) {
        CommandAction.element(driver, By.xpath("//*/button[text()=" + value)).click();
        LOGGER.debug("User Select Card Value For " + value);
        return this;
    }

    public ShoppingCart addToCart() {
        CommandAction.wait(driver, AddToCart).waitForElementToBeVisible();
        CommandAction.element(driver, AddToCart).click();
        LOGGER.debug("User Add The Product To The Cart");
        return this;
    }

    public ShoppingCart checkOut() {
        CommandAction.wait(driver, CheckOut).waitForElementToBeVisible();
        CommandAction.element(driver, CheckOut).click();
        LOGGER.debug("User Clicked For Checkout");
        return this;
    }

    public ShoppingCart cartValidation() {
        CommandAction.wait(driver, TotalItem).waitForElementToBeVisible();
        String actualItem = CommandAction.element(driver, TotalItem).getTextValue();
        String expectedItem = "1 item";
        Assert.assertEquals(expectedItem, actualItem);
        LOGGER.debug("User Is In The Cart With " + actualItem);
        return this;

    }

}
