package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.ShoppingCart;

public class ShoppingCartSteps {
    private static final Logger LOGGER = LogManager.getLogger(ShoppingCartSteps.class);
    WebDriver driver = Hooks.driver;




    @Then("^User Will Search For Gift card$")
    public void userWillSearchForGiftCard() {
        new ShoppingCart(driver)
                .SearchForGiftCard();


    }

    @And("^Chose The Gift Card$")
    public void choseTheGiftCard() {
        new ShoppingCart(driver)
                .choseGiftCard();

    }

    @Then("^From The Gift Card Page User Will Chose Delivery Method \"(.+?)\"$")
    public void fromTheGiftCardPageUserWillChoseDeliveryMethod(String deliveryOption) {
        new ShoppingCart(driver)
                .selectDeliveryMethod(deliveryOption);

    }


    @And("^Value \"(.+?)\"$")
    public void value(String Value) {
        new ShoppingCart(driver)
                .selectValue(Value);

    }

    @Then("User Will Add It To The Cart")
    public void userWillAddItToTheCart() {
        new ShoppingCart(driver)
                .addToCart();

    }

    @And("Go To The Cart For Checkout")
    public void goToTheCartForCheckout() {
        new ShoppingCart(driver)
                .checkOut();

    }

    @When("User Successfully Add The Item To The Cart")
    public void userSuccessfullyAddTheItemToTheCart() {
        new ShoppingCart(driver)
                .cartValidation();
    }
}
