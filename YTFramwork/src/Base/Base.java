package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	public ChromeDriver driver;
	public Properties pr;
	@BeforeMethod
  public void BrowserLaunch() throws InterruptedException, IOException 
  {
		File f=new File("D:\\Automation\\Selenium_Workspace\\YTFramwork\\src\\Base\\ObjectRepository.properties");
		FileInputStream fi=new FileInputStream(f);
		 pr=new Properties();
		 pr.load(fi);
		
		  System.setProperty("webdriver.chrome.driver","D:\\Tools\\CompleteSeleniumSetUp_win64bit\\chromedriver_win32 (1)\\chromedriver.exe"); 
		  
		  driver=new  ChromeDriver(); 
		  
		  driver.manage().window().maximize();
		  Thread.sleep(4000);
		  driver.get("https://www.youtube.com");
		 
		System.out.println("BeforeTest");
		Thread.sleep(8000);
  }
	 @AfterMethod
		public void BrowserClose()
		{
			
			 String St=driver.getCurrentUrl();
			 System.out.println(St);
			driver.close();
			System.out.println("AfterMethod");
}
}
