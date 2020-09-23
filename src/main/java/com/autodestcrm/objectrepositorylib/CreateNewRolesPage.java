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
public class CreateNewRolesPage extends WebDriverUtils{

	WebDriver driver;
	public CreateNewRolesPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "roleName")
	private WebElement roleNameBtn;

	@FindBy(id="availList")
	private WebElement selectMembers;
	
	@FindBy(name="Button")
	private WebElement forwardBtn;
	
	@FindBy(name="add")
	private WebElement saveBtn;
	
	
	public WebElement EnterRoleName(WebDriver driver)
	{
		return roleNameBtn;
	}

	public WebElement selectProfileMembers()
	{
		return selectMembers;
	}
	
	public void clickOnForwardBtn() {
		forwardBtn.click();
	}
	
	public void clickOnSaveBtn() {
		saveBtn.click();
	}
}
