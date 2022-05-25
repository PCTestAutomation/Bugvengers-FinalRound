package com.automation.testcases.web;

import org.testng.annotations.Test;

import com.automation.base.BaseFixture;
import com.automation.pages.web.HomePage;

public class HomePageTest extends BaseFixture {

	@Test(testName = "NavigationTest", description = "Navigate To Yammer site")
	public void verifySearch() throws InterruptedException {
		HomePage homePage = new HomePage();
		homePage.enterCredentials();
		homePage.clickCommunityLink();
		homePage.clickAllLink();
		homePage.getGroupName();
		homePage.navigateToCommunityAndClick();
		homePage.navigateToMemberAndClick();
		
		}

	}


