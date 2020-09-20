package com.autodestcrm.objectrepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.autodeskcrm.gerericutils.WebDriverUtils;
/*
 * @author Shravya 
 */
public class CreateProject extends WebDriverUtils{

	WebDriver driver;
	public CreateProject(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name="projectname")
	public WebElement projectNameTxt;
	
	public WebElement getProjectNameTxt()
	{
		return projectNameTxt;
	}
	
	@FindBy(xpath = "//input[@name='assigntype' and @value='U']")
	private WebElement userRadioBtn;
	
	public WebElement getUserRadioBtn()
	{
		return userRadioBtn;
	}
	@FindBy(xpath="//input[@value='  Save  ']")
	private WebElement saveBtn;
	
	public WebElement getSaveBtn()
	{
		return saveBtn;
	}
}
