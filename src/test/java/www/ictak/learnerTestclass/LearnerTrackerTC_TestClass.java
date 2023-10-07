package www.ictak.learnerTestclass;

import java.io.IOException;
import org.ictak.learnerBaseclass.LearnerTrackerBaseClass;
import org.ictak.learnerConstants.LTAutomationConstants;
import org.ictak.learnerPages.LearnerTrackerTC_Page;
import org.ictak.learnerUtilities.LearnerTrackerExcelUtility;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LearnerTrackerTC_TestClass extends LearnerTrackerBaseClass{
	
	LearnerTrackerTC_Page adminhomeTC;
	LearnerTrackerTC_Page trainerhomeTC;
	LearnerTrackerTC_Page placementhomeTC;
	
	LearnerTrackerTC_Page adminlogoutTC;
	LearnerTrackerTC_Page trainerlogoutTC;
	LearnerTrackerTC_Page pofficerlogoutTC;
	

	///*****ADMIN ACTIONS******///
	
			//CHECK WHETHER ADMIN LOGIN INTO ADMIN HOME PAGE
		 
	   @Test(priority=1)
	     public void admin1_ValidLogin() throws IOException, InterruptedException
	    {
	    	
			adminhomeTC=new LearnerTrackerTC_Page(driver);
	        
	        String username=LearnerTrackerExcelUtility.getCellData(0, 0);
	        String password=LearnerTrackerExcelUtility.getCellData(0, 1);
	        
	        adminhomeTC.loginUser(username);
	        adminhomeTC.loginPassword(password);
	        adminhomeTC.LoginbuttonClick();
	        Thread.sleep(2000);	
	        adminhomeTC.getLogotext();
	        Thread.sleep(1000);	
	        	        
	        String actualMsg=driver.findElement(By.xpath("//span[@class='item-content']")).getText();
			System.out.println(actualMsg);
			String expectedMsg=LTAutomationConstants.actualMsg;
			Assert.assertEquals(actualMsg,expectedMsg);
			
	    }
	    
	    
	  ////////CHECK TRAINING_HEAD LOGIN INTO TRAINER HOME SECTION////////
	     
	     @Test(priority=2)
	     public void verifyValidTrainerLogin() throws IOException, InterruptedException
	    {
	        trainerhomeTC=new LearnerTrackerTC_Page(driver);
	        
	        String username=LearnerTrackerExcelUtility.getCellData(1, 0);
	        String password=LearnerTrackerExcelUtility.getCellData(1, 1);
	        
	        trainerhomeTC.loginUser(username);
	        trainerhomeTC.loginPassword(password);
	        trainerhomeTC.LoginbuttonClick();
	        trainerhomeTC.getLogotext();
	        Thread.sleep(1000);	
	        
	        String actualResult=driver.findElement(By.xpath("//span[@class='item-content']")).getText();
			System.out.println(actualResult);
			String expectedResult=LTAutomationConstants.actualResult;
			Assert.assertEquals(actualResult,expectedResult);
	        
	    }
	     
		   ///*****PLACEMENT OFFICER ACTIONS******///
	     
	     //CHECK PLACEMENT OFFICER LOGIN INTO PLACEMENT HOME PAGE
	     
	     @Test(priority=3)
	     public void verifyValidPofficerLogin() throws IOException, InterruptedException
	    {
	    	 placementhomeTC=new LearnerTrackerTC_Page(driver);
	        
	        String username=LearnerTrackerExcelUtility.getCellData(2, 0);
	        String password=LearnerTrackerExcelUtility.getCellData(2, 1);
	        
	        placementhomeTC.loginUser(username);
	        placementhomeTC.loginPassword(password);
	        placementhomeTC.LoginbuttonClick();
	        placementhomeTC.getLogotext();
	        Thread.sleep(1000);	
	        
	        String correctResult=driver.findElement(By.xpath("//span[@class='item-content']")).getText();
			System.out.println(correctResult);
			String expectedResult1=LTAutomationConstants.correctResult;
			Assert.assertEquals(correctResult,expectedResult1);
	        
	    }
	     
	     
	     //////CHECK ADMIN LOGOUT ACTION////////
	     
	////////CHECK ADMIN LOGIN AND LOGOUT////////
	     
	     @Test(priority=4)
			     
		  public void adminlogin() throws IOException, InterruptedException
		     {
		    	 adminlogoutTC=new LearnerTrackerTC_Page(driver);
		    	 
		    	 	String username=LearnerTrackerExcelUtility.getCellData(0, 0);
			        String password=LearnerTrackerExcelUtility.getCellData(0, 1);
			        
			        adminlogoutTC.loginUser(username);
			        adminlogoutTC.loginPassword(password);
			        adminlogoutTC.LoginbuttonClick();
			        Thread.sleep(1000);	
			        
			        adminlogoutTC.logout_AdmindropdownbuttonClick();
			        adminlogoutTC.logout_Admindropdown();
			        Thread.sleep(3000);	
			        adminlogoutTC.logout_AdminButtonClick();
			        
			        String logout_actualResult=driver.findElement(By.xpath("//p[@class='fw-light fs-3']")).getText();
			        System.out.println(logout_actualResult);
					String logout_expectedResult=LTAutomationConstants.logout_actualResult;
					Assert.assertEquals(logout_actualResult,logout_expectedResult);
					
		     }
	     
	     
	     
	     //////CHECK TRAINER LOGOUT ACTION////////
	     
	////////CHECK TRAINER LOGIN AND LOGOUT////////
	     
	     @Test(priority=5)
			     
		  public void trainerlogin() throws IOException, InterruptedException
		     {
		    	 trainerlogoutTC=new LearnerTrackerTC_Page(driver);
		    	 
		    	 	String username=LearnerTrackerExcelUtility.getCellData(1, 0);
			        String password=LearnerTrackerExcelUtility.getCellData(1, 1);
			        
			        trainerlogoutTC.loginUser(username);
			        trainerlogoutTC.loginPassword(password);
			        trainerlogoutTC.LoginbuttonClick();
			        //trainerlogoutTC.getLogotext();
			        Thread.sleep(1000);	
			        
			        trainerlogoutTC.logout_trainerdropdownbuttonClick();
			        trainerlogoutTC.setTlogoutdropdown();
			        Thread.sleep(3000);	
			        trainerlogoutTC.trainerlogoutButtonClick();
			        
			        String logout_actualResult=driver.findElement(By.xpath("//p[@class='fw-light fs-3']")).getText();
			        System.out.println(logout_actualResult);
					String logout_expectedResult=LTAutomationConstants.logout_actualResult;
					Assert.assertEquals(logout_actualResult,logout_expectedResult);
					
		     }

	     
	     /// //////CHECK PLACEMENT OFFICER LOGOUT ACTION////////
	     
	////////CHECK PLACEMENTOFFICER LOGIN AND LOGOUT////////
	     
	     @Test(priority=6)
			     
		  public void placementofficerlogin() throws IOException, InterruptedException
		     {
		    	 pofficerlogoutTC=new LearnerTrackerTC_Page(driver);
		    	 
		    	 	String username=LearnerTrackerExcelUtility.getCellData(2, 0);
			        String password=LearnerTrackerExcelUtility.getCellData(2, 1);
			        
			        pofficerlogoutTC.loginUser(username);
			        pofficerlogoutTC.loginPassword(password);
			        pofficerlogoutTC.LoginbuttonClick();
			        //pofficerlogoutTC.getLogotext();
			        Thread.sleep(1000);	
			        
			        pofficerlogoutTC.logout_trainerdropdownbuttonClick();
			        pofficerlogoutTC.setTlogoutdropdown();
			        Thread.sleep(3000);	
			        pofficerlogoutTC.trainerlogoutButtonClick();
			        
			        String logout_actualResult=driver.findElement(By.xpath("//p[@class='fw-light fs-3']")).getText();
			        System.out.println(logout_actualResult);
					String logout_expectedResult=LTAutomationConstants.logout_actualResult;
					Assert.assertEquals(logout_actualResult,logout_expectedResult);
					
		     }
	     
	     
	////////CHECK ADMIN LOGIN AND CHECK DASHBOARD BUTTON////////
	     
	     	@Test(priority=7)
						     
			 public void admin_dashboardbutton() throws IOException, InterruptedException
					  {
				    	 
				    	 	adminhomeTC=new LearnerTrackerTC_Page(driver);
					    	 
					    	 String username=LearnerTrackerExcelUtility.getCellData(0, 0);
						     String password=LearnerTrackerExcelUtility.getCellData(0, 1);
						        
						     adminhomeTC.loginUser(username);
						     adminhomeTC.loginPassword(password);
						     adminhomeTC.LoginbuttonClick();
						     adminhomeTC.getLogotext();
						     Thread.sleep(1000);	
						        
						     adminhomeTC.AddUser_ButtonClick();
						     adminhomeTC.AddUser_DashboardButtonClick();
						     Thread.sleep(3000);	
						      
						     String admindashboard_actualResult=driver.findElement(By.xpath("//span[@class='item-content']")).getText();
						     System.out.println(admindashboard_actualResult);
						     String expectedResult1=LTAutomationConstants.admindashboard_actualResult;
						     Assert.assertEquals(admindashboard_actualResult,expectedResult1);
								
					     }
			    
	     	
	////////CHECK TRAINER LOGIN AND CHECK DASHBOARD BUTTON////////
	     
		     @Test(priority=8)
				     
			  public void trainer_dashboardbutton() throws IOException, InterruptedException
			     {
		    	 
		    	 		trainerhomeTC=new LearnerTrackerTC_Page(driver);
			    	 
			    	 	String username=LearnerTrackerExcelUtility.getCellData(1, 0);
				        String password=LearnerTrackerExcelUtility.getCellData(1, 1);
				        
				        trainerhomeTC.loginUser(username);
				        trainerhomeTC.loginPassword(password);
				        trainerhomeTC.LoginbuttonClick();
				        trainerhomeTC.getLogotext();
				        Thread.sleep(1000);	
				        
				        trainerhomeTC.AddlearnerButtonClick();
				        trainerhomeTC.Addlearner_DashboardButtonClick();
				        Thread.sleep(3000);	
				      
				        String tdashboard_actualResult=driver.findElement(By.xpath("//span[@class='item-content']")).getText();
				        System.out.println(tdashboard_actualResult);
						String expectedResult=LTAutomationConstants.tdashboard_actualResult;
						Assert.assertEquals(tdashboard_actualResult,expectedResult);
						
			     }
		     
		     
		
	     
}


