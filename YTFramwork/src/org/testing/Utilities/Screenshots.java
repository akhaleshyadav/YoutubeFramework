package org.testing.Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots {
  public static void takeScreenshots(ChromeDriver driver, String path) throws IOException
  {
	  File f= driver.getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(f, new File(path));
  }
}
