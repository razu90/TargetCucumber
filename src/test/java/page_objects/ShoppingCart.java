package page_objects;

import command_providers.CommandAction;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ShoppingCart {

    private final By SelectGiftCard = By.linkText("Thank You");
    private final By SelectGiftCardDesign = By.linkText("Balloon Thanks Target GiftCard");
    private final By AddToCart = By.xpath("//*[text()='Add to cart']");
    private final By CheckOut = By.xpath("//button[text()='View cart & checkout']");
    private final By ContinueShopping = By.xpath("//button[text()='Continue shopping']");
    private final By Total1Item = By.xpath("//*[text()='1 item']");
    private final By $50GiftCard = By.xpath("//*/button[text()='$50']");
    private final By $100GiftCard = By.xpath("//*/button[text()='$100']");
    private final By $200GiftCard = By.xpath("//*/button[text()='$200']");
    private final By EmailDelivery = By.xpath("//*[text()='E-MAIL']");


    private static final Logger LOGGER = LogManager.getLogger(ShoppingCart.class);
    public WebDriver driver;

    public ShoppingCart(WebDriver driver) {
        this.driver = driver;
    }


    public ShoppingCart choseGiftCard() {
        CommandAction.wait(driver, SelectGiftCard).waitForElementToBeVisible();
        CommandAction.element(driver, SelectGiftCard).click();
        CommandAction.wait(driver, SelectGiftCardDesign).waitForElementToBeVisible();
        CommandAction.element(driver, SelectGiftCardDesign).click();
        LOGGER.debug("User Chose The Gift Card");
        return this;
    }

    public ShoppingCart select$50GiftCard() {
        CommandAction.wait(driver, $50GiftCard).waitForElementToBeVisible();
        CommandAction.element(driver, $50GiftCard).click();
        LOGGER.debug("User Select $50 Gift Card");
        return this;
    }

    public ShoppingCart select$100GiftCard() {
        CommandAction.wait(driver, $100GiftCard).waitForElementToBeVisible();
        CommandAction.element(driver, $100GiftCard).click();
        LOGGER.debug("User Select $100 Gift Card");
        return this;
    }

    public ShoppingCart select$200GiftCard() {
        CommandAction.wait(driver, $200GiftCard).waitForElementToBeVisible();
        CommandAction.element(driver, $200GiftCard).click();
        LOGGER.debug("User Select $200 Gift Card");
        return this;
    }

    public ShoppingCart selectEmailDelivery() {
        CommandAction.wait(driver, EmailDelivery).waitForElementToBeVisible();
        CommandAction.element(driver, EmailDelivery).click();
        LOGGER.debug("User Chose Email Delivery");
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

    public ShoppingCart continueShopping() {
        CommandAction.wait(driver, ContinueShopping).waitForElementToBeVisible();
        CommandAction.element(driver, ContinueShopping).click();
        LOGGER.debug("User Clicked For Checkout");
        return this;
    }

    public ShoppingCart cartValidation() {
        CommandAction.wait(driver, Total1Item).waitForElementToBeVisible();
        String actualItem = CommandAction.element(driver, Total1Item).getTextValue();
        String expectedItem = "1 item";
        Assert.assertEquals(expectedItem, actualItem);
        LOGGER.debug("User Is In The Cart With " + actualItem);
        return this;

    }

    public ShoppingCart cartValidationWithMultipleProduct(String totalQuantity, String totalAmount) {
        CommandAction.wait(driver, By.xpath("//h1[contains(text(),'Cart: $350.00 (3 items)')]")).waitForElementToBeVisible();
        String actualQuantity = driver.findElement(By.xpath("//h1[contains(text(),'Cart: $350.00 (3 items)')]")).getText();
        String actualAmount = driver.findElement(By.xpath("//h1[contains(text(),'Cart: $350.00 (3 items)')]")).getText();
        if (!actualQuantity.contains(totalQuantity)) {
            Assert.fail("Item Quantity Didn't Match");
        } else {
            System.out.println("Total quantity is " + totalQuantity + " And It's Matched!");
        }
        if (!actualAmount.contains(totalAmount)) {
            Assert.fail("Total Amount Didn't Match");
        } else {
            System.out.println("Total Amount Is " + totalAmount + " And It's Matched!");
        }
        LOGGER.debug("User Is In The Cart With Total quantity " + totalQuantity + " And Total Amount " + totalAmount);
        return this;
    }

}

