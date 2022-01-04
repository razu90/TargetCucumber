package page_objects;

import command_providers.CommandAction;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Categories {

    private final By Categories = By.linkText("Categories");


    private static final Logger LOGGER = LogManager.getLogger(Categories.class);

    public WebDriver driver;

    public Categories(WebDriver driver) {
        this.driver = driver;
    }

    public Categories ClickOnCategories() throws Exception {
        LOGGER.debug("Click On Categories");
        CommandAction.element(driver, Categories).click();
        Thread.sleep(1000);
        return this;
    }


    public Categories Select1stCategory(String category1) throws Exception {
        LOGGER.debug("Click On Categories");
        driver.findElement(By.linkText(category1)).click();
        Thread.sleep(1000);

        return this;
    }

    public Categories Select2ndCategory(String category2) throws Exception {
        LOGGER.debug("Click On 2nd Category");
        driver.findElement(By.linkText(category2)).click();
        Thread.sleep(1000);
        return this;
    }

    public Categories SelectItem(String item) throws Exception {
        LOGGER.debug("Select a item");
        driver.findElement(By.linkText(item)).click();
        Thread.sleep(1000);
        return this;
    }

    public Categories titleValidation(String title) throws Exception {
        LOGGER.debug("Title");
        String actualTitle = driver.getTitle();
        Thread.sleep(1000);
        Assert.assertEquals(title, actualTitle);
        return this;
    }
}
