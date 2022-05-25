package com.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com.Pageobject.Pom_Identify;
import Com.Utility.BaseClass;

public class test_divide extends BaseClass {
@Test
public void Verify_Division() {
	Pom_Identify divide= PageFactory.initElements(driver, Pom_Identify.class );
	
	divide.getFour().click();
	divide.getZero().click();
	divide.getZero().click();
	divide.getZero().click();
	divide.getDivide().click();
	divide.getTwo().click();
	divide.getZero().click();
	divide.getZero().click();
	//divide.getAC().click();
}
}
