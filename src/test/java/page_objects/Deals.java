package page_objects;

import command_providers.CommandAction;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Deals {

    private final By Deals = By.linkText("Deals");


    private static final Logger LOGGER = LogManager.getLogger(Categories.class);

    public WebDriver driver;

    public Deals(WebDriver driver) {
        this.driver = driver;
    }

    public Deals ClickOnDeals(){
        LOGGER.debug("Click On Deals");
        CommandAction.element(driver, Deals).click();
        return this;
    }


    public Deals selectCurrentDeals(String currentDeals) throws Exception {
        LOGGER.debug("Chose on going deals");
        CommandAction.wait(driver,By.linkText(currentDeals)).waitForElementToBeVisible();
        CommandAction.element(driver,By.linkText(currentDeals)).click();
        Thread.sleep(1000);
        return this;
    }



    public Deals ValidationUrl(String url){
        LOGGER.debug("URL");
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(url,actualUrl);
        return this;
    }

    public Deals ValidatePageTitle(String title){
        String actualTitle = driver.getTitle();
        Assert.assertEquals(title,actualTitle);
        LOGGER.debug("TITLE");
        return this;
    }



}
