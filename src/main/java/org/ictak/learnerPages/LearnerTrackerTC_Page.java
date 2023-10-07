package org.ictak.learnerPages;

//import java.io.IOException;
//import org.ictak.learnerConstants.LTAutomationConstants;
//import org.ictak.learnerUtilities.LearnerTrackerExcelUtility;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import org.openqa.selenium.support.ui.Select;

public class LearnerTrackerTC_Page {
	
	WebDriver driver;
	private WebElement username;
	private WebElement password;
	
	public LearnerTrackerTC_Page(WebDriver driver)

	{
	this.driver=driver;
	
	}
	
	//*****LOGIN SECTION*****//
	
		public void loginUser(String User)
		{
		username=driver.findElement(By.id("username"));
		username.sendKeys(User);
		}

		public void loginPassword(String Pass)
		{
		password=driver.findElement(By.id("password"));
		password.sendKeys(Pass);

		}
		public void LoginbuttonClick()

		{
			
		driver.findElement(By.xpath("//button[@class='btn btn-success w-100']")).click();//button[@class="btn btn-success w-100"]
		
		}

		public String getloginError()
		{
			
			return(driver.findElement(By.xpath("//div[@class='fade alert alert-danger alert-dismissible show']")).getText());
						
		}
		
		public String getLogotext()
		{
			
			//nav[@class="sc-uVWWZ iCVXfv pro-menu"]
			//return(driver.findElement(By.xpath("//nav[@class='sc-uVWWZ iCVXfv pro-menu']"))).getText();
			return(driver.findElement(By.xpath("//a[@class='navbar-brand']")).getText());
			
		}
		
		
			////////////////ADMIN_DASHBOARD BUTTON/////////
		
			public void AddUser_ButtonClick()
				{
	
					driver.findElement(By.xpath("//button[@class='mb-3 btn btn-success']")).click();
				}

			public void AddUser_DashboardButtonClick()
				{
					//button[@class='btn btn-warning']
					driver.findElement(By.xpath("//button[@class='btn btn-warning']")).click();
				}

		
			//////////////// TRAINER_DASHBOARD BUTTON/////////
		
		public void AddlearnerButtonClick()
		{
			
			driver.findElement(By.xpath("//button[@class='mb-3 btn btn-success']")).click();
		}
		
		public void Addlearner_DashboardButtonClick()
		{
			//button[@class='btn btn-warning']
			driver.findElement(By.xpath("//button[@class='btn btn-warning']")).click();
		}
		
				
		
		/////////////ADMIN LOGOUT ACTION//////////////
		
		public void logout_AdmindropdownbuttonClick()
		{
			
			driver.findElement(By.xpath("//a[@id='basic-nav-dropdown']")).click();
			
		}
				 
	 public void logout_Admindropdown() throws InterruptedException
	 
		{
			
		 	driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
		 	
		} 
			 
	public void logout_AdminButtonClick() throws InterruptedException

		{
			driver.findElement(By.xpath("//body/div[@id='root']/div[@class='App']/div[1]")).getText();
			Thread.sleep(2000);
										
		}
		
		
		/////////////TRAINING HEAD LOGOUT ACTION//////////////
		
		public void logout_trainerdropdownbuttonClick()
		{
			
			driver.findElement(By.xpath("//a[@id='basic-nav-dropdown']")).click();
			
		}
				 
	 public void setTlogoutdropdown() throws InterruptedException
	 
		{
			
		 	driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
		 	
		} 
			 
	public void trainerlogoutButtonClick() throws InterruptedException

		{
			driver.findElement(By.xpath("//body/div[@id='root']/div[@class='App']/div[1]")).getText();
			Thread.sleep(2000);
										
		}
		
/////////////PLACEMENT OFFICER LOGOUT ACTION//////////////
	
public void logout_pofficerdropdownbuttonClick()
{
	
	driver.findElement(By.xpath("//a[@id='basic-nav-dropdown']")).click();
	
}
		 
public void logout_pofficerdropdown() throws InterruptedException

{
	
 	driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
 	
} 
	 
public void logout_pofficerButtonClick() throws InterruptedException

{
	driver.findElement(By.xpath("//body/div[@id='root']/div[@class='App']/div[1]")).getText();
	Thread.sleep(2000);
								
}	
	
		
}
