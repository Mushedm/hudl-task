package steps;

import io.cucumber.java.*;
import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import static org.junit.Assert.*;

import pages.loginPage;


public class loginSteps {

    WebDriver driver = null;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "/Users/mmiah/Documents/workspace/hudl-task/browser/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void teardown() {
        driver.close();
        driver.quit();
    }

    @Given("user navigates to the login page {string}")
    public void userNavigatesToTheLoginPage(String url) throws InterruptedException {
        Thread.sleep(1000);
        driver.get(url);
    }

    @And("the user enters the email {string} and password {string}")
    public void theUserEntersTheEmailAndPassword(String email, String password) {
        loginPage.emailField(driver).clear();
        loginPage.emailField(driver).sendKeys(email);
        loginPage.passwordField(driver).clear();
        loginPage.passwordField(driver).sendKeys(password);
    }

    @And("the user enters the password {string}")
    public void theUserEntersThePassword(String password) {
        loginPage.passwordField(driver).sendKeys(password);
    }

    @When("user clicks the login button")
    public void userClicksTheLoginButton() {
        loginPage.loginButton(driver).click();
    }

    @Then("the user is redirected to {string}")
    public void theUserIsRedirectedTo(String url) throws InterruptedException {
        Thread.sleep(1000);
        String currentUrl = driver.getCurrentUrl();
        assertEquals(url, currentUrl);
    }

    @Then("the user is shown login error message")
    public void theUserIsShownLoginErrorMessage() throws InterruptedException {
        Thread.sleep(1000);
        String errorMessage = loginPage.loginErrorMessage(driver).getText();
        assertEquals("We didn't recognize that email and/or password. Need help?", errorMessage);
    }

    @And("selects the remember me option")
    public void selectsTheRememberMeOption() throws InterruptedException {
        Thread.sleep(2000);
        loginPage.rememberMe(driver).click();
    }

    @When("the user clicks log out")
    public void theUserClicksSignOut() throws InterruptedException {
        Thread.sleep(1000);
        loginPage.userItem(driver).click();
        loginPage.logOut(driver).get(0).click();
    }

    @When("the user clicks login from homepage")
    public void theUserClicksLoginFromHomepage() throws InterruptedException {
        Thread.sleep(1000);
        loginPage.logOutFromHomePage(driver).get(1).click();
    }

    @When("user clicks the back icon")
    public void userClicksTheBackIcon() throws InterruptedException {
        Thread.sleep(1000);
        loginPage.backIcon(driver).click();
    }

    @When("user clicks the logo icon")
    public void userClicksTheLogoIcon() throws InterruptedException {
        Thread.sleep(1000);
        loginPage.logoIcon(driver).get(0).click();
    }

    @And("the user clicks forgotten password link")
    public void theUserClicksForgottenPasswordLink() throws InterruptedException {
        Thread.sleep(1000);
        loginPage.forgotPassword(driver).click();
    }

    @When("the user enters the forgotten email {string}")
    public void theUserEntersTheForgottenEmail(String email) throws InterruptedException {
        Thread.sleep(1000);
        loginPage.forgottenEmailField(driver).clear();
        loginPage.forgottenEmailField(driver).sendKeys(email);
    }

    @And("the user clicks send password reset button")
    public void theUserClicksSendPasswordResetButton() throws InterruptedException {
        Thread.sleep(1000);
        loginPage.sendPasswordReset(driver).click();
    }

    @Then("the check youre email message is displayed")
    public void theCheckYoureEmailMessageIsDisplayed() throws InterruptedException {
        Thread.sleep(1000);
        String resetMessage = loginPage.resetMessage(driver).get(3).getText();
        System.out.println("message  " + resetMessage);
        assertEquals("Check Your Email", resetMessage);
    }

    @When("the user clicks forgotten password link inside error message")
    public void theUserClicksForgottenPasswordLinkInsideErrorMessage() throws InterruptedException {
        Thread.sleep(1000);
        loginPage.forgotPasswordWithinErrorMessage(driver).click();
    }

    @And("the user clicks the signup link")
    public void theUserClicksTheSignupLink() throws InterruptedException {
        Thread.sleep(1000);
        loginPage.singUpButton(driver).click();
    }
}
