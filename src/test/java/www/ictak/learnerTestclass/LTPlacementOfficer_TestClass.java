package www.ictak.learnerTestclass;

import java.io.IOException;

import org.ictak.learnerBaseclass.LearnerTrackerBaseClass;
import org.ictak.learnerConstants.LTAutomationConstants;
import org.ictak.learnerPages.LTPlacementOfficer_Page;
import org.ictak.learnerUtilities.LearnerTrackerExcelUtility;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LTPlacementOfficer_TestClass extends LearnerTrackerBaseClass{
	
		LTPlacementOfficer_Page pofficer;
	
		///*****PLACEMENT OFFICER ACTIONS******///
		   
	     //PLACEMENT OFFICER VALID LOGIN SECTION
	     
	    @Test(priority=1)
	    public void verifyValidPofficerLogin() throws IOException, InterruptedException
	    {
	    	 pofficer=new LTPlacementOfficer_Page(driver);
	        
	        String username=LearnerTrackerExcelUtility.getCellData(2, 0);
	        String password=LearnerTrackerExcelUtility.getCellData(2, 1);
	        
	        pofficer.loginUser(username);
	        pofficer.loginPassword(password);
	        pofficer.LoginbuttonClick();
	        pofficer.getLogotext();
	        Thread.sleep(1000);	
	        
	        String correctResult=driver.findElement(By.xpath("//span[@class='item-content']")).getText();
			System.out.println(correctResult);
			String expectedResult=LTAutomationConstants.correctResult;
			Assert.assertEquals(correctResult,expectedResult);
	        
	        }
	     
	     
	   ///****UPDATE PLACEMENT STATUS SECTION****////
	     
	     @Test(priority=2)
	     public void UpdatePlacementStatus() throws IOException, InterruptedException
	    {
	    	 pofficer=new LTPlacementOfficer_Page(driver);
	        
	        String username=LearnerTrackerExcelUtility.getCellData(2, 0);
	        String password=LearnerTrackerExcelUtility.getCellData(2, 1);
	                
	        pofficer.loginUser(username);
	        pofficer.loginPassword(password);
	        pofficer.LoginbuttonClick();
	                
	        pofficer.UpdatePlacementStatusbuttonClick();
	        pofficer.setPstatusdropdown();
	        
	        pofficer.placementSubmitButtonClick();
	        pofficer.Pstatusdropdown();
	        System.out.println("Update successfully");
	        Thread.sleep(1000);	
	        
	              
	         String actualAlertmsg=driver.findElement(By.xpath("//span[@class='item-content']")).getText();
	         System.out.println(actualAlertmsg);
			String expectedResult=LTAutomationConstants.actualAlertmsg;
			Assert.assertEquals(actualAlertmsg,expectedResult);
	        
	        }
	     
	     
	     /////////PLACEMENT OFFICER DASHBOARD BUTTON/////////
	     
	     
	     @Test(priority=3)
	     public void Pofficer_dashboardButton() throws IOException, InterruptedException
	    {
	    	 pofficer=new LTPlacementOfficer_Page(driver);
	        
	        String username=LearnerTrackerExcelUtility.getCellData(2, 0);
	        String password=LearnerTrackerExcelUtility.getCellData(2, 1);
	        
	        pofficer.loginUser(username);
	        pofficer.loginPassword(password);
	        pofficer.LoginbuttonClick();
	        pofficer.getLogotext();
	        Thread.sleep(1000);	
	        
	        pofficer.pofficer_updateButtonClick();
	        pofficer.pofficer_dashboardButtonClick();
	        //pofficer.pofficer_placementpage();
	        Thread.sleep(1000);	
	        
	      //span[@class='item-content']
	      //span[@class='item-content']
	      //button[@class='btn btn-warning']
	      //th[normalize-space()='Placement Status']
	      //a[@class='navbar-brand']
	        String correctResult=driver.findElement(By.xpath("//span[@class='item-content']")).getText();
			System.out.println(correctResult);
			String expectedResult=LTAutomationConstants.correctResult;
			Assert.assertEquals(correctResult,expectedResult);
	        
	        }
	     
	     
	     
	     
}
