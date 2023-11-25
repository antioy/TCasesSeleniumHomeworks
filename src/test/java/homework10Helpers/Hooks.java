package homework10Helpers;
import pageObjectModel.TestCaseSelenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.junit.After;
import org.junit.Before;

public class Hooks extends BrowserFactory{



    @Before
    public void setUp() {
        BrowserFactory.getDriver();
    }


    @After
    public void tearDown() {
        BrowserFactory.quitDriver();

    }
}


