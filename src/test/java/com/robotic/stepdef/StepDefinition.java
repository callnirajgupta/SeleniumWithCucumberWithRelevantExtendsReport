package com.robotic.stepdef;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.robotic.pageobject.Login;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

   
public class StepDefinition {
	
	Map<String,String> userDataMap = new HashMap<String,String>();
	
	@Given("^user open the browser and enter url$")
	public void user_open_the_browser_and_enter_url_as() throws Throwable {
		CommonStep.scenario.write("I am insideSetup");
		
		SeleniumUtil.navigate(SeleniumUtil.configProperties.getProperty("url"));
		
		Login.validateLoginPageTitle();
		SeleniumUtil.PassTestStep(SeleniumUtil.getDriver(), CommonStep.getExtentTest(), "Home loaded successfully");
	    SeleniumUtil.EmbedScreenShot(CommonStep.scenario);
		
		CommonStep.scenario.write("taking screen shot");
		
		//String imagePath=SeleniumUtil.takeScreenShotReturnPath();
		//CommonStep.getTest().addScreenCaptureFromPath(imagePath, "open browser");
		
	}

	@When("^user enter userid and password$")
	public void user_enter_userid_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		CommonStep.scenario.write("user enter userid and password");
		
	    Login.clickSignIn();
	    Login.validateSignInPage();
	    SeleniumUtil.PassTestStep(SeleniumUtil.getDriver(), CommonStep.getExtentTest(), "Sign loaded successfully");
	    CommonStep.scenario.write("signin done");
	     
	   
	    Assert.assertTrue("failed", false);
		
	}

	@Then("^Verify thta user is logged in successfully$")
	public void verify_thta_user_is_logged_in_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	
	
}
