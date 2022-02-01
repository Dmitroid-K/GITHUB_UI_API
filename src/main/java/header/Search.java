package header;


import common.CommonActions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Search {
    @FindBy(xpath = "//div[@class='position-relative']//input[@type='text']")
    private static WebElement search;

    public static void searchFor(String name){
        search.sendKeys(name, Keys.ENTER);
    }
}
