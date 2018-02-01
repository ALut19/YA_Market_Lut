package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pages.BaseClass;


/**
 * Created by Maria on 06.05.2017.
 */
public class BasePageObject {


  //  public BasePageObject() {
    //    PageFactory.initElements(BaseClass.getDriver(), this);
   // }

    public void fillField(WebElement field, String value){
        field.clear();
        field.sendKeys(value);
    }

}
