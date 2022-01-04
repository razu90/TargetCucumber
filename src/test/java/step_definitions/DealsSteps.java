package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import page_objects.Deals;

public class DealsSteps {
    WebDriver driver = Hooks.driver;


    @Then("^Click on Deals$")
    public void click_on_deals() throws Exception {
        new Deals(driver)
                .ClickOnDeals();
    }

    @Then("^Chose  on going Deals \"(.+?)\"$")
    public void chose_on_going_deals(String deals) throws Exception {
        new Deals(driver)
                .selectCurrentDeals(deals);
    }



    @And("Page Url {string}")
    public void pageUrl(String url) throws Exception {
        new Deals(driver)
                .ValidationUrl(url);
    }
}
