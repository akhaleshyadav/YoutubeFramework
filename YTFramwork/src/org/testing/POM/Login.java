package org.testing.POM;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login  {
   ChromeDriver driver;
   Properties pr;
   public Login(ChromeDriver driver, Properties pr)
   {
	   this.driver=driver;
	   this.pr=pr;
   }

public void signin(String user, String pwd) throws InterruptedException
   {
	   WebElement Username=driver.findElement(By.xpath(pr.getProperty("Username")));
		  Username.sendKeys(user); 
		  WebElement Nxt=driver.findElement(By.xpath(pr.getProperty("Next")));
		  Nxt.click(); 
		  Thread.sleep(2000);
		  WebElement Pwd=driver.findElement(By.name(pr.getProperty("Pwd")));
		  Pwd.sendKeys(pwd);
		  Thread.sleep(2000);
		  WebElement Nxt2=driver.findElement(By.xpath(pr.getProperty("Next2")));
		  Nxt2.click();
		  Thread.sleep(5000); 
   }
   
}
