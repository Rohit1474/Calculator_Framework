package com.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com.Pageobject.Pom_Identify;
import Com.Utility.BaseClass;

public class test_multiply extends BaseClass{
	@Test
	public void Verify_Multiplication() {
		Pom_Identify multiply= PageFactory.initElements(driver, Pom_Identify.class);
		multiply.getFour().click();
		multiply.getTwo().click();
		multiply.getThree().click();
		multiply.getMultiply().click();
		multiply.getFive().click();
		multiply.getTwo().click();
		multiply.getFive().click();
		//multiply.getAC().click();
	}

}
