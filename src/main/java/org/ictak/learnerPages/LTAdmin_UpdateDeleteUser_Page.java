package org.ictak.learnerPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Select;

public class LTAdmin_UpdateDeleteUser_Page {

	WebDriver driver;
	private WebElement username;
	private WebElement password;
	
	private WebElement addname;
	//private WebElement addemail;
	//private WebElement addusername;
	private WebElement addpassword;
	
	public LTAdmin_UpdateDeleteUser_Page(WebDriver driver)

	{
	this.driver=driver;
	
	}
	
	//*****ADMIN_LOGIN SECTION*****//
	
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
			
			return(driver.findElement(By.xpath("//a[@class='navbar-brand']")).getText());
			
		}
		
		
		/////ADMIN_UPDATE_USER/////
		
		public void editUserButtonClick()
		{
			
			driver.findElement(By.xpath("(//button[@class='btn btn-success btn btn-primary'])[2]")).click();
		}
		
		public void editName(String name)
		{
			
		addname=driver.findElement(By.id("name"));
		addname.clear();
		addname.sendKeys("Manu manu");
		
		}
			
		public void editPassword(String Password1)
		{
		addpassword=driver.findElement(By.id("password"));
		addpassword.clear();
		addpassword.sendKeys("manu@0011");

		}
		   
		public void edituser_SubmitButton()

			{
			
			driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();//button[@class="btn btn-success w-100"]
			
			}
		
		public void adminedit_user() throws InterruptedException
		 {
			 
			driver.findElement(By.xpath("//tbody/tr[2]/td[7]")).getText();
			 //driver.findElement(By.xpath("//tbody/tr[3]/td[8]")).getText();
		 }
		 
		
		/////////////////////////ADMIN_DELETE_USER//////////////////////////////
		
			public void deleteUserButtonClick()
			{
				
				driver.findElement(By.xpath("(//button[@class='btn btn-danger btn btn-primary'])[4]")).click();
			}
		
			public void admindelete_user() throws InterruptedException
			 {
				
				driver.findElement(By.xpath("//tbody/tr[4]/td[7]")).getText();
				 
			 }
			 
		
		
		
		
		
		
		
		
}
