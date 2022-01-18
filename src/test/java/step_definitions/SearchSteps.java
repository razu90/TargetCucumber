package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.Search;

public class SearchSteps {
    private static final Logger LOGGER = LogManager.getLogger(SignInSteps.class);
    WebDriver driver = Hooks.driver;

    @When("^User click on search button$")
    public void user_click_on_search_button() {
       new Search(driver)
               .clickOnSearchBox();
        LOGGER.info("User clicked on search button");
    }

    @And("^Type the products name \"(.+?)\"$")
    public void TypeTheProductsName(String ProductName) {
        new Search(driver)
                .typeProduct(ProductName);
        LOGGER.info("User typing" +ProductName);
    }

    @Then("^Click on Search icon$")
    public void clickOnSearchIcon() {
        new Search(driver)
                .clickOnSearchIcon();
        LOGGER.info("User Clicked On Search Icon");
    }

    @And("^User validate the title contains \"(.+?)\"$")
    public void userClickOnSearchIconUserWillGoToTheProductPageAndSeePageTitle(String PageTitle) {

        new Search(driver)
                .validatePageTitle(PageTitle);
        LOGGER.info("Title is" +PageTitle);
    }

}
