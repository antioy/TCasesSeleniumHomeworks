package sampleSelenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testCaseSelenium {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tsank\\IntelliJ IDEA Community Edition 2023.1.2\\TCasesSelenium\\src\\test\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.edna.bg/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@name='Стани автор']")).click();
        driver.findElement(By.xpath("//input[@name='search']")).sendKeys("блабла");
        WebElement elem1 = driver.findElement(By.linkText("Най-нови"));
        elem1.click();

    }
}



