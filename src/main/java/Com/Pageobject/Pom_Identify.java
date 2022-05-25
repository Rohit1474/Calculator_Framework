package Com.Pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Pom_Identify {
	@FindBy( how=How.XPATH,using="//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[1]")
	private WebElement zero;
	@FindBy( how=How.XPATH,using="//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[2]")
	private WebElement two;
	@FindBy( how=How.XPATH,using="//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[3]")
	private WebElement three;
	@FindBy( how=How.XPATH,using="//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[1]")
	private WebElement four;
	@FindBy( how=How.XPATH,using="//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[2]")
	private WebElement five;
	@FindBy( how=How.XPATH,using="//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[2]")
	private WebElement eight;
	@FindBy( how=How.XPATH,using="//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[3]")
	private WebElement nine;
	@FindBy( how=How.XPATH,using="//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[3]")
	private WebElement AC;
	@FindBy( how=How.XPATH,using="//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[4]")
	private WebElement add;
	@FindBy( how=How.XPATH,using="//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[4]")
	private WebElement divide;
	@FindBy( how=How.XPATH,using="//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[4]")
	private WebElement multiply;
	@FindBy( how=How.XPATH,using="//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[4]")
	private WebElement substrat;
	public WebElement getZero() {
		return zero;
	}
	
	public WebElement getTwo() {
		return two;
	}
	
	public WebElement getThree() {
		return three;
	}
	
	public WebElement getFour() {
		return four;
	}
	
	public WebElement getFive() {
		return five;
	}
	
	public WebElement getEight() {
		return eight;
	}
	
	public WebElement getNine() {
		return nine;
	}
	
	public WebElement getAC() {
		return AC;
	}
	
	public WebElement getAdd() {
		return add;
	}
	
	public WebElement getDivide() {
		return divide;
	}
	
	public WebElement getMultiply() {
		return multiply;
	}
	
	public WebElement getSubstrat() {
		return substrat;
	}
	
}
