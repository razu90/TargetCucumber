package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.HomePage;
import page_objects.SignIn;

public class SignInSteps {
//-------------------------------Logger And WebDriver Start-------------------------------
    private static final Logger LOGGER = LogManager.getLogger(SignInSteps.class);
    WebDriver driver = Hooks.driver;
//-------------------------------Logger And WebDriver End-------------------------------


//---------------------Scenario Start-----------------------------
    @Then("From The Home Page User Will Click On Sign In Button")
    public void fromTheHomePageUserWillClickOnSignInButton() {
        new SignIn(driver)
                .ClickSignIn();
        LOGGER.info("User Click On Sign In");
    }

    @Then("^Click On Sign In From The DropDown Menu$")
    public void click_on_sign_in_from_the_drop_down_menu() {
        new SignIn(driver)
                .ClickDropDownSignIn();
        LOGGER.info("User Click On Sign In From The Drop Down Menu");

    }

    @When("^User Is In Sign In Page User Enter username \"(.+?)\" and password \"(.+?)\"$")
    public void user_is_in_sign_in_page_user_enter_username_and_password(String username, String password) {
        new SignIn(driver)
                .EnterUserNameAndPasswod(username, password);
        LOGGER.info("User Enter User Name And Password");


    }
//-----------------------You Can Not Login With Automation Script-------------------------
    @When("Click Login")
    public void click_login() {
        new SignIn(driver)
                .ClickLogin();
        LOGGER.info("User Click On Sign In");

    }
//-----------------Bcz You Can Not Log in, So The Next 2 Test Will Bee Error Too----------------------
    @Then("User Navigated To Home Page")
    public void user_navigated_to_home_page() {
        new HomePage(driver)
                .validateTitle();
        LOGGER.info("User See The Home Page Title");
    }


    @Then("User See  Error Msg")
    public void userSeeErrorMsg(String errorMsg) {
        new SignIn(driver)
                .validateErrorMsg(errorMsg);
        LOGGER.info("User See The Error Msg");

    }
//---------------------Scenario End-----------------------------
}
