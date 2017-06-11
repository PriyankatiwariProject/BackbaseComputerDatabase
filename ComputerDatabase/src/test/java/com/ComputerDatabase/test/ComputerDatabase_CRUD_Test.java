package com.ComputerDatabase.test;

import org.junit.Assert;
import org.openqa.selenium.By;


import com.ComputerDatabase.CommonContant.CommonContants;
import com.ComputerDatabase.CommonUtilities.Utilities;
import com.ComputerDatabase.CommonUtilities.ComputerData;

public class ComputerDatabase_CRUD_Test extends  Utilities {
	
	
	/*
	 * Step1 : Initialize Browser
	 * Step2 : Create ComputerName
	 * Step3 : View Computer Details
	 * Step4 : Update Computer Name , introducedDate and Discontinued Date and save
	 * Step5 : Delete the Computer Detail
	 * 	 * */

	public Boolean Val;
	
	public void LaunchApplication ()
	{
		LaunchApplication(CommonContants.TestBrowser);		
		AddWaitTime(CommonContants.DEFAULT_WAIT_TIME);		
		Assert.assertTrue(Utilities.VerifyNavigatedPage(CommonContants.HOMEPAGE_LOAD_XPATH, CommonContants.ADD_COMPUTER_HEADER));
		// Click on Add ComputerName

		Utilities.clickObject(By.id(CommonContants.CREATE_BUTTON_XPATH));
		AddWaitTime(CommonContants.DEFAULT_WAIT_TIME);
		Utilities.enterTextInTextbox(By.id(CommonContants.NAME_TEXTBOX_ID), ComputerData.getComputerName());
		Utilities.enterTextInTextbox(By.id(CommonContants.INTRODATE_TEXTBOX_ID), ComputerData.getIntroducedDate());
		Utilities.enterTextInTextbox(By.id(CommonContants.DISCONTINUE_TEXTBOX_ID), ComputerData.getDiscontinuedDate());
		Utilities.clickObject(By.id(CommonContants.CREATE_BUTTON_XPATH));
		AddWaitTime(CommonContants.DEFAULT_WAIT_TIME);
		
		Assert.assertTrue(Utilities.VerifyNavigatedPage(CommonContants.HOMEPAGE_LOAD_XPATH, CommonContants.HOME_PAGE_DONE_MESSAGE));
		
		
		
		
		
		
		
		
		
	}
	
}
