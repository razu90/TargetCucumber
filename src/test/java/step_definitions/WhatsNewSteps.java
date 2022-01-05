package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.WhatsNew;

public class WhatsNewSteps {
    private static final Logger LOGGER = LogManager.getLogger(WhatsNewSteps.class);
    WebDriver driver = Hooks.driver;


    @Then("^Click on What's New$")
    public void clickOnWhatsNew() throws Exception {
        new WhatsNew(driver)
                .ClickOnWhatsNew();
    }

    @And("^Chose  Some Categories \"(.+?)\"$")
    public void choseSomeCategories(String category) {
        new WhatsNew(driver)
                .selectCategory(category);
    }

    @When("User is in the category page")
    public void userIsInTheCategoryPage() throws Exception {
        new WhatsNew(driver)
                .WaitForPageToLoad();
    }


//    @Then("^validate the  Page Title \"(.+?)\" And Headline \"(.+?)\"$")
//    public void validateThePageTitleAndHeadlineHeadline(String Title, String HeadLine) {
//        new WhatsNew(driver)
//                .ValidatePageTitle(Title,HeadLine);
//    }

//    @Then("^validate the  Page Headline \"(.+?)\"$")
//    public void validateThePageHeadline(String HeadLine) {
//        new WhatsNew(driver)
//                .ValidatePageHeadline(HeadLine);
//    }

    @And("^Page Title \"(.+?)\"$")
    public void pageTitleTitle(String Title) {
        new WhatsNew(driver)
                .ValidatePageTitle(Title);
    }
}
