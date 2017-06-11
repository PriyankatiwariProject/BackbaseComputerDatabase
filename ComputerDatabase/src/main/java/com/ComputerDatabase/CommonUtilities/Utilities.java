package com.ComputerDatabase.CommonUtilities;



import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.ComputerDatabase.CommonContant.CommonContants;
import com.steadystate.css.parser.ParseException;

public class Utilities {
	
	
	public static WebDriver driver;
	
	
	public void LaunchApplication(String BrowserName)
	{
				
		
		if ((CommonContants.CHROME_BROWSER).equalsIgnoreCase(BrowserName)) {

			driver = new ChromeDriver();

		} else if ((CommonContants.IE_BROWSER).equalsIgnoreCase(BrowserName)) {

			driver = new InternetExplorerDriver();

		} else if ((CommonContants.FIREFOX_BROWSER).equalsIgnoreCase(BrowserName)) {

			driver = new FirefoxDriver();

		}
		
		driver.get(CommonContants.AppURL);	
		AddWaitTime(CommonContants.DEFAULT_WAIT_TIME);
		
		
		
	}	
	
	public static String readDataFromJsonFile(String testName, String key) throws IOException, ParseException, org.json.simple.parser.ParseException {
		File file = new File(CommonContants.INPUT_DATA_JSON_FILE_PATH);
		
		FileInputStream fileInputStream = new FileInputStream(file);
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
		JSONParser jParser = new JSONParser();
		JSONObject jFileObj = (JSONObject) jParser.parse(inputStreamReader);
		JSONObject jDataObj = (JSONObject) jFileObj.get(testName);
		String value = (String) jDataObj.get(key);
		return value;
	}
	
	
	
	
	
	
	public static void clearWebElement(WebElement webElement) {
		webElement.clear();
	}

	
	public static void enterTextInTextbox(By locator, String text) {
		Utilities.AddWaitTime(CommonContants.DEFAULT_WAIT_TIME);
		WebElement webElement = driver.findElement(locator);
		if (!webElement.getAttribute("value").isEmpty() || !webElement.getText().isEmpty()) {
			clearWebElement(webElement);
		}
		webElement.sendKeys(text);
	}
	
	public static boolean VerifyNavigatedPage(String xpathForPageTitle, String expectedPageTitle) {

		try {

			AddWaitTime(CommonContants.DEFAULT_WAIT_TIME);
			String actualPageTitle = driver.findElement(By.xpath(xpathForPageTitle)).getText();
			if (actualPageTitle != null) {
				actualPageTitle = actualPageTitle.trim();
			}
			if (!expectedPageTitle.equalsIgnoreCase(actualPageTitle)) {
				return false;

			}
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
		return true;
	}
	
	public static void clickObject(By locator) {
		
		Utilities.AddWaitTime(CommonContants.DEFAULT_WAIT_TIME);
		WebElement webElement = driver.findElement(locator);
		webElement.click();
	}
	
	
	public static void AddWaitTime(int time)
	{
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
		
	}
	
	public void AssignData()
	{
		
	}
	
	

}
