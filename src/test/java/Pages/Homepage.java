package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseDriver.AppDriver;

public class Homepage  extends AppDriver 
{
      public Homepage()
      {
    	  PageFactory.initElements(driver, this);
      }
      
      @FindBy(xpath = "//*[@id='menu-item-48']/a")  WebElement contactus;
      
      
      public void contactusclick() throws InterruptedException
      {
    	  try
    	  {
    		  contactus.click();
    		  Thread.sleep(3000);
    	  }
    	  catch(Exception e)
    	  {
    		driver.navigate().to("http://xapdigital.com/contact-us/");  
    		Thread.sleep(3000);
    	  }
    	  log.info("Contact Us page opened");
      }
}
