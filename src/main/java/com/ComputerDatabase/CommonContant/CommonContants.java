package com.ComputerDatabase.CommonContant;



public class CommonContants {
	
	
		// Browser Types
			public static final String FIREFOX_BROWSER = "FIREFOX";
			public static final String CHROME_BROWSER = "CHROME";
			public static final String IE_BROWSER = "IE";
			
			//URL
			public static final String AppURL = "http://computer-database.herokuapp.com/computers";
			
			//TestBrowser
			public static final String TestBrowser = "CHROME";
			
			//Path for chrome driver
			public static final String PathChromeDriver ="chromedriver.exe";
			public static final String PathIEDriver ="IEDriverServer.exe.exe";
					
			//Default waiting Time
			public static final int DEFAULT_WAIT_TIME = 5;
			
			//Application Properties & Object Locator information 
			public static final String APPLICATION_PROPERTIES_FILE_PATH = "src\\test\\resource\\application_file.properties";	
			public static final String OBJECT_LOCATOR_FILE_PATH = "src\\test\\resource\\Object_Locator.properties";
			
			//Input Test Data
			public static final String INPUT_DATA_JSON_FILE_PATH = "src\\test\\resource\\Input_Data.json";
			
			//Application page headers
			public static final String HOME_PAGE_HEADER="Play sample application — Computer database";
			public static final String ADD_COMPUTER_HEADER = "Add a computer";
			public static final String HOME_PAGE_DONE_MESSAGE= "Done!";
			public static final String UPDATE_PAGE_HEADER= "Edit computer";
			public static final String DELETE_PAGE_DONE_MESSAGE="Done!";
			public static final String READ_PAGE_NOT_DONE_MESSAGE="No computers found";
			
		
			
			//XPath for Application
			public static final String HOMEPAGE_TITLE_XPATH="//h1/a[contains(text(),'Computer database')]";
			public static final String HOMEPAGE_LOAD_XPATH="//strong[text()='Done!']";
			public static final String SEARCH_TEXTBOX_ID="searchbox";
			public static final String SEARCH_BUTTON_ID="searchsubmit";
			public static final String COMPUTER_TABLE_XPATH="//*[@id='main']/table/tbody";
			public static final String ADD_BUTTON_ID="add";
			public static final String NAME_TEXTBOX_ID="name";
			public static final String INTRODATE_TEXTBOX_ID="introduced";
			public static final String DISCONTINUE_TEXTBOX_ID="discontinued";
			public static final String COMPANY_ID="company";
			public static final String CREATE_BUTTON_XPATH="//input[@value='Create this computer']";
			public static final String CREATE_PAGE_HEADER_XPATH="//a[text()='Cancel']";
			public static final String READ_MESSAGE_XPATH="//*[@id=\"main\"]/h1";
			public static final String UPDATE_PAGE_XPATH="//*[@id=\"main\"]/h1";
			public static final String UPDATE_SAVE_BUTTON_XPATH="//input[@value='Save this computer']";
			public static final String DELETE_BUTTON_XPATH="//*[@id=\"main\"]/form[2]/input";
			public static final String DELETE_MESSAGE_XPATH="//*[@id=\"main\"]/div[1]/strong";
			public static final String CREATE_COMPUTER_NAME="HPE3883847483";
			public static final String UPDATE_COMPUTER_NAME="APPLE38493";
			public static final String CREATE_INTRODUCED_DATE="2011-06-01";
			public static final String CREATE_DISCONTINUED_DATE="2017-07-11";
			public static final String CREATE_COMPANY="3";
			public static final String HOME_PAGE_TABLE_FIRST_ROW="//*[@id='main']/table/tbody/tr[1]/td[1]/a";
			
			
			
//			/read_message_Xpath
			
			
			
			
			
			
			
			
			
			
			
	

}
