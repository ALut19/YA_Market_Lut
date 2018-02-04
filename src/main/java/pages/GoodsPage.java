package pages;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import steps.BaseClass;

/**
 * Created by user on 02.02.2018.
 */
public class GoodsPage extends BaseClass {

    String first;

    @FindBy(name = "glf-pricefrom-var")
    WebElement priceFrom;

    @FindBy(xpath = ".//label[contains(text(),'Samsung')]")
    WebElement checkboxSamsung;

    @FindBy(xpath = ".//label[contains(text(),'LG')]")
    WebElement checkboxLG;

    @FindBy(xpath = ".//label[contains(text(),'Beats')]")
    WebElement checkboxBeats;

    @FindBy(xpath = ".//div[@class='n-filter-panel-aside__apply']")
    WebElement applyButton;

    @FindBy(xpath = ".//div[@class='n-snippet-card2__title']")
    WebElement tvItems;

    @FindBy(xpath = ".//div[@class='headline__header']")
    WebElement headfonsTitle;

    @FindBy(name = "text")
    WebElement searchBox;

    @FindBy(xpath = ".//span[@class='search2__button']")
    WebElement searchButton;

    @FindBy(xpath = ".//div[@class='n-title__text']")
    WebElement title;


    public GoodsPage(){
        PageFactory.initElements(BaseClass.getDriver(), this);
    }

    public void setPriceFrom(String price){
        priceFrom.sendKeys(price);}

/*
    public void setCheckboxLG(){
        ((JavascriptExecutor) BaseClass.getDriver()).executeScript("arguments[0].scrollIntoView();", checkboxLG);
        checkboxLG.click();}

    public void setCheckboxSamsung(){checkboxSamsung.click();}

    public void setCheckboxBeats(){
        ((JavascriptExecutor) BaseClass.getDriver()).executeScript("arguments[0].scrollIntoView();", checkboxBeats);
        checkboxBeats.click();}
*/
    public void clickCheckbox(String elementName){
        switch (elementName) {
            case "LG":
                ((JavascriptExecutor) BaseClass.getDriver()).executeScript("arguments[0].scrollIntoView();", checkboxLG);
                checkboxLG.click();
                break;
            case "Samsung":
                checkboxSamsung.click();
                break;
            case "Beats":
                ((JavascriptExecutor) BaseClass.getDriver()).executeScript("arguments[0].scrollIntoView();", checkboxBeats);
                checkboxBeats.click();
                break;
    }}

    public void setApplyButton(){
        ((JavascriptExecutor) BaseClass.getDriver()).executeScript("arguments[0].scrollIntoView();", applyButton);
        applyButton.click();
    }

    public void countItems(){
        ((JavascriptExecutor) BaseClass.getDriver()).executeScript("arguments[0].scrollIntoView();", headfonsTitle);
        try {
            Thread.sleep(8000);
            List<WebElement> list = BaseClass.getDriver().findElements(By.xpath(".//div[@class='n-snippet-card2__title']"));
            System.out.println(list.size());
            System.out.println(list);
            assertThat(12, equalTo(list.size()));
        }catch (InterruptedException c){
            c.printStackTrace();
        }
        first = BaseClass.getDriver().findElement(By.xpath(".//div[@class='n-snippet-card2__title'][1]")).getText();
        System.out.println("первый товар в списке " + first);
    }

    public void sleep(){
        try {
            Thread.sleep(8000);
        }catch (InterruptedException c){
            c.printStackTrace();

    }}

    public void countItems2(){
        ((JavascriptExecutor) BaseClass.getDriver()).executeScript("arguments[0].scrollIntoView();", headfonsTitle);

            List<WebElement> list = BaseClass.getDriver().findElements(By.xpath(".//div[@class='n-snippet-cell2__title']"));
            System.out.println(list.size());
            System.out.println(list);
            assertThat(12, equalTo(list.size()));
    }

    public void saveText(){
        first = BaseClass.getDriver().findElement(By.xpath(".//div[@class='n-snippet-cell2__title'][1]")).getText();
        System.out.println("первый товар в списке " + first);
    }

    public void setSearchBox(){
        ((JavascriptExecutor) BaseClass.getDriver()).executeScript("arguments[0].scrollIntoView();", searchBox);
            searchBox.sendKeys(first);
 }

    public void setSearchButton(){searchButton.click();}

    public void setTitle(){Assert.assertTrue(title.getText().contains(first));
        System.out.println("заголовок = " + first);}

}
