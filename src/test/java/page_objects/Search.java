package page_objects;

import command_providers.CommandAction;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Search {
    private  final By SearchBox = By.id("search");
    private  final By SearchIcon = By.xpath("//*[@id=\"headerMain\"]/div/form/button[2]");

    private static final Logger LOGGER = LogManager.getLogger(Search.class);

    public WebDriver driver;

    public Search (WebDriver driver) {
        this.driver = driver;
    }

    public Search clickOnSearchBox () {
        LOGGER.debug("Clicked On Search Box");
        CommandAction.element(driver,SearchBox).click();
        return this;
    }

    public Search typeProduct (String typeProduct) {
        LOGGER.debug("Typing Products");
        CommandAction.wait(driver, SearchBox).waitForElementToBeVisible();
        CommandAction.element(driver,SearchBox).setValue(typeProduct);
        return this;
    }

    public Search clickOnSearchIcon () {
        LOGGER.debug("Clicked On Search icon");
        CommandAction.wait(driver, SearchIcon).waitForElementToBeVisible();
        CommandAction.element(driver,SearchIcon).click();
        CommandAction.wait(driver,SearchIcon).fixWait(1000);
        return this;
    }

    public Search validatePageTitle (String expectedTitle) {
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
        LOGGER.debug("Title is" + actualTitle);
        return this;
    }
}
