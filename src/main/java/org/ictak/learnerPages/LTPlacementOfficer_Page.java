package org.ictak.learnerPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LTPlacementOfficer_Page {

	WebDriver driver;
	private WebElement username;
	private WebElement password;
	
	public LTPlacementOfficer_Page(WebDriver driver)

	{
	this.driver=driver;
	}
	
		////*****PLACEMENTOFFICER LOGIN SECTION*****////
	
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
		
		/////////******UPDATE PLACEMENT STATUS*******///////////	 
		 
		 public void UpdatePlacementStatusbuttonClick()
			{
			//button[@class="btn btn-success btn btn-primary"]
			 
				driver.findElement(By.xpath("(//button[@class='btn btn-success btn btn-primary'])[3]")).click();
			}
					 
		 public void setPstatusdropdown() throws InterruptedException
		 
			{
				WebElement clickPstatus=driver.findElement(By.name("pstatus"));//select[@name="pstatus"]
				Select dropdown=new Select(clickPstatus);
				dropdown.selectByVisibleText("Job seeking");
				Thread.sleep(1000);
											
			} 
				
		 public void placementSubmitButtonClick() throws InterruptedException

			{
				driver.findElement(By.xpath("//button[text()='Submit']")).click();
				Thread.sleep(2000);
											
			}
		 
		 public void Pstatusdropdown() throws InterruptedException
		 {
			 
			 //driver.findElement(By.linkText("Job seeking"));
			 driver.findElement(By.xpath("//tbody/tr[3]/td[8]")).getText();
		 }
		 
		
/////////****** PLACEMENT OFFICER DASHBOARD BUTTON ACTION*******///////////	 
		 
		 public void pofficer_updateButtonClick()
			{
			 
				driver.findElement(By.xpath("(//button[@class='btn btn-success btn btn-primary'])[3]")).click();
			}
		 
		 public void pofficer_dashboardButtonClick()
			{
			 //th[normalize-space()='Placement Status']
			//a[@class='navbar-brand']
			//driver.findElement(By.xpath("(//button[@class='btn btn-warning']")).click();
			 driver.findElement(By.xpath("//button[@class='btn btn-warning']")).click();
			 
			}
		 
		 public void pofficer_placementpage()
			{
			//th[normalize-space()='Learner Id']
				driver.findElement(By.xpath("(//th[normalize-space()='Learner Id']]")).click();
			 //driver.findElement(By.linkText("Placement"));
			}
		 
}
