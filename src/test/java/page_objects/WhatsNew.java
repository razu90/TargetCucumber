package page_objects;

import command_providers.CommandAction;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WhatsNew {
    private final By clickWhatNew = By.id("trending");
    private final By PageHeadLine = By.xpath("//*/h1[text()='New Arrivals']");


    private static final Logger LOGGER = LogManager.getLogger(Categories.class);

    public WebDriver driver;

    public WhatsNew(WebDriver driver) {
        this.driver = driver;
    }

    public WhatsNew ClickOnWhatsNew() throws Exception {
        LOGGER.debug("Click On What's New");
        CommandAction.element(driver,clickWhatNew ).click();
        Thread.sleep(1000);
        return this;
    }


    public WhatsNew selectCategory(String newCategory) {
        LOGGER.debug("Chose Women's New Arrivals");
        driver.findElement(By.linkText(newCategory)).click();

        return this;
    }

    public WhatsNew WaitForPageToLoad() throws Exception {
        LOGGER.debug("User is in the New Arrivals page");
        Thread.sleep(2000);
        return this;
    }



    public WhatsNew ValidatePageHeadline(String headLine) {
        LOGGER.debug("Page Head Line is " + headLine);
        String actualHeadline = driver.findElement(PageHeadLine).getText();
        String expectedHeadLine = headLine;
        Assert.assertEquals(expectedHeadLine, actualHeadline);
        return this;
    }

}
