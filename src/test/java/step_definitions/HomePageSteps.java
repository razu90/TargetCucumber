package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import page_objects.HomePage;


public class HomePageSteps {
    WebDriver driver = Hooks.driver;


    @Given("^the user is on Home Page$")
    public void the_user_is_on_home_page() {
        new HomePage(driver)
                .homePage();
    }

    @Then("^the user should see the title$")
    public void the_user_should_see_the_title() {
        new HomePage(driver)
                .validateTitle();
    }
}
