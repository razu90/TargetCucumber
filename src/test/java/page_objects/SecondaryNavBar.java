package page_objects;

import command_providers.AssertThat;
import command_providers.CommandAction;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecondaryNavBar {
    private final By MyStore = By.xpath("//body/div[@id='root']/div[@id='viewport']/div[3]/div[2]/div[1]/div[1]/div[1]/button[1]/div[2]");
    private final By Registry = By.xpath("//*/li/a[text()=");
    private final By WeeklyAd = By.xpath("//*/li/a[text()=");
    private final By RedCard = By.xpath("//*/li/a[text()=");
    private final By GiftCards = By.xpath("//*/li/a[text()=");
    private final By FindStores = By.xpath("//*/li/a[text()=");
    private final By Orders = By.xpath("//*/li/a[text()=");
    private final By Favorites = By.xpath("//*/span[2][text()='Favorites']");
    private final By More = By.id("more");
    private final By ShippingAndOrderServices = By.linkText("Shipping and Order Services");
    private final By TargetApp = By.linkText("Target App");
    private final By Pharmacy = By.linkText("Pharmacy");
    private final By GiftIdeas = By.linkText("Gift Ideas");


    private static final Logger LOGGER = LogManager.getLogger(HomePage.class);

    public WebDriver driver;

    public SecondaryNavBar (WebDriver driver) {
        this.driver = driver;
    }

    public SecondaryNavBar clickOnMyStore(){
        LOGGER.debug("Clicked On My Store");
        CommandAction.wait(driver,MyStore).waitForElementToBeVisible();
        CommandAction.element(driver,MyStore).click();
        return this;
    }
    public SecondaryNavBar validateMyStore(){
        LOGGER.debug("User See The Zip Code Input Option");
        CommandAction.wait(driver,By.id("zipOrCityState")).waitForElementToBeVisible();
        AssertThat.elementAssertions(driver, By.id("zipOrCityState")).elementIsDisplayed();
        return this;
    }

    public SecondaryNavBar selectMultipleTab(String tab){
        LOGGER.debug("User Select " +tab);
//        CommandAction.wait(driver,By.xpath("//*/li/a[text()=" + tab)).waitForElementToBeVisible();
//        CommandAction.element(driver,By.xpath("//*/li/a[text()=" + tab)).click();
        CommandAction.wait(driver,By.linkText(tab)).waitForElementToBeVisible();
        CommandAction.element(driver,By.linkText(tab)).click();
        return this;
    }
    public SecondaryNavBar validateMultipleXpath(String xPath){
        LOGGER.debug("User see " +xPath);
        CommandAction.wait(driver,By.xpath(xPath)).waitForElementToBeVisible();
        AssertThat.elementAssertions(driver,By.xpath(xPath)).elementIsDisplayed();
        return this;
    }

    public SecondaryNavBar selectMore(){
        CommandAction.wait(driver,More).waitForElementToBeVisible();
        CommandAction.element(driver,More).click();
        return this;
    }
    public SecondaryNavBar selectNavList (String NavList){
        CommandAction.wait(driver,By.linkText(NavList)).waitForElementToBeVisible();
        CommandAction.element(driver,By.linkText(NavList)).click();
        return this;
    }
    public SecondaryNavBar validatePageHeadline (String headLine){
        CommandAction.wait(driver,By.xpath("//h1[text()=" + headLine)).waitForElementToBeVisible();
        AssertThat.elementAssertions(driver,By.xpath("//h1[text()=" +headLine)).elementIsDisplayed();
        return this;
    }

    }

