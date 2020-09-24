package com.autodestcrm.objectrepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.autodeskcrm.gerericutils.WebDriverUtils;

public class CurrencyPage extends WebDriverUtils {
	
	WebDriver driver;
	public CurrencyPage(WebDriver driver) {
	
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@value='New Currency']")
	private WebElement newCurrencyBtn;
	
	public void clickOnCurrency()
	{
		newCurrencyBtn.click();
	}
}
