package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseDriver.AppDriver;

public class ContactUs extends AppDriver
{
      public ContactUs()
      {
    	  PageFactory.initElements(driver, this);
      }
      
      @FindBy(xpath = "//input[@name='your-name']")  WebElement Firstname;
      @FindBy(xpath = "//input[@name='last-name']")  WebElement lastname; 
      @FindBy(xpath = "//input[@name='your-email']")  WebElement Emails;
      @FindBy(xpath = "//input[@name='your-campany']")  WebElement Company_name;
      @FindBy(xpath = "//input[@name='your-subject']")  WebElement subject; 
      @FindBy(xpath = "//input[@name='tel-802']")  WebElement phonenumber;
      @FindBy(xpath = "//select[@name='country']")  WebElement country; 
      @FindBy(xpath = "//select[@name='menu-302']")  WebElement inquirytype;
      @FindBy(xpath = "//textarea[@name='your-message']")  WebElement message; 
      @FindBy(xpath = "//input[@name='checkbox-528[]")  WebElement checkbx1;
      @FindBy(xpath = "//*[@id='wpcf7-f79-p30-o1']/form/div[7]/div/span[1]/span/span/input")  WebElement checkbx;
      @FindBy(xpath = "//input[@class='wpcf7-form-control wpcf7-submit']")  WebElement sendbtn;
      
      public void Enterfname(String name) throws InterruptedException
      {
    	  Firstname.clear();
    	  Firstname.sendKeys(name);
    	  log.info("First Name Entered");
    	  System.out.println("First Name Entered");
    	  Thread.sleep(1000);
      }
      public void EnterLname(String lname) throws InterruptedException
      {
    	  lastname.clear();
    	  lastname.sendKeys(lname);
    	  log.info("Last Name Entered");
    	  System.out.println("Last Name Entered");
    	  Thread.sleep(1000);
      }
      public void EnterEmail(String emails) throws InterruptedException
      {
    	  Emails.clear();
    	  Emails.sendKeys(emails);
    	  log.info("Emails has been Entered");
    	  System.out.println("Emails has been Entered");
    	  Thread.sleep(1000);
      }
      public void EnterCompanyName(String Companyname) throws InterruptedException
      {
    	  Company_name.clear();
    	  Company_name.sendKeys(Companyname);
    	  log.info("Company name has been Entered");
    	  System.out.println("Company name has been Entered");
    	  Thread.sleep(1000);
      }
      public void EnterSubject(String Sbj) throws InterruptedException
      {
    	  subject.clear();
    	  subject.sendKeys(Sbj);
    	  log.info("Subject has been Entered");
    	  System.out.println("Subject has been Entered");
    	  Thread.sleep(1000);
      }
      public void EnterPhonenumber(String number) throws InterruptedException
      {
    	  phonenumber.clear();
    	  phonenumber.sendKeys(number);
    	  log.info("phonenumber has been Entered");
    	  System.out.println("phonenumber has been Entered");
    	  Thread.sleep(1000);
      }
      public void EnterMessage(String msg) throws InterruptedException
      {
    	  message.clear();
    	  message.sendKeys(msg);
    	  log.info("msg has been Entered");
    	  System.out.println("msg has been Entered");
    	  Thread.sleep(1000);
      }
      public void Clickcheckbox() throws InterruptedException
      {
    	  try
    	  {
    	  checkbx.click();
    	  Thread.sleep(1000);
    	  }
    	  catch(Exception e)
    	  {
    		  checkbx1.click();
        	  Thread.sleep(1000);
    	  }
    	  log.info("Check box clicked");
    	  System.out.println("Check box clicked");
      }
      public void SelectCountry(String countryname) throws InterruptedException
      {
    	  country.click();
    	  Thread.sleep(2000);
    	  List<WebElement> list = driver.findElements(By.xpath("//*[@id='wpcf7-f79-p30-o1']/form/div[4]/div[2]/div/label/span/select/option"));
    	  for(int i =1; i<list.size()+1; i++)
    	  {
    		  String text = driver.findElement(By.xpath("//*[@id='wpcf7-f79-p30-o1']/form/div[4]/div[2]/div/label/span/select/option["+i+"]")).getText();
   	          if(text.equalsIgnoreCase(countryname))
   	          {
   	        	driver.findElement(By.xpath("//*[@id='wpcf7-f79-p30-o1']/form/div[4]/div[2]/div/label/span/select/option["+i+"]")).click();
   	          }
    	  }
    	  log.info("Country is selected");
    	  System.out.println("Country is selected");
      }
      public void SelectInquiryType(String Inquiry) throws InterruptedException
      {
    	  inquirytype.click();
    	  Thread.sleep(2000);
    	  List<WebElement> list = driver.findElements(By.xpath("//*[@id='wpcf7-f79-p30-o1']/form/div[5]/div[2]/div/label/span/select/option"));
    	  for(int i =1; i<list.size()+1; i++)
    	  {
    		  String text = driver.findElement(By.xpath("//*[@id='wpcf7-f79-p30-o1']/form/div[5]/div[2]/div/label/span/select/option["+i+"]")).getText();
   	          if(text.equalsIgnoreCase(Inquiry))
   	          {
   	        	driver.findElement(By.xpath("//*[@id='wpcf7-f79-p30-o1']/form/div[5]/div[2]/div/label/span/select/option["+i+"]")).click();
   	          }
    	  }
    	  log.info("Inquiry is selected");
    	  System.out.println("Inquiry is selected");
      } 
    	 
      public void clicksend() throws InterruptedException
    	  {
    		  sendbtn.click();
    		  log.info("Send button is clicked");
    		  System.out.println("Send button is clicked");
    		  Thread.sleep(2000);
    		  try
    		  {
    		  String msg = driver.findElement(By.xpath("//*[@id='wpcf7-f79-p30-o1']/form/div[9]")).getText();
    		  System.out.println(msg);
    		  }
    		  catch(Exception e)
    		  {
    			 try
    			 {
    				 System.out.println(e);
    			  String msg = driver.findElement(By.className("wpcf7-response-output wpcf7-display-none wpcf7-mail-sent-ng")).getText();
        		  System.out.println(msg);
    			 }
    			 catch(Exception e2)
    			 {
    				 System.out.println(e);
    				 String msg = driver.findElement(By.xpath("//div[@class='wpcf7-response-output wpcf7-display-none wpcf7-spam-blocked']")).getText();
    				 System.out.println(msg);
    			 }
    		  }
    	  }
      
}
