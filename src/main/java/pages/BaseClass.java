package pages;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import util.TestProperties;

import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class BaseClass {
    protected static WebDriver driver;
    protected static String baseUrl;
    public static Properties properties = TestProperties.getInstance().getProperties();

    public BaseClass() {
        PageFactory.initElements(BaseClass.getDriver(), this);
    }

    public static WebDriver getDriver(){
        return driver;
    }

    @Before
    public static void setUp() throws Exception {
        properties.getProperty("browser"); {
                System.setProperty("webdriver.chrome.driver", properties.getProperty("webdriver.chrome.driver"));
                driver = new ChromeDriver();
        }

        baseUrl = properties.getProperty("app.url");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);

    }

    @AfterClass
    public static void tearDown() throws Exception {
        driver.quit();
    }
    protected boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    protected void fillField(By locator, String value) {
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(value);
    }

    protected void checkFillField(String value, By locator) {
        assertEquals(value, driver.findElement(locator).getAttribute("value"));
    }


}