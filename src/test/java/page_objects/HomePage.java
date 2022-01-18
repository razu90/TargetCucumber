package page_objects;

import command_providers.CommandAction;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utilities.ReadConfigFiles;

public class HomePage {

    private static final Logger LOGGER = LogManager.getLogger(HomePage.class);

    public WebDriver driver;

    public HomePage (WebDriver driver) {
        this.driver = driver;
    }

    public HomePage homePage(){
        CommandAction.browserActions(driver).openBrowser(ReadConfigFiles.getPropertyValues("MainUrl"));
        LOGGER.debug("User Is In Home Page");
        return this;

    }


    public HomePage validateTitle (){
        String actualTitle = driver.getTitle();
        String expectedTitle = "Target : Expect More. Pay Less.";
        Assert.assertEquals(expectedTitle,actualTitle);
        LOGGER.info("Home Page Title Is " +actualTitle);
        return this;

    }


}
