package step_definitions;

import command_providers.CommandAction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.HomePage;
import utilities.ReadConfigFiles;


public class HomePageSteps {
    private static final Logger LOGGER = LogManager.getLogger(HomePage.class);
    WebDriver driver = Hooks.driver;


    @Given("User Is In Home Page")
    public void userIsInHomePage() {
        new HomePage(driver)
                .homePage();
        LOGGER.info("User Is In Home Page");
    }


    @When("User Is In The Home Page, User Should See The Title")
    public void userIsInTheHomePageUserShouldSeeTheTitle() {
        new HomePage(driver)

                .validateTitle();
        LOGGER.info("User Saw The Title");

    }
}
