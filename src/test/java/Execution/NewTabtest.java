package Execution;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTabtest 
{
	WebDriver driver;
    @BeforeTest
    public void launch() throws InterruptedException
    {
    	System.setProperty("webdriver.chrome.driver", "D:\\Software\\Selenium\\New Driver\\chrome89\\chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.navigate().to("http://www.way2testing.com");
    	Thread.sleep(3000);
    }
    @Test
    public void test() throws IOException
    {
    	System.out.println("running");
    	driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
    	driver.navigate().to("http://www.datastop.in");
    	
    }
}
