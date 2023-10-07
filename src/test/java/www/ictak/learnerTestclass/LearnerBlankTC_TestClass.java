package www.ictak.learnerTestclass;

import java.io.IOException;
import org.ictak.learnerBaseclass.LearnerTrackerBaseClass;
import org.ictak.learnerConstants.LTAutomationConstants;
import org.ictak.learnerPages.LearnerTracker_LoginPage;
import org.ictak.learnerUtilities.LearnerTrackerExcelUtility;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LearnerBlankTC_TestClass extends LearnerTrackerBaseClass{
	
	LearnerTracker_LoginPage blankLearnerTC;
	
	///*****TRAINING-HEAD ACTIONS******///
    
    //TRAINING_HEAD VALID LOGIN SECTION
    
    @Test(priority=1)
    public void verifyValidTrainerLogin() throws IOException, InterruptedException
   {
    	blankLearnerTC=new LearnerTracker_LoginPage(driver);
       
       String username=LearnerTrackerExcelUtility.getCellData(1, 0);
       String password=LearnerTrackerExcelUtility.getCellData(1, 1);
       
       blankLearnerTC.loginUser(username);
       blankLearnerTC.loginPassword(password);
       blankLearnerTC.LoginbuttonClick();
       blankLearnerTC.getLogotext();
       Thread.sleep(1000);	
       
        String actualResult=driver.findElement(By.xpath("//span[@class='item-content']")).getText();
		System.out.println(actualResult);
		String expectedResult=LTAutomationConstants.actualResult;
		Assert.assertEquals(actualResult,expectedResult);
   }
	
	
	//ADD BLANK DATAS IN ADD LEARNERS SECTION
    
    @Test(priority=2)
    public void addLearners() throws IOException, InterruptedException
   {
    	blankLearnerTC=new LearnerTracker_LoginPage(driver);
       
       String username=LearnerTrackerExcelUtility.getCellData(1, 0);
       String password=LearnerTrackerExcelUtility.getCellData(1, 1);
       
       String learnerid=LearnerTrackerExcelUtility.getCellData(13, 2);
       String lname=LearnerTrackerExcelUtility.getCellData(14, 2);
       
       blankLearnerTC.loginUser(username);
       blankLearnerTC.loginPassword(password);
       blankLearnerTC.LoginbuttonClick();
              
       blankLearnerTC.AddLearnerButtonClick();
       
       blankLearnerTC.setaddLearnerid(learnerid);
       blankLearnerTC.setaddLearnername(lname);
       
       blankLearnerTC.DropdownCourse();
       blankLearnerTC.Cdropdown();
       
       blankLearnerTC.DropdownProject();
       blankLearnerTC.Pdropdown();
       
       blankLearnerTC.DropdownBatch();
       blankLearnerTC.Bdropdown();
       
       blankLearnerTC.DropdownCoursestatus();
       blankLearnerTC.Cstatusdropdown();
       
       blankLearnerTC.addLearnerSubmitButton();
       Thread.sleep(1000);	
              
       String actualAlert1=driver.findElement(By.xpath("//p[@class='fw-light fst-italic text-start text-danger']")).getText();
		System.out.println(actualAlert1);
		String expectedAlert=LTAutomationConstants.actualLAlert1;
		Assert.assertEquals(actualAlert1,expectedAlert);
		
   }
   
}
