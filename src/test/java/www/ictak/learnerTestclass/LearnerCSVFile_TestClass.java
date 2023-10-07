package www.ictak.learnerTestclass;

import java.io.IOException;
import org.ictak.learnerBaseclass.LearnerTrackerBaseClass;
import org.ictak.learnerConstants.LTAutomationConstants;
import org.ictak.learnerPages.LearnerCSVFile_Page;
import org.ictak.learnerUtilities.LearnerTrackerExcelUtility;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LearnerCSVFile_TestClass extends LearnerTrackerBaseClass{

		
	LearnerCSVFile_Page csvfile;
	
	///*****ADMIN ACTIONS******///
	
		// ADMIN UPLOAD CSV FILE ACTION////
	 
    @Test(priority=1)
     public void admin_uploadFile() throws IOException, InterruptedException
    {
    	csvfile=new LearnerCSVFile_Page(driver);
        
        String username=LearnerTrackerExcelUtility.getCellData(0, 0);
        String password=LearnerTrackerExcelUtility.getCellData(0, 1);
        
        csvfile.loginUser(username);
        csvfile.loginPassword(password);
        csvfile.LoginbuttonClick();
        csvfile.learnerButtonClick();
        Thread.sleep(1000);	
        csvfile.adminUpload_ButtonClick();
        csvfile.adminUpload_ChooseFilebrowser();
        
        csvfile.uploadLearner_SubmitButtonClick();
        Thread.sleep(1000);	
        csvfile.uploadLearner_SubmitButtonPopup();
        csvfile.uploadLearner_SaveButtonPopup();
        Thread.sleep(1000);	
                        
        String actualMsg1=driver.findElement(By.linkText("Learners")).getText();
		System.out.println(actualMsg1);
		String expectedMsg=LTAutomationConstants.actualMsg1;
		Assert.assertEquals(actualMsg1,expectedMsg);
      
        }
    
    
  ///*****TRAINING HEAD ACTIONS******///
	
  		// TRAINER UPLOAD CSV FILE ACTION////
  	 
     @Test(priority=2)
       public void trainer_uploadFile() throws IOException, InterruptedException
      {
      	csvfile=new LearnerCSVFile_Page(driver);
          
          String username=LearnerTrackerExcelUtility.getCellData(1, 0);
          String password=LearnerTrackerExcelUtility.getCellData(1, 1);
          
          csvfile.loginUser(username);
          csvfile.loginPassword(password);
          csvfile.LoginbuttonClick();
          csvfile.learnerButtonClick();
          Thread.sleep(1000);	
          csvfile.trainerUpload_ButtonClick();
          csvfile.trainerUpload_ChooseFilebrowser();
          
          csvfile.uploadTLearner_SubmitButtonClick();
          Thread.sleep(1000);	
          csvfile.uploadTLearner_SubmitButtonPopup();
          csvfile.uploadTLearner_SaveButtonPopup();
          Thread.sleep(1000);	
                          
          String tupload_actualMsg1=driver.findElement(By.linkText("Learners")).getText();
  		  System.out.println(tupload_actualMsg1);
  		  String expectedMsg=LTAutomationConstants.tupload_actualMsg1;
  		  Assert.assertEquals(tupload_actualMsg1,expectedMsg);
        
          }
	
	
	// ADMIN_DOWNLOAD CSV FILE BY CLICKING LINK ////
    
	      @Test(priority=3)
	     public void admin_downloadFile() throws IOException, InterruptedException
	     {
	     	csvfile=new LearnerCSVFile_Page(driver);
	         
	         String username=LearnerTrackerExcelUtility.getCellData(0, 0);
	         String password=LearnerTrackerExcelUtility.getCellData(0, 1);
	         
	         csvfile.loginUser(username);
	         csvfile.loginPassword(password);
	         csvfile.LoginbuttonClick();
	         csvfile.learnerButtonClick();
	         Thread.sleep(1000);	
	         csvfile.adminUpload1_ButtonClick();
	         csvfile.download_adminLearner_link();
	         
	         String adminupload_actualMsg1=driver.findElement(By.linkText("Learners")).getText();
  		     System.out.println(adminupload_actualMsg1);
  		     String expectedMsg=LTAutomationConstants.adminupload_actualMsg1;
  		     Assert.assertEquals(adminupload_actualMsg1,expectedMsg);
	       
	    }
	
	      
   // TRAINER_DOWNLOAD CSV FILE BY CLICKING LINK ////
      
     @Test(priority=4)
     public void trainer_downloadFile() throws IOException, InterruptedException
     {
     	csvfile=new LearnerCSVFile_Page(driver);
         
         String username=LearnerTrackerExcelUtility.getCellData(1, 0);
         String password=LearnerTrackerExcelUtility.getCellData(1, 1);
         
         csvfile.loginUser(username);
         csvfile.loginPassword(password);
         csvfile.LoginbuttonClick();
         csvfile.learnerButtonClick();
         Thread.sleep(1000);	
         csvfile.trainerUpload1_ButtonClick();
         csvfile.download_TLearner_link();
         
         String tupload_actualMsg1=driver.findElement(By.linkText("Learners")).getText();
		 System.out.println(tupload_actualMsg1);
		 String expectedMsg=LTAutomationConstants.tupload_actualMsg1;
		 Assert.assertEquals(tupload_actualMsg1,expectedMsg);
	         
         
    }
      
    ///*****ADMIN ACTIONS******///
  	
  		// ADMIN_UPLOAD CANCEL BUTTON////
  	 
      @Test(priority=5)
      public void admin_uploadCancel() throws IOException, InterruptedException
      {
      	csvfile=new LearnerCSVFile_Page(driver);
          
          String username=LearnerTrackerExcelUtility.getCellData(0, 0);
          String password=LearnerTrackerExcelUtility.getCellData(0, 1);
          
          csvfile.loginUser(username);
          csvfile.loginPassword(password);
          csvfile.LoginbuttonClick();
          csvfile.learnerButtonClick();
          Thread.sleep(1000);	
          csvfile.adminUpload_Button(); 
          csvfile.adminUpload_cancelButton();
          
          String adminupload_actualMsg1=driver.findElement(By.linkText("Learners")).getText();
          System.out.println(adminupload_actualMsg1);
          String expectedMsg=LTAutomationConstants.adminupload_actualMsg1;
          Assert.assertEquals(adminupload_actualMsg1,expectedMsg);
}
      
    ///*****TRANING HEAD ACTIONS******///
    	
		// TRAINER_UPLOAD CANCEL BUTTON////
	 
    @Test(priority=6)
     public void trainer_uploadCancel() throws IOException, InterruptedException
    {
    	csvfile=new LearnerCSVFile_Page(driver);
        
        String username=LearnerTrackerExcelUtility.getCellData(1, 0);
        String password=LearnerTrackerExcelUtility.getCellData(1, 1);
        
        csvfile.loginUser(username);
        csvfile.loginPassword(password);
        csvfile.LoginbuttonClick();
        csvfile.learnerButtonClick();
        Thread.sleep(1000);	
        csvfile.adminUpload_Button(); 
        csvfile.adminUpload_cancelButton();
        
        String trainerupload_actualMsg1=driver.findElement(By.linkText("Learners")).getText();
		System.out.println(trainerupload_actualMsg1);
		String expectedMsg=LTAutomationConstants.trainerupload_actualMsg1;
		Assert.assertEquals(trainerupload_actualMsg1,expectedMsg);
    }
}

		  
		
	
	

