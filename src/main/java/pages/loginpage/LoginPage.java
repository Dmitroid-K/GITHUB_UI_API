package pages.loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver){
        super(driver);
    }

    private final By usernameInput = By.id("login_field");
    private final By passwordInput = By.id("password");
    private final By enterButton = By.name("commit");

    public LoginPage login(String name, String password){
        driver.findElement(usernameInput).sendKeys(name);
        driver.findElement(passwordInput).sendKeys(password);
        driver.findElement(enterButton).click();
        return this;
    }

}
