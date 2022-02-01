package pages.mainPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class StartPage extends BasePage {

    public StartPage(WebDriver driver){
        super(driver);
    }

    private final By loginButton = By.xpath("//a[@href='/login']");


    public StartPage clickLogin(){
        driver.findElement(loginButton).click();
        return this;
    }
}
