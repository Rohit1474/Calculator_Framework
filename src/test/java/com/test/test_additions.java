package com.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com.Pageobject.Pom_Identify;
import Com.Utility.BaseClass;

public class test_additions  extends BaseClass{
@Test
public void verify_Addition() {
	Pom_Identify addition= PageFactory.initElements(driver,Pom_Identify.class );
	addition.getSubstrat().click();
	addition.getTwo().click();
	addition.getThree().click();
	addition.getFour().click();
	addition.getTwo().click();
	addition.getThree().click();
	addition.getFour().click();
	addition.getAdd().click();
	addition.getThree().click();
	addition.getFour().click();
	addition.getFive().click();
	addition.getThree().click();
	addition.getFour().click();
	addition.getFive().click();
	//addition.getAC().click();
}
}
