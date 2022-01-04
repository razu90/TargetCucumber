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

    public Deals ClickOnDeals() throws Exception {
        LOGGER.debug("Click On Deals");
        CommandAction.element(driver, Deals).click();
        Thread.sleep(1000);
        return this;
    }


    public Deals selectCurrentDeals(String currentDeals) throws Exception {
        LOGGER.debug("Chose on going deals");
        driver.findElement(By.linkText(currentDeals)).click();
        Thread.sleep(1000);
        return this;
    }



    public Deals ValidationUrl(String url) throws Exception {
        LOGGER.debug("URL");
        String actualUrl = driver.getCurrentUrl();
        Thread.sleep(1000);
        Assert.assertEquals(url,actualUrl);
        return this;
    }
}
