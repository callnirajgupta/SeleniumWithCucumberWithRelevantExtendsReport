package com.robotic.stepdef;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Match;
import org.sikuli.script.Screen;

import com.google.common.io.Files;

import cucumber.api.java.en.Given;

public class SnapShotStepDefinition {
	private String screenShotPath= System.getProperty("user.dir")+"\\src\\test\\resources\\SnapShot\\";
     Screen s = new Screen();
	
	@Given("^user navigate to Women page and take screenshot$")
	public void user_navigate_to_home_page_and_take_screen() throws Throwable {
		
		SeleniumUtil.navigate("http://automationpractice.com/index.php");
		Thread.sleep(2000);
		SeleniumUtil.getDriver().findElement(By.xpath("//a[@title='Women']")).click();
		Thread.sleep(2000);
		CommonStep.scenario.write("capturing women page screen shot");
		
	    takeSnapShot(SeleniumUtil.getDriver(),"Women");
	    
	    SeleniumUtil.PassTestStep(SeleniumUtil.getDriver(), CommonStep.getExtentTest(), "Women page loaded successfully");
	    SeleniumUtil.EmbedScreenShot(CommonStep.scenario);
		
		
	        
	        
	}

	@Given("^user navigate to Tshirts page and take screenshot$")
	public void user_navigate_to_best_seller_page_and_take_screen() throws Throwable {
	    
		SeleniumUtil.getDriver().findElement(By.xpath("(//a[@title='T-shirts'])[2]")).click();
		Thread.sleep(2000);
		CommonStep.scenario.write("capturing Tshirts page screen shot");
        takeSnapShot(SeleniumUtil.getDriver(),"Tshirts");
        
        SeleniumUtil.PassTestStep(SeleniumUtil.getDriver(), CommonStep.getExtentTest(), "Tshirts loaded successfully");
	    SeleniumUtil.EmbedScreenShot(CommonStep.scenario);
	}
	
	
	@Given("^user navigate to Women page and validate Women page$")
	public void user_navigate_to_home_page_and_validate_home_page() throws Throwable {
	    
     
		SeleniumUtil.navigate("http://automationpractice.com/index.php");
		Thread.sleep(2000);
		//SeleniumUtil.getDriver().findElement(By.xpath("//a[@title='Women']")).click();
		SeleniumUtil.getDriver().findElement(By.xpath("(//a[@title='T-shirts'])[2]")).click();
		Thread.sleep(3000);
		Match flag=s.exists(screenShotPath+"Women.png");
		System.out.println("print Match:"+flag);
       if(flag!=null){
        //s.find(screenShotPath+"Women.png"); 
        System.out.println("Women page ScreenShot matching");
		SeleniumUtil.PassTestStep(SeleniumUtil.getDriver(), CommonStep.getExtentTest(), "Women page ScreenShot matching");
	} else{
        	System.out.println("Women page screen Shot not matching");
    		SeleniumUtil.failTestStep(SeleniumUtil.getDriver(), CommonStep.getExtentTest(), "Women page ScreenShot  not matching");
    		SeleniumUtil.failTestStepExpected(SeleniumUtil.getDriver(), CommonStep.getExtentTest(), "Women ScreenShot  expected",screenShotPath+"Women.png");
    		
    		SeleniumUtil.EmbedScreenShot(CommonStep.scenario);	
    		
        }
        
        

        
        	
	    
	}

	@Given("^user navigate to Tshirts page validate Tshirts page$")
	public void user_navigate_to_best_seller_page_validate_home_page() throws Throwable {
		SeleniumUtil.getDriver().findElement(By.xpath("(//a[@title='T-shirts'])[2]")).click();
    	Thread.sleep(2000);
    	Match flag=s.exists(screenShotPath+"Tshirts.png");
    	System.out.println("print  tshirt Match:"+flag);
       if(flag!=null){
        System.out.println("Tshirts ScreenShot matching");
		SeleniumUtil.PassTestStep(SeleniumUtil.getDriver(), CommonStep.getExtentTest(), "Tshirts page ScreenShot matching");
        }else{
        	System.out.println("Tshirts screen Shot not matching");
    		SeleniumUtil.failTestStep(SeleniumUtil.getDriver(), CommonStep.getExtentTest(), "Tshirts page ScreenShot  not matching");
    	    SeleniumUtil.EmbedScreenShot(CommonStep.scenario);
    	
        }
    	
	    
	}

	
	public void takeSnapShot(WebDriver driver,String filename) throws Exception{

		
		//String screenShotPath= System.getProperty("user.dir")+"//src//test//resources//SnapShot//";
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			Files.copy(scrFile, new File(screenShotPath +filename+".png"));
			
}


}
