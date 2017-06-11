package com.ComputerDatabase.test;

import org.junit.Assert;
import org.openqa.selenium.By;



import com.ComputerDatabase.CommonContant.CommonContants;
import com.ComputerDatabase.CommonUtilities.Utilities;
import com.ComputerDatabase.CommonUtilities.ComputerData;

import org.testng.annotations.BeforeTest;



public class ComputerDatabase_CRUD_Test extends Utilities{
  @BeforeTest
  public void LaunchApplicationBrowser ()
	{
	  boolean Testcheck;
	  
	  //Lauch URL
		LaunchApplication(CommonContants.TestBrowser);		
		AddWaitTime(CommonContants.DEFAULT_WAIT_TIME);		
		Testcheck = Utilities.VerifyNavigatedPage(CommonContants.HOMEPAGE_TITLE_XPATH, CommonContants.HOME_PAGE_HEADER);
		// Click on Add ComputerName
		VerifyTestCheck(Testcheck);		
		Utilities.clickObject(By.id(CommonContants.ADD_BUTTON_ID));
		AddWaitTime(CommonContants.DEFAULT_WAIT_TIME);
		
		//Create Computer Data
		Utilities.enterTextInTextbox(By.id(CommonContants.NAME_TEXTBOX_ID), CommonContants.CREATE_COMPUTER_NAME);
		Utilities.enterTextInTextbox(By.id(CommonContants.INTRODATE_TEXTBOX_ID), CommonContants.CREATE_INTRODUCED_DATE);
		Utilities.enterTextInTextbox(By.id(CommonContants.DISCONTINUE_TEXTBOX_ID), CommonContants.CREATE_DISCONTINUED_DATE);
		Utilities.selectDropDownByText(By.id(CommonContants.COMPANY_ID), CommonContants.CREATE_COMPANY);
		Utilities.clickObject(By.xpath(CommonContants.CREATE_BUTTON_XPATH));
		AddWaitTime(CommonContants.DEFAULT_WAIT_TIME);
		Testcheck = Utilities.VerifyNavigatedPage(CommonContants.HOMEPAGE_LOAD_XPATH, CommonContants.HOME_PAGE_DONE_MESSAGE);
		VerifyTestCheck(Testcheck);
		AddWaitTime(CommonContants.DEFAULT_WAIT_TIME);
		
		//Read Computer Data		
		Utilities.enterTextInTextbox(By.id(CommonContants.SEARCH_TEXTBOX_ID), CommonContants.CREATE_COMPUTER_NAME);
		Utilities.clickObject(By.id(CommonContants.SEARCH_BUTTON_ID));
		Testcheck = Utilities.VerifyNavigatedPage(CommonContants.READ_MESSAGE_XPATH, CommonContants.HOME_PAGE_DONE_MESSAGE);
		
		
		//Update Computer Data		
		Utilities.clickObject(By.xpath(CommonContants.HOME_PAGE_TABLE_FIRST_ROW)); 
		AddWaitTime(CommonContants.DEFAULT_WAIT_TIME);
		Testcheck = Utilities.VerifyNavigatedPage(CommonContants.UPDATE_PAGE_XPATH, CommonContants.UPDATE_PAGE_HEADER);
		Utilities.enterTextInTextbox(By.id(CommonContants.NAME_TEXTBOX_ID), CommonContants.UPDATE_COMPUTER_NAME);
		Utilities.clickObject(By.xpath(CommonContants.UPDATE_SAVE_BUTTON_XPATH));
		
		//Delete Computer Data
		Utilities.enterTextInTextbox(By.id(CommonContants.SEARCH_TEXTBOX_ID), CommonContants.UPDATE_COMPUTER_NAME);
		Utilities.clickObject(By.id(CommonContants.SEARCH_BUTTON_ID));
		Testcheck = Utilities.VerifyNavigatedPage(CommonContants.READ_MESSAGE_XPATH, CommonContants.HOME_PAGE_DONE_MESSAGE);
		Utilities.clickObject(By.xpath(CommonContants.HOME_PAGE_TABLE_FIRST_ROW)); 
		AddWaitTime(CommonContants.DEFAULT_WAIT_TIME);
		Testcheck = Utilities.VerifyNavigatedPage(CommonContants.UPDATE_PAGE_XPATH, CommonContants.UPDATE_PAGE_HEADER);
		Utilities.clickObject(By.xpath(CommonContants.DELETE_BUTTON_XPATH));
		Testcheck = Utilities.VerifyNavigatedPage(CommonContants.DELETE_MESSAGE_XPATH, CommonContants.DELETE_PAGE_DONE_MESSAGE);
			
}

}
