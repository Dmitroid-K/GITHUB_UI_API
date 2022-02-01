package header;

import constants.Sections;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class TopMenu extends BasePage {

    public static final String ITEM_PATTERN = "//a[contains(@class, 'Header-link') and contains(text(), '%s')]";

    public TopMenu(WebDriver driver){
        super(driver);
    }

    public boolean ItemExists(Sections name){
        return driver.findElement(By.xpath(String.format(ITEM_PATTERN, name.getValue()))).isDisplayed();
    }

    public boolean ifTopMenuDisplayed(){
        boolean topMenuDisplayed = true;
        for (Sections section: Sections.values()) {
            if (ItemExists(section)) {
                continue;
            }
            topMenuDisplayed = false;
            break;
        }
        return topMenuDisplayed;
    }

    public void clickOnItem(Sections name){
        driver.findElement(By.xpath(String.format(ITEM_PATTERN, name.getValue()))).click();
    }
}
