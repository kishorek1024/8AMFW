package com.kishore;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qshore.Methods;
import com.qshore.PO_HomePage;
import com.qshore.PO_IAmFresherPage;

public class MCD_Module1 {
	
	// Test Name      : MCD_Mod1_TC01
	// Test Case Name : MCD_Mod1_TC01
	// Module Name    : Module1
	// Project Name   : MCD
	// Author         : Kishore Kumar
	// Date           : 09062019
	// Reviewd By	  : Mouli
	//******************************************
	public void MCD_Mod1_TC01() throws Exception {
		
		// Importing Methods Class
		Methods m=new Methods();
		
		// Importing Excel_Con Method
		m.excel_Con("C:\\Users\\DELL\\Desktop\\8FW\\Test Data\\Kishore\\Module1\\MCD_Mod1_TC01\\TC01.xls", "Sheet1");
		
		// Launching Application
		m.launchApp(m.s.getCell(0, 0).getContents(), "C:\\Users\\DELL\\Desktop\\8FW\\Test Results Or Test Logs\\Kishore\\Mod1\\TC01\\launchApp.png");
		
		// Importing PageObjects
		PO_HomePage homepage=PageFactory.initElements(m.driver, PO_HomePage.class);
		
		// Verifying I Am Fresher and Experienced Elements
		m.elementPresent(homepage.HomePage_IAMFresher, true, "C:\\Users\\DELL\\Desktop\\8FW\\Test Results Or Test Logs\\Kishore\\Mod1\\TC01\\IAMFresher.png");
		m.elementPresent(homepage.HomePage_IAMProf, true, "C:\\Users\\DELL\\Desktop\\8FW\\Test Results Or Test Logs\\Kishore\\Mod1\\TC01\\IAMProf.png");
		
		// Verifying Title startswith
		m.titleStarts("n", true);
		
		// Clicking On IAMFresher Button
		homepage.HomePage_IAMFresher.click();
		
		// Importing WebdriverWait
		WebDriverWait ww=new WebDriverWait(m.driver, 30);
		
		// Waiting for page to load
		ww.until(ExpectedConditions.urlContains("basicdetails"));
		
		// Verifying URL Contains
		m.urlContains("basicdetails",true);
		
		//m.valuesInDropdown(homepage.HomePage_IAMFresher, "option", 20);
		
		// Importing IAM Fresher Page Objects
		PO_IAmFresherPage IAMFresher=PageFactory.initElements(m.driver, PO_IAmFresherPage.class);
		
		// Entering Name and Emp ID
		IAMFresher.IamFresher_Name.sendKeys(m.s.getCell(0, 1).getContents());
		IAMFresher.IAMFresher_Email.sendKeys(m.s.getCell(0, 2).getContents());
		
		// Closing App
		m.closeApp();	
		
	}
	//****************************************************************************************
	
}
