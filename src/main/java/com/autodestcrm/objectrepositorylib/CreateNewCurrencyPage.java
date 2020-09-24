package com.autodestcrm.objectrepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.autodeskcrm.gerericutils.WebDriverUtils;

public class CreateNewCurrencyPage extends WebDriverUtils{

	WebDriver driver;
	public CreateNewCurrencyPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="currency_name")
	private WebElement currencyNameTxb;
	
	@FindBy(name = "conversion_rate")
	private WebElement conversionRareTxb;
	
	@FindBy(xpath = "//input[@title='Save']")
	private WebElement saveBtn;
	
	public WebElement selectCurrencyName()
	{
		return currencyNameTxb;
	}
	
	public WebElement enterCurrencyRate(WebDriver driver) {
		return conversionRareTxb;
	}
	
	public void clickOnSaveBtn() {
		saveBtn.click();
	}
	
}
