package org.testing.testcases;
 
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.POM.Login;
import org.testing.Utilities.Logs;
import org.testing.Utilities.Screenshots;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.Base;


public class TC1 extends Base{
	
	@Test
	public void Login_TrendingClick() throws InterruptedException, IOException
	  {
			  
			WebElement login =driver.findElement(By.xpath(pr.getProperty("login"))); 
			//WebElement login =driver.findElement(By.id("button"));
			  login.click();
			  Thread.sleep(2000);
			 
			  Login l=new Login(driver,pr);   //Create the class Login objectszxf
			  l.signin("nainsitest121@gmail.com", "Hbss2004");  //method call
			  
			  WebElement Trending = driver.findElement(By.xpath(pr.getProperty("Trending")));
			  Trending.click();
			  Thread.sleep(5000);
			  Screenshots.takeScreenshots(driver , "D:\\Automation\\Selenium_Workspace\\YTFramwork\\Screenshots\\Trending.jpeg");
			System.out.println("Test");
	  Logs.Takelog("TC1", "Trending clicked successfully");
  }

}
 