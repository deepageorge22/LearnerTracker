package www.ictak.learnerTestclass;

import java.io.IOException;
import org.ictak.learnerBaseclass.LearnerTrackerBaseClass;
import org.ictak.learnerConstants.LTAutomationConstants;
import org.ictak.learnerPages.LTAdmin_UpdateDeleteUser_Page;
import org.ictak.learnerUtilities.LearnerTrackerExcelUtility;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LTAdmin_UpdateDeleteUser_TestClass extends LearnerTrackerBaseClass{
	
	LTAdmin_UpdateDeleteUser_Page editUser;
	LTAdmin_UpdateDeleteUser_Page deleteUser;
	
	///*****ADMIN ACTIONS******///
	
			//VALID ADMIN LOGIN WITH UPDATE ACTION//////
		 
	    @Test(priority=1)
	     public void admin1_ValidLogin() throws IOException, InterruptedException
	    {
	    	
			editUser=new LTAdmin_UpdateDeleteUser_Page(driver);
	        
	        String username=LearnerTrackerExcelUtility.getCellData(0, 0);
	        String password=LearnerTrackerExcelUtility.getCellData(0, 1);
	        
	        String editname=LearnerTrackerExcelUtility.getCellData(17, 3);
	        String editpass=LearnerTrackerExcelUtility.getCellData(18, 3);
	        
	        editUser.loginUser(username);
	        editUser.loginPassword(password);
	        editUser.LoginbuttonClick();
	        Thread.sleep(5000);	
	        
	        editUser.editUserButtonClick();
	        Thread.sleep(2000);
	        
	        editUser.editName(editname);
	        editUser.editPassword(editpass);
	        Thread.sleep(3000);
	        
	        editUser.edituser_SubmitButton();
	        editUser.adminedit_user();
	        Thread.sleep(1000);
	       	  
	        System.out.println("Updated successfully");
	        
	        String actuallMessage=driver.findElement(By.xpath("//span[normalize-space()='Users']")).getText();
	        System.out.println(actuallMessage);
	        String expectedResult1=LTAutomationConstants.actualLMessage;
			Assert.assertEquals(actuallMessage,expectedResult1);
	        
			
	    }
	    
	    
	    ////////*********ADMIN LOGIN WITH DELETE ACTION******////////////
	    
	    @Test(priority=2)
	     public void admin_ValidLogin() throws IOException, InterruptedException
	    {
	    	
			deleteUser=new LTAdmin_UpdateDeleteUser_Page(driver);
	        
	        String username=LearnerTrackerExcelUtility.getCellData(0, 0);
	        String password=LearnerTrackerExcelUtility.getCellData(0, 1);
	         
	        deleteUser.loginUser(username);
	        deleteUser.loginPassword(password);
	        deleteUser.LoginbuttonClick();
	        Thread.sleep(5000);	
	        
	        deleteUser.deleteUserButtonClick();
	        deleteUser.admindelete_user();
	        Thread.sleep(2000);
	        
	        System.out.println("Deleted successfully");
	     
	        String actualText=driver.findElement(By.xpath("//span[normalize-space()='Users']")).getText();
	        System.out.println(actualText);
	        String expectedResult1=LTAutomationConstants.actualText;
			Assert.assertEquals(actualText,expectedResult1);
	        
			
	    }
}