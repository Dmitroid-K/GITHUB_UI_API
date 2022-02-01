import common.CommonActions;
import header.TopMenu;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pages.BasePage;
import pages.loginpage.LoginPage;
import pages.mainPage.StartPage;

import java.io.IOException;

import static constants.UrlsAndTimeouts.Urls.GITHUB_MAIN_PAGE;

public class BaseTest {
    protected WebDriver driver = CommonActions.createDriver();
    protected TopMenu topMenu = new TopMenu(driver);
    protected BasePage basePage = new BasePage(driver);
    protected StartPage mainPage = new StartPage(driver);
    protected LoginPage loginPage = new LoginPage(driver);


    @BeforeMethod
    public void signIn() throws IOException {
        basePage.open(GITHUB_MAIN_PAGE);
        mainPage.clickLogin();
        System.getProperties().load(ClassLoader.getSystemResourceAsStream("loginData.properties"));
        loginPage.login(System.getProperty("username"), System.getProperty("password"));
    }
    @AfterTest
    public void clearCookiesAndLocalStorage(){
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        driver.manage().deleteAllCookies();
        javascriptExecutor.executeScript("window.sessionStorage.clear()");
    }
    @AfterSuite(alwaysRun = true)
    public void close(){
        driver.quit();
    }
}
