package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YaMarketPage {

    @FindBy(xpath = ".//li[@data-department='Электроника']")
    WebElement electronics;

    @FindBy(xpath = ".//div[contains(@class,'catalog-menu__list')]/*[contains(text(),'Телевизоры')]")
    WebElement tvset;

    public YaMarketPage(){
        PageFactory.initElements(BaseClass.getDriver(), this);
    }

    public void setElectronics(){electronics.click();}

    public void setTvset(){
    ((JavascriptExecutor) BaseClass.getDriver()).executeScript("arguments[0].scrollIntoView();", tvset);
    tvset.click();
    }
}
