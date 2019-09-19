
// Page Name     : Home Page
// Module Name   : Module1
// Project Name  : MCD
// Author        : Kishore Kumar
// Date Created  : 09062019
// Reviewed By   : 
//***************************************************************************
package com.qshore;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PO_HomePage {
	
	public @FindBy(xpath="//button[@title='I am a Fresher']") WebElement HomePage_IAMFresher;
	public @FindBy(xpath="//button[@title='I am a Professional']") WebElement HomePage_IAMProf;
	

}
