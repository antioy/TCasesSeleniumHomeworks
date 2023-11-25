package homework10Helpers;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.WebDriver;


import java.util.HashMap;
import java.util.Map;

public class BrowserFactory {

    public static WebDriver driver;
    public static WebDriver getDriver ()

    {
        String browser = "edge";
        if (browser.equalsIgnoreCase("chrome")) {
            System.out.println("Executing  on Chrome");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.get("https://www.saucedemo.com/");
        } else if (browser.equalsIgnoreCase("edge")) {
            System.out.println("Executing  on Edge");
            WebDriverManager.chromedriver().setup();
            driver = new EdgeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.get("https://www.saucedemo.com/");
        }

        return driver;

    }

    public static void quitDriver() {
        if (driver!=null) {
            driver.quit();
            driver = null;
        }
    }
}

