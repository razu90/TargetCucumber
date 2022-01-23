package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page_objects.SecondaryNavBar;

public class SecondaryNavBarSteps {
    WebDriver driver = Hooks.driver;

    @When("^user clicks on My Store form the Secondary Navigation Bar$")
    public void userClicksOnMyStoreFormTheSecondaryNavigationBar() {
        new SecondaryNavBar(driver)
                .clickOnMyStore();
    }

    @Then("^User Validate The Manu Bar Functionality$")
    public void UserValidateTheManuBarFunctionality() {
        new SecondaryNavBar(driver)
                .validateMyStore();
    }

    @When("^User Clicks On Multiple Tab \"(.+?)\" form the Secondary Navigation Bar$")
    public void userClicksOnMultipleTabFormTheSecondaryNavigationBar(String Tab) {
        new SecondaryNavBar(driver)
                .selectMultipleTab(Tab);
    }

    @Then("^User Validate The Xpath \"(.+?)\"$")
    public void userValidateTheXpath(String Xpath) {
        new SecondaryNavBar(driver)
                .validateMultipleXpath(Xpath);
    }

    @When("^User Clicked On More For the Secondary Navigation Bar$")
    public void userClickedOnMoreForTheSecondaryNavigationBar() {
        new SecondaryNavBar(driver)
                .selectMore();
    }

    @And("^Select Navigation List \"(.+?)\"$")
    public void selectNavigationList(String navList) {
        new SecondaryNavBar(driver)
                .selectNavList(navList);
    }

    @Then("^Validate The Page Headline \"(.+?)\"$")
    public void validateThePageHeadline(String modifiedHeadline) {
        new SecondaryNavBar(driver)
                .validatePageHeadline(modifiedHeadline);
    }
}
