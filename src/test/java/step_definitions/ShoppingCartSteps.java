package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.NavigationBar;
import page_objects.ShoppingCart;

public class ShoppingCartSteps {
    private static final Logger LOGGER = LogManager.getLogger(ShoppingCartSteps.class);
    WebDriver driver = Hooks.driver;


    @When("^User Search For Gift card$")
    public void userWillSearchForGiftCard() {
        new NavigationBar(driver)
                .enterValueOnSearchBox("Target Gift Card")
                .clickOnSearchIcon();
        LOGGER.info("User Searching For The Gift card");


    }

    @And("^Chose The Gift Card Design$")
    public void choseTheGiftCard() {
        new ShoppingCart(driver)
                .choseGiftCard();
        LOGGER.info("User Chose The Gift card Design");

    }

    @And("^Chose Delivery Method \"(.+?)\"$")
    public void fromTheGiftCardPageUserWillChoseDeliveryMethod(String deliveryOption) {
        new ShoppingCart(driver)
                .selectDeliveryMethod(deliveryOption);
        LOGGER.info("User SChose The Delivery Option");

    }


    @And("^Value \"(.+?)\"$")
    public void value(String Value) {
        new ShoppingCart(driver)
                .selectValue(Value);
        LOGGER.info("User Select the value" + Value);

    }

    @And("^Add It To The Cart$")
    public void userWillAddItToTheCart() {
        new ShoppingCart(driver)
                .addToCart();
        LOGGER.info("User Add it to the cart");

    }

    @Then("^User will see the product successfully added to the cart$")
    public void goToTheCartForCheckout() {
        new ShoppingCart(driver)
                .checkOut()
                .cartValidation();
        LOGGER.info("User Is in The Cart");


    }

    @When("^User Chose Gift card$")
    public void UserChoseGiftcard() {
        new NavigationBar(driver)
                .enterValueOnSearchBox("Target Gift Card")
                .clickOnSearchIcon();
        LOGGER.info("User Chose The Gift Card");
    }

    @And("^select the value with delivery method$")
    public void selectTheValueWithDeliveryMethod() {
        new ShoppingCart(driver)
                .choseGiftCard()
                .selectEmailDelivery()
                .select$50GiftCard()
                .addToCart()
                .continueShopping()
                .selectEmailDelivery()
                .select$100GiftCard()
                .addToCart()
                .continueShopping()
                .selectEmailDelivery()
                .select$200GiftCard();
        LOGGER.info("User Chose Delivery Method and Value");
    }


    @Then("^User Should See To Total Product \"(.+?)\" With \"(.+?)\" Total Value$")
    public void userShouldSeeToTotalProductWithTotalValue(String quantity, String value) {
        new ShoppingCart(driver)
                .checkOut()
                .cartValidationWithMultipleProduct(quantity, value);
        LOGGER.info("User Is In The Cart With Total quantity " + quantity + " And Total Amount " + value);
    }
}
