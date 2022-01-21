package page_objects;

import command_providers.CommandAction;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationBar {
    private final By Categories = By.xpath("//span[contains(text(),'Categories')]");
    private final By Deals = By.cssSelector("#secondary");
    private final By WhatNew = By.cssSelector("#trending");
    private final By PickupDelivery = By.xpath("//span[contains(text(),'Pickup & Delivery')]");
    private final By SearchBox = By.cssSelector("#search");
    private final By SearchIcon = By.xpath("//button[contains(text(),'go')]");
    private final By SignIn = By.cssSelector("#account");
    private final By ShoppingCart = By.cssSelector("#cart");


    private static final Logger LOGGER = LogManager.getLogger(HomePage.class);

    public WebDriver driver;

    public NavigationBar (WebDriver driver) {
        this.driver = driver;
    }
    public NavigationBar clickOnWhatsNew(){
        LOGGER.debug("Click On What's New");
        CommandAction.element(driver,WhatNew ).click();
        return this;
    }
}
