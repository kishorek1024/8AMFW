package com.qshore;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PO_IAmFresherPage {
	
	public @FindBy(xpath="//input[@id='fname']") WebElement IamFresher_Name;
	public @FindBy(xpath="//input[@id='email']") WebElement IAMFresher_Email;
	
	

}
