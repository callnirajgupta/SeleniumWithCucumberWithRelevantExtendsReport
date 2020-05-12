@SnapShot
Feature: Verify that the page screen is matching before deplyoment and after development 

@beforedeployment
Scenario: Before deployment take screenshot
Given user navigate to Women page and take screenshot 
And user navigate to Tshirts page and take screenshot

@afterdeployment
Scenario: After deployment take screenshot
Given user navigate to Women page and validate Women page 
And user navigate to Tshirts page validate Tshirts page
