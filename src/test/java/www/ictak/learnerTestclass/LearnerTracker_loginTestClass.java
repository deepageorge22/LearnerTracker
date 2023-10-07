package www.ictak.learnerTestclass;

import java.io.IOException;
import org.ictak.learnerBaseclass.LearnerTrackerBaseClass;
import org.ictak.learnerConstants.LTAutomationConstants;
import org.ictak.learnerPages.LearnerTracker_LoginPage;
import org.ictak.learnerUtilities.LearnerTrackerExcelUtility;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LearnerTracker_loginTestClass extends LearnerTrackerBaseClass {
		
	LearnerTracker_LoginPage newlogin;
	
	///*****ADMIN ACTIONS******///
	
		//VALID ADMIN LOGIN
	 
    @Test(priority=1)
     public void verifyValidLogin() throws IOException, InterruptedException
    {
        newlogin=new LearnerTracker_LoginPage(driver);
        
        String username=LearnerTrackerExcelUtility.getCellData(0, 0);
        String password=LearnerTrackerExcelUtility.getCellData(0, 1);
        
        newlogin.loginUser(username);
        newlogin.loginPassword(password);
        newlogin.LoginbuttonClick();
        newlogin.getLogotext();
        Thread.sleep(1000);	
                        
        String actualMsg=driver.findElement(By.xpath("//span[@class='item-content']")).getText();
		System.out.println(actualMsg);
		String expectedMsg=LTAutomationConstants.actualMsg;
		Assert.assertEquals(actualMsg,expectedMsg);
        
        }
    
  //CORRECT USERNAME & INCORRECT PASSWORD 
	
     @Test(priority=3)
     public void verifyInValidLogin() throws IOException, InterruptedException
     {
         newlogin=new LearnerTracker_LoginPage(driver);
         
         String username1=LearnerTrackerExcelUtility.getCellData(4, 0);
         String password1=LearnerTrackerExcelUtility.getCellData(4, 1);
         
         newlogin.loginUser(username1);
         newlogin.loginPassword(password1);
         newlogin.LoginbuttonClick();
         newlogin.getloginError();
         Thread.sleep(1000);
         
         String actualResult1=driver.findElement(By.xpath("//div[@class='fade alert alert-danger alert-dismissible show']")).getText();
         System.out.println(actualResult1);
 		 String expectedResult1=LTAutomationConstants.actualResult1;
 		 Assert.assertEquals(actualResult1,expectedResult1);
         
         }
    
    //INCORRECT USERNAME & PASSWORD
    
     @Test(priority=4)
     
    public void InValidLogin() throws IOException, InterruptedException
     {
        newlogin=new LearnerTracker_LoginPage(driver);
        
        String username1=LearnerTrackerExcelUtility.getCellData(4, 2);
        String password1=LearnerTrackerExcelUtility.getCellData(4, 3);
        
        newlogin.loginUser(username1);
        newlogin.loginPassword(password1);
        newlogin.LoginbuttonClick();
        newlogin.getloginError();
        Thread.sleep(1000);
        
        String actualProduct1=driver.findElement(By.xpath("//div[@class='fade alert alert-danger alert-dismissible show']")).getText();
        System.out.println(actualProduct1);
		String expectedProduct1=LTAutomationConstants.actualProduct1;
		Assert.assertEquals(actualProduct1,expectedProduct1);
                
   }
     
   ///*****TRAINING-HEAD ACTIONS******///
     
     //TRAINING_HEAD VALID LOGIN SECTION
     
    @Test(priority=5)
    public void verifyValidTrainerLogin() throws IOException, InterruptedException
    {
        newlogin=new LearnerTracker_LoginPage(driver);
        
        String username=LearnerTrackerExcelUtility.getCellData(1, 0);
        String password=LearnerTrackerExcelUtility.getCellData(1, 1);
        
        newlogin.loginUser(username);
        newlogin.loginPassword(password);
        newlogin.LoginbuttonClick();
        newlogin.getLogotext();
        Thread.sleep(1000);	
        
        String actualResult=driver.findElement(By.xpath("//span[@class='item-content']")).getText();
		System.out.println(actualResult);
		String expectedResult=LTAutomationConstants.actualResult;
		Assert.assertEquals(actualResult,expectedResult);
    }
    
  //CORRECT USERNAME & INCORRECT PASSWORD 
	
    @Test(priority=7)
     public void verifyInValidTrainerLogin() throws IOException, InterruptedException
     {
         newlogin=new LearnerTracker_LoginPage(driver);
         
         String username=LearnerTrackerExcelUtility.getCellData(5, 0);
         String password=LearnerTrackerExcelUtility.getCellData(5, 1);
         
         newlogin.loginUser(username);
         newlogin.loginPassword(password);
         newlogin.LoginbuttonClick();
         newlogin.getloginError();
         Thread.sleep(1000);
         
         String actualResult1=driver.findElement(By.xpath("//div[@class='fade alert alert-danger alert-dismissible show']")).getText();
         System.out.println(actualResult1);//div[@role='alert']
 		 String expectedResult1=LTAutomationConstants.actualResult1;
 		 Assert.assertEquals(actualResult1,expectedResult1);
         
         }
    
    
    //INCORRECT USERNAME & PASSWORD
    
     @Test(priority=8)
     
     public void InValidTrainerLogin() throws IOException, InterruptedException
     {
        newlogin=new LearnerTracker_LoginPage(driver);
        
        String username=LearnerTrackerExcelUtility.getCellData(5, 2);
        String password=LearnerTrackerExcelUtility.getCellData(5, 3);
        
        newlogin.loginUser(username);
        newlogin.loginPassword(password);
        newlogin.LoginbuttonClick();
        newlogin.getloginError();
        Thread.sleep(1000);
        
        String actualResult2=driver.findElement(By.xpath("//div[@class='fade alert alert-danger alert-dismissible show']")).getText();
        System.out.println(actualResult2);
		String expectedResult2=LTAutomationConstants.actualResult2;
		Assert.assertEquals(actualResult2,expectedResult2);
        
        }
     
     
   ///*****PLACEMENT OFFICER ACTIONS******///
   
     //PLACEMENT OFFICER VALID LOGIN SECTION
     
     @Test(priority=9)
    public void verifyValidPofficerLogin() throws IOException, InterruptedException
    {
        newlogin=new LearnerTracker_LoginPage(driver);
        
        String username=LearnerTrackerExcelUtility.getCellData(2, 0);
        String password=LearnerTrackerExcelUtility.getCellData(2, 1);
        
        newlogin.loginUser(username);
        newlogin.loginPassword(password);
        newlogin.LoginbuttonClick();
        newlogin.getLogotext();
        Thread.sleep(1000);	
        
        String correctResult=driver.findElement(By.xpath("//span[@class='item-content']")).getText();
		System.out.println(correctResult);
		String expectedResult1=LTAutomationConstants.correctResult;
		Assert.assertEquals(correctResult,expectedResult1);
    }
    
  //CORRECT USERNAME & INCORRECT PASSWORD 
	
     @Test(priority=11)
     public void verifyInValidPofficerLogin() throws IOException, InterruptedException
     {
         newlogin=new LearnerTracker_LoginPage(driver);
         
         String username=LearnerTrackerExcelUtility.getCellData(6, 0);
         String password=LearnerTrackerExcelUtility.getCellData(6, 1);
         
         newlogin.loginUser(username);
         newlogin.loginPassword(password);
         newlogin.LoginbuttonClick();
         newlogin.getloginError();
         Thread.sleep(1000);
         
         String correctResult1=driver.findElement(By.xpath("//div[@class='fade alert alert-danger alert-dismissible show']")).getText();
         System.out.println(correctResult1);//div[@role='alert']
 		 String expectedResult1=LTAutomationConstants.correctResult1;
 		 Assert.assertEquals(correctResult1,expectedResult1);
         
         }
     
    
    //INCORRECT USERNAME & PASSWORD
    
     @Test(priority=12)
     
     public void InValidPofficerLogin() throws IOException, InterruptedException
     {
        newlogin=new LearnerTracker_LoginPage(driver);
        
        String username=LearnerTrackerExcelUtility.getCellData(6, 2);
        String password=LearnerTrackerExcelUtility.getCellData(6, 3);
        
        newlogin.loginUser(username);
        newlogin.loginPassword(password);
        newlogin.LoginbuttonClick();
        newlogin.getloginError();
        Thread.sleep(1000);
        
        String correctResult2=driver.findElement(By.xpath("//div[@class='fade alert alert-danger alert-dismissible show']")).getText();
        System.out.println(correctResult2);//div[@role='alert']
		 String expectedResult2=LTAutomationConstants.correctResult2;
		 Assert.assertEquals(correctResult2,expectedResult2);
        
        }
     
     
     //ADD USER TEST SECTION
     
    @Test(priority=2)
    public void addUser() throws IOException, InterruptedException
    {
        newlogin=new LearnerTracker_LoginPage(driver);
        
        String username1=LearnerTrackerExcelUtility.getCellData(0, 0);
        String password1=LearnerTrackerExcelUtility.getCellData(0, 1);
        
        String name=LearnerTrackerExcelUtility.getCellData(8, 0);
        String email=LearnerTrackerExcelUtility.getCellData(9, 0);
        String username11= LearnerTrackerExcelUtility.getCellData(10, 0);
        String password11=LearnerTrackerExcelUtility.getCellData(11, 0);
        
        newlogin.loginUser(username1);
        newlogin.loginPassword(password1);
        newlogin.LoginbuttonClick();
        newlogin.getLogotext();
        Thread.sleep(1000);	
        
        newlogin.AddUserButtonClick();
        
        newlogin.setaddName(name);
        newlogin.setaddEmail(email);
        newlogin.addUsername(username11);
        newlogin.addPassword(password11);
        newlogin.clickDropdownRole();
        newlogin.clickDropdown();
        
        newlogin.adduserSubmitButton();
        Thread.sleep(1000);
        
        String actualProduct2=driver.findElement(By.xpath("//div[@id='swal2-html-container']")).getText();
        System.out.println(actualProduct2);
		String expectedProduct2=LTAutomationConstants.actualProduct2;
		Assert.assertEquals(actualProduct2,expectedProduct2);
        
            }
     
     
     //ADD LEARNERS SECTION
     
     @Test(priority=6)
    public void addLearners() throws IOException, InterruptedException
    {
        newlogin=new LearnerTracker_LoginPage(driver);
        
        String username=LearnerTrackerExcelUtility.getCellData(1, 0);
        String password=LearnerTrackerExcelUtility.getCellData(1, 1);
        
        String learnerid=LearnerTrackerExcelUtility.getCellData(13, 0);
        String lname=LearnerTrackerExcelUtility.getCellData(14, 0);
        
        newlogin.loginUser(username);
        newlogin.loginPassword(password);
        newlogin.LoginbuttonClick();
        
        newlogin.AddLearnerButtonClick();
        newlogin.setaddLearnerid(learnerid);
        newlogin.setaddLearnername(lname);
        
        newlogin.DropdownCourse();
        newlogin.Cdropdown();
        
        newlogin.DropdownProject();
        newlogin.Pdropdown();
        
        newlogin.DropdownBatch();
        newlogin.Bdropdown();
        
        newlogin.DropdownCoursestatus();
        newlogin.Cstatusdropdown();
        
        newlogin.addLearnerSubmitButton();
        Thread.sleep(1000);	
        String msg=driver.findElement(By.xpath("//span[@class='item-content']")).getText();
        System.out.println(msg);
        
        String actualAlert=driver.findElement(By.xpath("//div[@id='swal2-html-container']")).getText();
        System.out.println(actualAlert);//div[@role='alert']
	    String expectedAlert=LTAutomationConstants.actualAlert;
		Assert.assertEquals(actualAlert,expectedAlert);
        
        }
    
  }
    
    
    
    
       



