package com.autodestcrm.objectrepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.autodeskcrm.gerericutils.WebDriverUtils;
/**
 * 
 * @author Zakarsh
 *
 */
public class CRMSettingsPage extends WebDriverUtils{
	
	WebDriver driver;
	
	public CRMSettingsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Groups')]")
	private WebElement groupsLink;
	
	@FindBy(xpath = "//a[contains(text(),'Currencies')]")
	private WebElement currencyLink;
	
	@FindBy(xpath = "//a[contains(text(),'Roles')]")
	private WebElement rolesLink;
	
	@FindBy(xpath = "//a[contains(text(),'Users')]")
	private WebElement usersLink;
	
	@FindBy(xpath = "//td[contains(text(),'Other Settings')]")
	private WebElement otherSettings;
	
	public void clickOnGroups()
	{
		groupsLink.click();
	}
	
	public void clickOnCurrencies() {
		currencyLink.click();
	}
	
	public void clickOnRoles()
	{
		rolesLink.click();
	}
	
	public void clickOnUsers()
	{
		usersLink.click();
	}
	
	public WebElement moveToOtherSettings()
	{
		return otherSettings;
	}
	
	
}
