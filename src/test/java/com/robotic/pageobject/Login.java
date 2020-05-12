package com.robotic.pageobject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.robotic.stepdef.SeleniumUtil;


public class Login {
	//private static WebDriver driver=SeleniumUtil.getDriver();
	public static final String TITLE="My Store";
	public static final String SIGN_IN_XPATH = "//a[contains(text(),'Sign in')]";
	public static final String EMAIL_ID="email";
	
	
	public static void validateLoginPageTitle(){
		
		Assert.assertEquals("The title of the page is not matching", TITLE,SeleniumUtil.getDriver().getTitle());
		
	}
	
	public static void clickSignIn(){
		SeleniumUtil.clickLink(By.xpath(SIGN_IN_XPATH));
	}

	public static void validateSignInPage(){
		SeleniumUtil.isElementDiplayed(By.id(EMAIL_ID));
		
	}
	
	public static void enterUrl(String url){
		
		SeleniumUtil.navigate(url);
		
	}
}
