//package page_objects;
//
//import command_providers.CommandAction;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import step_definitions.SignInSteps;
//
//public class SignIn {
//
//    private static final By SignInButton = By.xpath("//*[@id='account']/span[2]");
//    private static final By SignInClick = By.xpath("//*[@id='accountNav-signIn']/a/div");
//    private static final By UserName = By.id("username");
//    private static final By Password = By.id("password");
//    private static final By LoginButton = By.xpath("//*[@id='login']/span");
//    private static final By ErrorMsg = By.xpath("//*[@id='__next']/div[2]/div/div[1]/div/div[2]/div/div");
//
//    //-------------------------------Logger And WebDriver Start-------------------------------
//    public WebDriver driver;
//    private static final Logger LOGGER = LogManager.getLogger(SignInSteps.class);
//
//    public SignIn(WebDriver driver) {
//        this.driver = driver;
//    }
//
////-------------------------------Logger And WebDriver End-------------------------------
//
//
//    public void ClickSignIn() {
//        CommandAction.element(driver, SignInButton).click();
//    }
//
//    public void ClickDropDownSignIn() {
//        CommandAction.wait(driver, SignInClick).waitForElementToBeVisible();
//        CommandAction.element(driver, SignInClick).click();
//    }
//
//    public void EnterUserNameAndPasswod(String username, String password) {
//        CommandAction.wait(driver, UserName).waitForElementToBeVisible();
//        CommandAction.element(driver, UserName).setValue(username);
//        CommandAction.element(driver, Password).setValue(password);
//    }
//
//    public void ClickLogin() {
//        CommandAction.wait(driver, LoginButton).fixWait(2000);
//        CommandAction.element(driver, LoginButton).click();
//    }
//
//    public SignIn validateErrorMsg(String expectedError) {
//        String actualError = driver.findElement(ErrorMsg).getText();
//        Assert.assertEquals(actualError,expectedError);
//            LOGGER.info("Home Page Title Is " + ErrorMsg);
//            return this;
//
//        }
//    }
//
