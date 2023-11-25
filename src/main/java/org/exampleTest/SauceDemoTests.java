package org.exampleTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.ExpectedConditions;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.bouncycastle.cms.RecipientId.password;


public class SauceDemoTests {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/tsank/Downloads/chromedriver-win32/chromedriver-win32");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("userName");

        driver.findElement(By.id("password")).sendKeys("password");
        Thread.sleep(1000);
        driver.findElement(By.id("login-button")).click();


     }

  }


