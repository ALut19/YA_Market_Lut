package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseClass;

public class YaMarketPage extends BaseClass {

    @FindBy(xpath = ".//li[@data-department='Электроника']")
    WebElement electronics;

    @FindBy(xpath = ".//div[contains(@class,'catalog-menu__list')]/*[contains(text(),'Телевизоры')]")
    WebElement tvset;

    @FindBy(xpath = "//div[@class='layout-grid__col layout-grid__col_width_2']/div[@class='catalog-menu i-bem catalog-menu_js_inited']/div[@class='catalog-menu__item'][2]/div[@class='catalog-menu__list']/a[1]")
    WebElement headphones;

    public YaMarketPage() {
        PageFactory.initElements(BaseClass.getDriver(), this);
    }

    public void setElectronics() {
        electronics.click();
    }

    public void setTvset() {
        ((JavascriptExecutor) BaseClass.getDriver()).executeScript("arguments[0].scrollIntoView();", tvset);
        tvset.click();
    }

    public void setHeadphones() {
    //    ((JavascriptExecutor) BaseClass.getDriver()).executeScript("arguments[0].scrollIntoView();", headphones);
        headphones.click();
    }
}
