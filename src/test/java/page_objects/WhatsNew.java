package page_objects;

import command_providers.CommandAction;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WhatsNew {
    private final By clickWhatNew = By.id("trending");


    private static final Logger LOGGER = LogManager.getLogger(Categories.class);

    public WebDriver driver;

    public WhatsNew(WebDriver driver) {
        this.driver = driver;
    }

    public WhatsNew ClickOnWhatsNew() throws Exception {
        LOGGER.debug("Click On Deals");
        CommandAction.element(driver,clickWhatNew ).click();
        Thread.sleep(1000);
        return this;
    }


    public WhatsNew selectCategory(String newCategory) {
        LOGGER.debug("Chose on going deals");
        driver.findElement(By.linkText(newCategory)).click();

        return this;
    }

    public WhatsNew WaitForPageToLoad() throws Exception {
        LOGGER.debug("User is in the category page");
        Thread.sleep(2000);
        return this;
    }



    public WhatsNew ValidatePageHeadline(String headLine) {
        LOGGER.debug("Page Title is" + headLine);
        String actualHeadline = driver.findElement(By.className("Heading__StyledHeading-sc-1mp23s9-0 dUBjVM h-margin-b-none")).getText();
        Assert.assertEquals(headLine, actualHeadline);
        return this;
    }

    public WhatsNew ValidatePageTitle(String title) {
        LOGGER.debug("Page Title is" + title);
        String actualTitle = driver.getTitle();
        Assert.assertEquals(title,actualTitle);

        return this;
    }
}
