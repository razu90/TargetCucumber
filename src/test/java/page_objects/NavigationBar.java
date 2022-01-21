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

    public NavigationBar clickOnCategories(){
        LOGGER.debug("Clicked On Categories");
        CommandAction.element(driver,Categories).click();
        return this;
    }

    public NavigationBar clickOnDeals(){
        LOGGER.debug("Clicked On Deals");
        CommandAction.element(driver,Deals).click();
        return this;
    }

    public NavigationBar clickOnWhatsNew(){
        LOGGER.debug("Clicked On What's New");
        CommandAction.element(driver,WhatNew ).click();
        return this;
    }

    public NavigationBar clickOnPickupDelivery(){
        LOGGER.debug("Clicked On PickupDelivery");
        CommandAction.element(driver,PickupDelivery).click();
        return this;
    }

    public NavigationBar enterValueOnSearchBox(String value){
        LOGGER.debug("Clicked On SearchBox");
        CommandAction.wait(driver,SearchBox).waitForElementToBeVisible();
        CommandAction.element(driver,SearchBox).setValue(value);
        return this;
    }

    public NavigationBar clickOnSearchIcon(){
        LOGGER.debug("Clicked On SearchIcon");
        CommandAction.wait(driver,SearchIcon).waitForElementToBeVisible();
        CommandAction.element(driver,SearchIcon).click();
        return this;
    }

    public NavigationBar clickOnSignIn(){
        LOGGER.debug("Clicked On SignIn");
        CommandAction.element(driver,SignIn).click();
        return this;
    }

    public NavigationBar clickOnShoppingCart(){
        LOGGER.debug("Clicked On ShoppingCart");
        CommandAction.element(driver,ShoppingCart).click();
        return this;
    }
}
