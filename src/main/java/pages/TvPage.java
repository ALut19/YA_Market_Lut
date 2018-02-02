package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by user on 02.02.2018.
 */
public class TvPage {

    @FindBy(name = "glf-pricefrom-var")
    WebElement priceFrom;

    @FindBy(xpath = ".//label[contains(text(),'Samsung')]")
    WebElement checkboxSamsung;

    @FindBy(xpath = ".//label[contains(text(),'LG')]")
    WebElement checkboxLG;

    @FindBy(xpath = ".//div[@class='n-filter-panel-aside__apply']")
    WebElement applyButton;

    public TvPage(){
        PageFactory.initElements(BaseClass.getDriver(), this);
    }

    public void setPriceFrom(){priceFrom.sendKeys("20000");}

    public void setCheckboxLG(){
        ((JavascriptExecutor) BaseClass.getDriver()).executeScript("arguments[0].scrollIntoView();", checkboxLG);
        checkboxLG.click();}


    public void setCheckboxSamsung(){checkboxSamsung.click();}

    public void setApplyButton(){
        ((JavascriptExecutor) BaseClass.getDriver()).executeScript("arguments[0].scrollIntoView();", applyButton);
        applyButton.click();
    }

}
