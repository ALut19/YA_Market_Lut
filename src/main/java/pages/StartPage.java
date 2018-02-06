package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseClass;

public class StartPage extends BaseClass {

    @FindBy(xpath = ".//a[@data-id='market']")
    WebElement market;

    public StartPage(){
        PageFactory.initElements(BaseClass.getDriver(), this);
    }

    public void setMarket (){
        market.click();
    }
}
