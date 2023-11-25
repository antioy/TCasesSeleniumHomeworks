package ExpectedCondition;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomeworkExpectedCondition {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tsank\\Downloads\\chromedriver-win32\\chromedriver-win32");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.saucedemo.com/");
        WebElement uname = driver.findElement(By.id("user-name")).sendKeys(driver, 10, "Your_Name");
        WebElement pname = driver.findElement(By.id("password")).sendKeys(driver, 10, "Your_Password");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public static void sendKeys(WebDriver driver1, WebElement element, int timeout, String value) {
        new WebDriverWait(driver1, timeout).until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(value);
    }

    public static void clickOn(WebDriver driver1, WebElement element, int timeout) {
        new WebDriverWait(driver1, timeout).until(ExpectedConditions.elementToBeClickable(element));// Expectedcondition for the element to be clickable
        element.click();

    }


}
