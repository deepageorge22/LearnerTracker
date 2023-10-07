package org.ictak.learnerBaseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LearnerTrackerBaseClass {
	
	public WebDriver driver;
	public static Properties properties;
	
	public void init()
	{
		driver=new ChromeDriver();
	}
   public LearnerTrackerBaseClass()
   {
	  properties = new Properties(); 
	  File file = new  File(System.getProperty("user.dir")+"/src/main/java/org/ictak/learnerConfigproperties/learnerconfig.properties");
	  try
	  {

		  FileInputStream inputStream = new FileInputStream(file);
		   properties.load(new InputStreamReader(inputStream, Charset.forName("UTF-8")));

	  } 
	  catch (FileNotFoundException File)
	  {

		   File.printStackTrace();
	  } 
	  catch (IOException next) 
	  {

		  next.printStackTrace();
	  }
 }
	  @BeforeMethod
	  
	  public void initialization() throws InterruptedException
	  {
		 String browser=properties.getProperty("browser");
		 
		 if(browser.equalsIgnoreCase("Chrome"))
		 {
			 driver=new ChromeDriver();
			 
		 }
		 
		 if(browser.equalsIgnoreCase("Edge"))
		 {
			 driver=new EdgeDriver();
			 
		 }
		 
		 if(browser.equalsIgnoreCase("Firefox"))
		 {
			 driver=new FirefoxDriver();
			 
		 }
		 
		 driver.get(properties.getProperty("url"));
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 
	  
   
   }
	  @AfterMethod
	  public void close() {
		  
		   driver.close();
	  }
	  
}
   




	
	