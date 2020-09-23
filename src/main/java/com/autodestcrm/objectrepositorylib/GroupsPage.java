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
public class GroupsPage extends WebDriverUtils{

	WebDriver driver;
	public GroupsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//input[@title='New Group']")
	private WebElement newGroupBtn;
	
	public void clickOnNewGroup()
	{
		newGroupBtn.click();
	}
}
