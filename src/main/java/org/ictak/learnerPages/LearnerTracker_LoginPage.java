package org.ictak.learnerPages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;

public class LearnerTracker_LoginPage {
	
	WebDriver driver;
	private WebElement username;
	private WebElement password;
		
	private WebElement addname;
	private WebElement addemail;
	private WebElement addusername;
	private WebElement addpassword;
	
	private WebElement addLid;
	private WebElement addLname;
		
	public LearnerTracker_LoginPage(WebDriver driver)

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
		
		return(driver.findElement(By.xpath("//a[@class='navbar-brand']")).getText());
		
	}
	
	
	//***********ADD USER SECTION**********//
	
		public void AddUserButtonClick()
		{
			
			driver.findElement(By.xpath("//button[@class='mb-3 btn btn-success']")).click();
		}
		
		public void setaddName(String name)
		{
		addname=driver.findElement(By.id("name"));
		addname.sendKeys(name);
		}

		public void setaddEmail(String email)
		{
		addemail=driver.findElement(By.id("email"));
		addemail.sendKeys(email);
		}
		
		public void addUsername(String User1)
		{
		addusername=driver.findElement(By.id("username"));
		addusername.sendKeys(User1);
		}

		public void addPassword(String Password1)
		{
		addpassword=driver.findElement(By.id("password"));
		addpassword.sendKeys(Password1);

		}
		   
		public void clickDropdownRole()
		 {
		   driver.findElement(By.xpath("//select[@class='form-select required']")).click();
		 
		 }
		   	   
		 public void clickDropdown()
		 {
			 WebElement role=driver.findElement(By.name("roleInputs"));
			 Select select=new Select(role);
			 select.selectByVisibleText("Admin");
			 
		 } 
		
		 public void adduserSubmitButton()

			{
			driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
			
			}
		 public void adduserPostButton() throws InterruptedException

			{
			driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']")).click();//button[@class="btn btn-success w-100"]
			Thread.sleep(1000);
			
			}
		 
		 
		 //*******ADD LEARNERS SECTION*****///
		 
		 public void AddLearnerButtonClick()
			{
				
				driver.findElement(By.xpath("//button[@class='mb-3 btn btn-success']")).click();
			}
			
			public void setaddLearnerid(String Lid)
			{
			addLid=driver.findElement(By.id("learnerid"));
			addLid.sendKeys(Lid);
			}

			public void setaddLearnername(String Learnername)
			{
			addLname=driver.findElement(By.id("name"));
			addLname.sendKeys(Learnername);
			}
			
			public void DropdownCourse()
			{
				driver.findElement(By.xpath("//select[@class='form-select required']")).click();
				
			}
			
			 public void Cdropdown()
			 {
				 WebElement course=driver.findElement(By.name("course"));
				 Select select=new Select(course);
				 select.selectByVisibleText("ST");
				 
			 } 
			 
			 public void DropdownProject()
				{
					driver.findElement(By.xpath("//select[@class='form-select required']")).click();
					
				}
				
				public void Pdropdown()
				{
					 WebElement clickproject=driver.findElement(By.name("project"));
					 Select select=new Select(clickproject);
					 select.selectByVisibleText("ICTAK");
					
				}
				   	   
				 public void DropdownBatch()
				 {
					 driver.findElement(By.xpath("//select[@class='form-select required']")).click();
					 
				 } 
				 public void Bdropdown()
				 {
					 WebElement clickbatch=driver.findElement(By.name("batch"));
					 Select select=new Select(clickbatch);
					 select.selectByVisibleText("Mar_23");
					 
				 }
				 
				 public void DropdownCoursestatus()
				 {
					 driver.findElement(By.xpath("//select[@class='form-select required']")).click();
					 
				 }
				 
				 public void Cstatusdropdown()
				 {
					 WebElement clickcstatus=driver.findElement(By.name("cstatus"));
					 Select select=new Select(clickcstatus);
					 select.selectByVisibleText("Qualified");
					 //driver.findElement(By.xpath("//option[@value='Qualified']")).click();
					 
				 } 
				
				 public void addLearnerSubmitButton() throws InterruptedException

					{
					driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
					Thread.sleep(500);
					
					}
				 
				 public void addLearnerPostButton() throws InterruptedException

					{
					driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']")).click();//button[@class="btn btn-success w-100"]
					Thread.sleep(500);
					
					}
				 
			
}



