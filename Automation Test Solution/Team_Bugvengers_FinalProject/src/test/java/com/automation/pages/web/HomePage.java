package com.automation.pages.web;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.automation.base.BaseFixture;
import com.automation.base.BaseWebPage;
import com.automation.functions.GenericWebFunctions;
import com.automation.util.Constants;
import com.automation.util.ExtentReportManager;
import com.automation.util.WebLocators;
import com.aventstack.extentreports.Status;


public class HomePage extends BaseWebPage {
	
	
	@FindBy(xpath=WebLocators.COMMUNITY_LINK)
	protected WebElement communityLink;
	
	@FindBy(xpath=WebLocators.EMAIL_BOX)
	protected WebElement email;
	
	@FindBy(xpath=WebLocators.SUBMIT_BTN)
	protected WebElement submit;
	
	@FindBy(xpath=WebLocators.PASSWORD_BOX)
	protected WebElement password;
	
	@FindBy(xpath=WebLocators.ALL_LINK)
	protected WebElement allLink;
	
	@FindBy(xpath=WebLocators.GROUP_CONTAINER)
	protected List<WebElement> groupContainer;
	
	@FindBy(xpath=WebLocators.MEMBER_LINK)
	protected WebElement memberLink;
	
	
	
	
	
	
	public void clickCommunityLink()
	{
		ExtentReportManager.getTest().log(Status.INFO, "Clicking Community Link: ");
		GenericWebFunctions.waitUntil(communityLink,"visible");
		GenericWebFunctions.clickByWebElement(communityLink);
		
		
	}
	
	public void enterCredentials()
	{
		ExtentReportManager.getTest().log(Status.INFO, "Entering email ");
		GenericWebFunctions.waitUntil(email,"visible");
		
		GenericWebFunctions.sendKeysByElement(email, BaseFixture.getProperties().getProperty("username"));
		ExtentReportManager.getTest().log(Status.INFO, "Clicking Next ");
		GenericWebFunctions.waitUntil(submit,"visible");
		GenericWebFunctions.clickByWebElement(submit);
		ExtentReportManager.getTest().log(Status.INFO, "Entering password ");
		GenericWebFunctions.waitUntil(password,"visible");
		GenericWebFunctions.sendKeysByElement(email, BaseFixture.getProperties().getProperty("password"));
		ExtentReportManager.getTest().log(Status.INFO, "Clicking Submit ");
		GenericWebFunctions.waitUntil(submit,"visible");
		GenericWebFunctions.clickByWebElement(submit);
		//GenericWebFunctions.waitUntil(submit,"visible");
	//	GenericWebFunctions.clickByWebElement(submit);
	//	GenericWebFunctions.waitUntil(submit,"visible");
		//GenericWebFunctions.clickByWebElement(submit);
			
	}
	
	public void clickAllLink()
	{
		ExtentReportManager.getTest().log(Status.INFO, "Clicking All Link: ");
		GenericWebFunctions.waitUntil(allLink,"visible");
		GenericWebFunctions.clickByWebElement(allLink);
		
		
	}

	public void getGroupName()
	{
		ExtentReportManager.getTest().log(Status.INFO, "Getting all groups ");
		GenericWebFunctions.waitUntil(groupContainer,"visible");
		ArrayList<Long> memberCount = new ArrayList<Long>();
		
		for( WebElement ele:groupContainer )
		{
			WebElement groupName=ele.findElement(By.xpath(WebLocators.GROUP_NAME));
			System.out.println(groupName.getText());
			WebElement membercount=ele.findElement(By.xpath(WebLocators.MEMBER_COUNT));
			System.out.println(membercount.getText());
			String count=membercount.getText().replace(",", "").replace("members", "").trim();
			System.out.println("count: "+count);
			memberCount.add(Long.parseLong(count));
		}
		
		Collections.sort(memberCount);
		for( Long co:memberCount )
		{
			System.out.println("sorted count"+co);
		}
		
	}
	
	public void navigateToCommunityAndClick()
	{
		WebElement community=BaseFixture.getWebDriver().findElement(By.xpath("//div[starts-with(@class, 'inner') and contains(text(),'NQLB - No QA Left Behind')]")); 
		ExtentReportManager.getTest().log(Status.INFO, "Clicking NQLB - No QA Left Behind community ");
		GenericWebFunctions.waitUntil(community,"visible");
		GenericWebFunctions.clickByWebElement(community);
		
	}
	
	
	public void navigateToMemberAndClick()
	{
		ExtentReportManager.getTest().log(Status.INFO, "Clicking on Member Link ");
		GenericWebFunctions.waitUntil(memberLink,"visible");
		GenericWebFunctions.clickByWebElement(memberLink);
		
	}
	
	
	

	
	
	

}
