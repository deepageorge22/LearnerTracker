package org.ictak.learnerPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LearnerCSVFile_Page {
	
	WebDriver driver;
	private WebElement username;
	private WebElement password;
		
	public LearnerCSVFile_Page(WebDriver driver)

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
	
	public void learnerButtonClick()
	{
		
		driver.findElement(By.linkText("Learners")).click();  
		
	}
	
	//***********ADMIN CSV FILE UPLOAD**********//
	
			public void adminUpload_ButtonClick()
			{
				
				driver.findElement(By.xpath("//a[@href='/upload']")).click();
				
			}
	    

			public void adminUpload_ChooseFilebrowser()
			{
				
				WebElement uploadcsv=driver.findElement(By.xpath("//input[@name='file' and @accept='.csv']"));
				uploadcsv.sendKeys(System.getProperty("user.dir")+"/src/main/resources/LearnersSample.csv");
				
			}
			
			public void uploadLearner_SubmitButtonClick()
			{
				
				driver.findElement(By.xpath("//button[@class='ui grey mini button']")).click();	
				
				
			}
			
			public void uploadLearner_SubmitButtonPopup()

			{
				
			driver.findElement(By.xpath("//button[normalize-space()='Return to Dashboard']")).click();//button[@class="btn btn-success w-100"]
			
			}
			
			public void uploadLearner_SaveButtonPopup()

			{
				driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
				
			}
			
			
			//***********TRAINER CSV FILE UPLOAD**********//
			
			public void trainerUpload_ButtonClick()
			{
				
				driver.findElement(By.xpath("//a[@href='/upload']")).click();
				
			}
	    

			public void trainerUpload_ChooseFilebrowser()
			{
				
				WebElement uploadcsv=driver.findElement(By.xpath("//input[@name='file' and @accept='.csv']"));
				uploadcsv.sendKeys(System.getProperty("user.dir")+"/src/main/resources/LearnersSample.csv");
				
			}
			
			public void uploadTLearner_SubmitButtonClick() {
				
				driver.findElement(By.xpath("//button[@class='ui grey mini button']")).click();	
								
			}
			
			public void uploadTLearner_SubmitButtonPopup()

			{
				
			driver.findElement(By.xpath("//button[normalize-space()='Return to Dashboard']")).click();//button[@class="btn btn-success w-100"]
			
			}
			
			public void uploadTLearner_SaveButtonPopup()

			{
				driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
				
			}
			
		
	//***********ADMIN_DOWNLOAD CSV FILE **********//	
	
	
			public void adminUpload1_ButtonClick()
				{
					
					driver.findElement(By.xpath("//a[@href='/upload']")).click();
					
				}
				
				public void download_adminLearner_link() 
				{
					
					driver.findElement(By.xpath("//a[normalize-space()='Click here to download a sample csv file']")).click();	
									
				}
	

			//***********TRAINER_DOWNLOAD CSV FILE **********//	
			
			public void trainerUpload1_ButtonClick()
			{
				
				driver.findElement(By.xpath("//a[@href='/upload']")).click();
				
			}
			
			public void download_TLearner_link() {
				
				driver.findElement(By.xpath("//a[normalize-space()='Click here to download a sample csv file']")).click();	
								
			}
			
			//***********ADMIN_UPLOAD CANCEL BUTTON**********//
			
			public void adminUpload_Button()
			{
				
				driver.findElement(By.xpath("//a[@href='/upload']")).click();
				
			}	
			
			public void adminUpload_cancelButton()
			{
				
				driver.findElement(By.xpath("//button[@class='ui mini button']")).click();
				
			}	
			
//***********TRAINER_UPLOAD CANCEL BUTTON**********//
			
			public void trainerUpload_Button()
			{
				
				driver.findElement(By.xpath("//a[@href='/upload']")).click();
				
			}	
			
			public void trainerUpload_cancelButton()
			{
				
				driver.findElement(By.xpath("//button[@class='ui mini button']")).click();
				
			}	
}
