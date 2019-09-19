// launchApp  : To Launch App
// closeApp   : To Close Application
// excel_Con  : To Connect excel and Sheet
// elementPresent : To verify whther the element is present or not





package com.qshore;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import jxl.Sheet;
import jxl.Workbook;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Methods {
	
	public WebDriver driver;
	public FileInputStream f;
	public Workbook wb;
	public Sheet s;
	
	// Method Name  : launchApp
	// Description  : To Launch Application
	// Author       : Kishore Kumar
	// Date Created : 09052019
	// Parameters/Arguments : Strinn url, String sspath
	// Reviewed By  : 
	//*********************************************************	
	public void launchApp(String url, String sspath) throws Exception{
		driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File(sspath));}
	//**************************************************************
	// Method Name  : closeApp
	// Description  : To Close Application
	// Author       : Kishore Kumar
	// Date Created : 09052019
	// Parameters/Arguments : Strinn url, String sspath
	// Reviewed By  : 
	//*********************************************************	
	public void closeApp(){
		driver.close();}
	//**************************************************************
	public void excel_Con(String path, String sname) throws Exception{
		f=new FileInputStream(path);
		wb=Workbook.getWorkbook(f);
		s=wb.getSheet(sname);	}
	//**************************************************************
	public void elementPresent(WebElement ele, boolean exp, String sspath) throws Exception {
		boolean element=ele.isDisplayed();
		if(element==exp)
		{
			System.out.println("Pass");
			File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, new File(sspath));
		}
		else
		{
			System.out.println("Fail");
			File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, new File(sspath));
		}
	}
	//****************************************************************(*******
	public void titleStarts(String exptext, boolean exp) {
		String title=driver.getTitle();
		if(title.startsWith(exptext)==exp)
			System.out.println("Pass");
		else
			System.out.println("Fail");
	}
	//*****************************************************
	public void urlContains(String exptext, boolean exp) {
		String url=driver.getCurrentUrl();
		if(url.contains(exptext)==exp)
			System.out.println("Pass");
		else
			System.out.println("Fail");
	}
	//*************************************************************************
	public void valuesInDropdown(WebElement element, String loc, int exp) throws Exception {
		List<WebElement> values=element.findElements(By.tagName(loc));
		if(values.size()==exp)
			System.out.println("Pass");
		else
			System.out.println("Fail");	
	}
	//*************************************************************************
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


