package org.ictak.learnerPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LTTrainer_EditDelete_Page {
	
	WebDriver driver;
	private WebElement username;
	private WebElement password;
	
	private WebElement addLid;
	private WebElement addLname;
	
	public LTTrainer_EditDelete_Page(WebDriver driver)

	{
	this.driver=driver;
	//PageFactory.initElements(driver,this);
	}
	
	
	//*****TRAINER LOGIN SECTION*****//
	
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
		
	/////******************LEARNER_EDIT ACTIONS**************/////
		
			public void editLearnerButtonClick()
			{
				//(//button[@class="btn btn-success"])[2]
				//driver.findElement(By.xpath("(//button[@class='btn btn-success btn btn-primary'])[2]")).click();
				driver.findElement(By.xpath("(//button[@class='btn btn-success'])[2]")).click();
				
			}
			
			public void editLearnerid(String learnerid)
			{
				
			addLid=driver.findElement(By.id("learnerid"));//input[@id="learnerid"]
			addLid.clear();
			addLid.sendKeys("LID01");
			
			}
			
			public void editLearnerName(String learnername)
			{
				
			addLname=driver.findElement(By.id("name"));
			addLname.clear();
			addLname.sendKeys("Chris chris");
			
			}
			
			public void editLearner_SubmitButton()

			{
			
			driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();//button[@class="btn btn-success w-100"]
			
			}
			
			public void traineredit_learner() throws InterruptedException
			 {
				//tbody/tr[2]/td[9]
				driver.findElement(By.xpath("//tbody/tr[2]/td[9]")).getText();
				 
			 }
			
			
				/////////////////////////TRAINER_DELETE ACTION//////////////////////////////
			
			public void deleteLearnerButtonClick()
				{
					
				//(//button[@class="btn btn-danger btn btn-primary"])[4]
				//tbody/tr[4]/td[9]
				//tbody/tr[4]/td[9]/button[1]
					//driver.findElement(By.xpath("(//button[@class='btn btn-danger btn btn-primary'])[4]")).click();
				driver.findElement(By.xpath("//tbody/tr[4]/td[9]/button[1]")).click();
				
				
				}
			
					
			public void trainerdelete_learner() throws InterruptedException
			 {
				//tbody/tr[2]/td[9]
				//tbody/tr[4]/td[9]
				//tbody/tr[4]/td[9]
				driver.findElement(By.xpath("//tbody/tr[4]/td[9]")).getText();
				 
			 }
			
}
