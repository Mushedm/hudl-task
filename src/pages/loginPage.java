package pages;

import org.openqa.selenium.*;

import java.util.List;

public class loginPage {

    private static WebElement element = null;

    public static WebElement backIcon(WebDriver driver) {
        element = driver.findElement(By.cssSelector("a.icon-back"));
        return element;
    }

    public static WebElement emailField(WebDriver driver) {
        element = driver.findElement(By.id("email"));
        return element;
    }

    public static WebElement passwordField(WebDriver driver) {
        element = driver.findElement(By.id("password"));
        return element;
    }

    public static WebElement loginButton(WebDriver driver) {
        element = driver.findElement(By.id("logIn"));
        return element;
    }

    public static WebElement loginErrorMessage(WebDriver driver) {
        WebElement elements = driver.findElement(By.cssSelector("div.login-error-container p"));
        return elements;
    }

    public static WebElement rememberMe(WebDriver driver) {
        element = driver.findElement(By.cssSelector("label.form__label--custom"));
        return element;
    }

    public static WebElement forgotPassword(WebDriver driver) {
        element = driver.findElement(By.cssSelector("a#forgot-password-link"));
        return element;
    }

    public static WebElement forgotPasswordWithinErrorMessage(WebDriver driver) {
        element = driver.findElement(By.cssSelector("a#forgot-password-link"));
        return element;
    }

    public static WebElement userItem(WebDriver driver) {
        WebElement element = driver.findElement(By.cssSelector("div.hui-globaluseritem"));
        return element;
    }

    public static List<WebElement> logOut(WebDriver driver) {
        List<WebElement> element = driver.findElements(By.cssSelector("a[data-qa-id='webnav-usermenu-logout']"));
        return element;
    }

    public static List<WebElement> logOutFromHomePage(WebDriver driver) {
        List<WebElement> element = driver.findElements(By.cssSelector("a.mainnav__btn.mainnav__btn--primary"));
        return element;
    }

    public static List<WebElement> logoIcon(WebDriver driver) {
        List<WebElement> element = driver.findElements(By.cssSelector(".icon-logomark"));
        return element;
    }

    public static WebElement sendPasswordReset(WebDriver driver) {
        WebElement element = driver.findElement(By.cssSelector("button#resetBtn"));
        return element;
    }

    public static List<WebElement> resetMessage(WebDriver driver) {
        List<WebElement> element = driver.findElements(By.cssSelector("div.reset-info h4"));
        return element;
    }

    public static WebElement forgottenEmailField(WebDriver driver) {
        element = driver.findElement(By.id("forgot-email"));
        return element;
    }

    public static WebElement singUpButton(WebDriver driver) {
        element = driver.findElement(By.cssSelector("div.sign-up-trial a"));
        return element;
    }
}
