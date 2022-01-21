package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page_objects.Deals;
import page_objects.NavigationBar;

public class DealsSteps {
    WebDriver driver = Hooks.driver;

    @When("^the user clicks on Deals$")
    public void the_user_clicks_on_deals() {
        new NavigationBar(driver)
                .clickOnDeals();
    }

    @And("^Chose on going Deals \"(.+?)\"$")
    public void chose_on_going_deals(String deals) {
        new Deals(driver)
                .selectCurrentDeals(deals);


    }

    @Then("^validate the title And Url contains \"(.+?)\"  \"(.+?)\"$")
    public void validateTheTitleAndUrlContains(String Title, String Url) {
        new Deals(driver)
                .ValidatePageTitle(Title)
                .ValidationUrl(Url);
    }
}
