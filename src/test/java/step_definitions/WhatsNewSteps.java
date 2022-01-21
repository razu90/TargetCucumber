package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page_objects.NavigationBar;
import page_objects.WhatsNew;

public class WhatsNewSteps {
    WebDriver driver = Hooks.driver;


    @When("^User Clicked on What's New$")
    public void clickOnWhatsNew(){
        new NavigationBar(driver)
                .clickOnWhatsNew();
    }

    @And("^Chose  Some Categories \"(.+?)\"$")
    public void choseSomeCategories(String category) {
        new WhatsNew(driver)
                .selectCategory(category);
    }

    @Then("User is in the category page")
    public void userIsInTheCategoryPage() throws Exception {
        new WhatsNew(driver)
                .WaitForPageToLoad();
    }


    @And("^validate the  Page Headline \"(.+?)\"$")
    public void validateThePageHeadline(String HeadLine) {
        new WhatsNew(driver)
                .ValidatePageHeadline(HeadLine);
    }

}
