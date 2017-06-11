package com.ComputerDatabase.CommonUtilities;

/*
 * Getter & Setters
 * 
 * Author : Priyanka
 * */

public class ComputerData {

	public static  String ComputerName;
	public static String IntroducedDate;
	public static String discontinuedDate;
	private static String Company;
	
	public static String getComputerName() {
		return ComputerName;
	}

	public void setComputerName(String computerName) {
		ComputerData.ComputerName = computerName;
	}

	public static String getIntroducedDate() {
		return IntroducedDate;
	}

	public void setIntroducedDate(String introducedDate) {
		ComputerData.IntroducedDate = introducedDate;
	}

	public  static String getDiscontinuedDate() {
		return discontinuedDate;
	}

	public void setDiscontinuedDate(String discontinuedDate) {
		ComputerData.discontinuedDate = discontinuedDate;
	}

	public String getCompany() {
		return Company;
	}

	public void setCompany(String company) {
		ComputerData.Company = company;
	}

	

}
