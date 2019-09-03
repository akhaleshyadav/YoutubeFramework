package org.testing.testcases;
 
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.POM.Login;
import org.testing.Utilities.Screenshots;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Base;

public class TC3 extends Base{

	@Test
  public void Login_VideoPlay() throws InterruptedException, IOException
  {
	WebElement login =driver.findElement(By.xpath("//paper-button[@aria-label='Sign in']")); 
		//WebElement login =driver.findElement(By.id("button"));
		  login.click();
		  Thread.sleep(2000);
		 
		  Login l=new Login(driver,pr);   //login method call 
		  l.signin("nainsitest121@gmail.com", "Hbss2004");
		  
		  Thread.sleep(5000);
		  WebElement video1=driver.findElement(By.id("img"));
		  String vdo=video1.getAttribute("src");
		  System.out.println(vdo);
		  video1.click();
		  Screenshots.takeScreenshots(driver , "D:\\Automation\\Selenium_Workspace\\YTFramwork\\Screenshots\\VideoPlay.jpeg");			  
		 		 		 
		  Thread.sleep(10000);
		  
		System.out.println("Test");
   }

}
