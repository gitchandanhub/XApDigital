package Execution;

import org.testng.annotations.Test;

import BaseDriver.AppDriver;
import Pages.ContactUs;
import Pages.Homepage;

public class ExecuteTest extends AppDriver
{
   @Test
   public void verifyContactus() throws InterruptedException
   {
	   Homepage hpobj = new Homepage();
	   hpobj.contactusclick();
	   System.out.println("Contact us page opened");
	   ContactUs cuobj = new ContactUs();
	   cuobj.Enterfname("Chandan");
	   
	   cuobj.EnterLname("Singh");
	   cuobj.EnterEmail("schandan.pisoftek@gmail.com");
	   cuobj.EnterCompanyName("PI SOftek");
	   cuobj.EnterPhonenumber("7835950528");
	   cuobj.SelectCountry("India");
	   cuobj.EnterSubject("This is for testing purpose only");
	   cuobj.SelectInquiryType("Partner Interest");
	   cuobj.EnterMessage("This is my test for message");
	   cuobj.Clickcheckbox();
	   cuobj.clicksend();
   }
}
