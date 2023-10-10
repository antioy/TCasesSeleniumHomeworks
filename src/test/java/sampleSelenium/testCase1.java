package sampleSelenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testCase1 {

    public static void main(String[] args) {


<<<<<<< HEAD
        System.setProperty(("webdriver.chrome.driver", "C:\\Users\\tsank\\Downloads\\driversChrome" );
=======
        System.setProperty(("webdriver.chrome.driver"), "C:\\Users\\tsank\\Downloads\\driversChrome" );
>>>>>>> 5945d7f (Initial commit)
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.edna.bg/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@name='Стани автор']")).click();
        driver.findElement(By.xpath("//input[@name='search']")).sendKeys("блабла");
        WebElement elem1 = driver.findElement(By.linkText("Най-нови"));
        elem1.click();

    }
}



