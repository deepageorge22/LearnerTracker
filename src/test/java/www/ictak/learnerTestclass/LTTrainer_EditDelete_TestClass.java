package www.ictak.learnerTestclass;

import java.io.IOException;
import org.ictak.learnerBaseclass.LearnerTrackerBaseClass;
import org.ictak.learnerConstants.LTAutomationConstants;
//import org.ictak.learnerConstants.LTAutomationConstants;
import org.ictak.learnerPages.LTTrainer_EditDelete_Page;
import org.ictak.learnerUtilities.LearnerTrackerExcelUtility;
import org.openqa.selenium.By;
import org.testng.Assert;
//import org.testng.Assert;
import org.testng.annotations.Test;

public class LTTrainer_EditDelete_TestClass extends LearnerTrackerBaseClass{

	LTTrainer_EditDelete_Page editLearner;
	LTTrainer_EditDelete_Page deleteLearner;
	
	///*****TRAINING HEAD ACTIONS******///
	
			//VALID TRAINER LOGIN WITH EDIT ACTIONS
		 
	    @Test(priority=1)
	     public void trainer1_learneredit() throws IOException, InterruptedException
	    {
	    	
			editLearner=new LTTrainer_EditDelete_Page(driver);
	        
	        String username=LearnerTrackerExcelUtility.getCellData(1, 0);
	        String password=LearnerTrackerExcelUtility.getCellData(1, 1);
	        
	        String editLearnerid=LearnerTrackerExcelUtility.getCellData(17,6 );
	        String editLearnername=LearnerTrackerExcelUtility.getCellData(18, 6);
	        
	        editLearner.loginUser(username);
	        editLearner.loginPassword(password);
	        editLearner.LoginbuttonClick();
	        Thread.sleep(5000);	
	        
	        editLearner.editLearnerButtonClick();
	        Thread.sleep(2000);
	        
	        editLearner.editLearnerid(editLearnerid);
	        editLearner.editLearnerName(editLearnername);
	        Thread.sleep(3000);
	        
	        editLearner.editLearner_SubmitButton();
	        editLearner.traineredit_learner();
	        Thread.sleep(1000);
	       	        
	        String Message=driver.findElement(By.xpath("//a[@class='navbar-brand']")).getText();
	        System.out.println("Edited Successfully");
	        System.out.println(Message);
	        
	      //span[@class='item-content']
	        String actualLMessage=driver.findElement(By.xpath("//span[@class='item-content']")).getText();
	        System.out.println(actualLMessage);
	        String expectedResult1=LTAutomationConstants.actualLMessage;
			Assert.assertEquals(actualLMessage,expectedResult1);
	        
	        /*String actualLMessage=driver.getCurrentUrl(); 
			System.out.println(actualLMessage);
			Assert.assertEquals(expectedMessage,LTAutomationConstants.actualLMessage);*/
	    }
	    
	    @Test(priority=2)
	     public void trainer_learnerdelete() throws IOException, InterruptedException
	    {
	    	
			deleteLearner=new LTTrainer_EditDelete_Page(driver);
	        
	        String username=LearnerTrackerExcelUtility.getCellData(1, 0);
	        String password=LearnerTrackerExcelUtility.getCellData(1, 1);
	         
	        deleteLearner.loginUser(username);
	        deleteLearner.loginPassword(password);
	        deleteLearner.LoginbuttonClick();
	        Thread.sleep(5000);	
	        
	        deleteLearner.deleteLearnerButtonClick();
	        deleteLearner.trainerdelete_learner();
	        Thread.sleep(2000);
	        
	        //String expText=driver.findElement(By.xpath("//a[@class='navbar-brand']")).getText();
	        //System.out.println("Deleted Successfully");
	        //System.out.println(expText);
	        
	        String actualLText=driver.findElement(By.xpath("//span[@class='item-content']")).getText();
	        System.out.println(actualLText);
	        String expectedResult1=LTAutomationConstants.actualLText;
			Assert.assertEquals(actualLText,expectedResult1);
	        
	        /*String actualLText=driver.getCurrentUrl(); 
			System.out.println(actualLText);
			Assert.assertEquals(expectedText,LTAutomationConstants.actualLText);*/

	    }
}
			
			

