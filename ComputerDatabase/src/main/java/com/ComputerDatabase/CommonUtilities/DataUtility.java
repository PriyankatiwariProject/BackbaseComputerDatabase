package com.ComputerDatabase.CommonUtilities;

public class DataUtility extends Utilities {

	public static ComputerData getComputerRecordForCreation(){
		ComputerData computerInformation = new ComputerData();
		try{
			computerInformation.setComputerName(readDataFromJsonFile("ComputerTest_Create", "computerName"));
			computerInformation.setIntroducedDate(readDataFromJsonFile("ComputerTest_Create", "introducedDate"));
			computerInformation.setDiscontinuedDate(readDataFromJsonFile("ComputerTest_Create", "discontinuedDate"));
			computerInformation.setCompany(readDataFromJsonFile("ComputerTest_Create", "company"));
		}catch(Exception ex ){
			ex.printStackTrace();
		}		
		return computerInformation;
	}
	
	public static ComputerData getComputerRecordForUpdate(){
		ComputerData computerInformation = new ComputerData();
		try{
			computerInformation.setComputerName(readDataFromJsonFile("ComputerTest_Update", "computerName"));			
		}catch(Exception ex ){
			ex.printStackTrace();
		}		
		return computerInformation;
	}

	
	
}
