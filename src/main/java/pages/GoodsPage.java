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

public class GoodsPage extends BaseClass {

    private String first;

    public void setFirst(String name)
    {
        first = name;
    }

    public String getFirst()
    {
        return first;
    }

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

    @FindBy(xpath = ".//div[@class='headline__header']")
    WebElement customTitle;

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

    //подсчет товаров на странице
    public void countItems(String name){
        switch (name) {
            case "телевизор":
                List<WebElement> list = BaseClass.getDriver().findElements(By.xpath(".//div[@class='n-snippet-card2__title']"));
                System.out.println(list.size());
                System.out.println(list);
                assertThat(12, equalTo("колличество товаров на странице = " + list.size()));
                break;
            case "наушники":
                ((JavascriptExecutor) BaseClass.getDriver()).executeScript("arguments[0].scrollIntoView();", customTitle);
                List<WebElement> list2 = BaseClass.getDriver().findElements(By.xpath(".//div[@class='n-snippet-cell2__title']"));
                System.out.println("колличество товаров на странице = " + list2.size());
                assertThat(12, equalTo(list2.size()));
                break;
        }
    }

    //СОХРАНЕНИЕ И ПЕРЕДАЧА Текста
    public void sendSearchbox(String item) {
        switch (item) {
            case "телевизор":
                ((JavascriptExecutor) BaseClass.getDriver()).executeScript("arguments[0].scrollIntoView();", customTitle);
                try {
                    Thread.sleep(5000);
                    setFirst(BaseClass.getDriver().findElement(By.xpath(".//div[@class='n-snippet-card2__title']/a")).getText());
                    System.out.println("первый товар в списке = " + getFirst());
                    ((JavascriptExecutor) BaseClass.getDriver()).executeScript("arguments[0].scrollIntoView();", searchBox);
                    searchBox.sendKeys("\"" +  getFirst() + "\"");
                } catch (InterruptedException c) {
                    c.printStackTrace();
                }
                break;
            case "наушники":
                ((JavascriptExecutor) BaseClass.getDriver()).executeScript("arguments[0].scrollIntoView();", customTitle);
                try {
                    Thread.sleep(5000);
                    setFirst(BaseClass.getDriver().findElement(By.xpath(".//div[@class='n-snippet-cell2__title']/a")).getText());
                    System.out.println("первый товар в списке " + getFirst());
                    ((JavascriptExecutor) BaseClass.getDriver()).executeScript("arguments[0].scrollIntoView();", searchBox);
                    searchBox.sendKeys("\"" +  getFirst() + "\"");
                } catch (InterruptedException c) {
                    c.printStackTrace();
                }
                break;
        }
    }

    public void setSearchButton(){searchButton.click();}

    public void setTitle(){
        System.out.println("заголовок = " + title.getText());
        Assert.assertTrue(title.getText().contains(getFirst()));
        }
}
