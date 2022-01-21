package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page_objects.Categories;
import page_objects.NavigationBar;


public class CategoriesSteps {
    WebDriver driver = Hooks.driver;

    @When("^user clicks on categories$")
    public void the_user_clicks_on_categories() {
        new NavigationBar(driver)
                .clickOnCategories();

    }

    @And("^Chose \"(.+?)\" \"(.+?)\" \"(.+?)\"$")
    public void chose(String category1, String category2, String item) {
        new Categories(driver)
                .SelectCategory(category1, category2, item);
    }

    @Then("^validate the title contains \"(.+?)\"$")
    public void validate_the_title_contains(String title) {
        new Categories(driver)
                .titleValidation(title);
    }


}
