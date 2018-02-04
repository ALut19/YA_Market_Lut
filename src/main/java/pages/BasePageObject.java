package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import steps.BaseClass;

public class BasePageObject {

    public BasePageObject() {
        PageFactory.initElements(BaseClass.getDriver(), this);
    }

    public void clickCheckbox(WebElement element) {
        element.click();

    }

}

