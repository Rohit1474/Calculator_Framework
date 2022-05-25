package com.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com.Pageobject.Pom_Identify;
import Com.Utility.BaseClass;

public class test_substract extends BaseClass{
	@Test
	public void verify_Substration() {
	Pom_Identify substract= PageFactory.initElements(driver,Pom_Identify.class);
	substract.getTwo().click();
	substract.getThree().click();
	substract.getFour().click();
	substract.getEight().click();
	substract.getTwo().click();
	substract.getThree().click();
	substract.getSubstrat().click();
	substract.getSubstrat().click();
	substract.getTwo().click();
	substract.getThree().click();
	substract.getZero().click();
	substract.getNine().click();
	substract.getFour().click();
	substract.getEight().click();
	substract.getTwo().click();
	substract.getThree().click();
	//substract.getAC().click();
}}

