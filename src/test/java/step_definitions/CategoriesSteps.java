package step_definitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import page_objects.Categories;


public class CategoriesSteps {
    WebDriver driver = Hooks.driver;


    @Then("^Click on categories$")
    public void click_on_categories() throws Exception {
        new Categories(driver)
                .ClickOnCategories();
    }

    @Then("^Chose  1st \"(.+?)\"$")
    public void chose_1st(String string) throws Exception {
        new Categories(driver)
                .Select1stCategory(string);
    }

    @Then("^Chose 2nd \"(.+?)\"$")
    public void chose_2nd(String string) throws Exception {
        new Categories(driver)
                .Select2ndCategory(string);
    }

    @Then("^chose the item \"(.+?)\"$")
    public void chose_the_item(String string) throws Exception {
        new Categories(driver)
                .SelectItem(string);
    }

    @Then("^validate the title contains \"(.+?)\"$")
    public void validate_the_title_contains(String string) throws Exception {
        new Categories(driver)
                .titleValidation(string);
    }
}
