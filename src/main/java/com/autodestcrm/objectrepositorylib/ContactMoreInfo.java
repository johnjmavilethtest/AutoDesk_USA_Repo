package com.autodestcrm.objectrepositorylib;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.autodeskcrm.gerericutils.WebDriverUtils;
/*
 * @Author Shravya
 */
public class ContactMoreInfo extends WebDriverUtils{

	WebDriver driver;
	public ContactMoreInfo(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//input[@title='Add Project']")
	private WebElement addProjectBtn;
	
	public WebElement getAddProjectBtn()
	{
		return addProjectBtn;
	}
	@FindBy(xpath="//img[@id='show_Contacts_Projects']")
	private WebElement projectShowBtn;
	
	public WebElement getProjectShowBtn()
	{
		return projectShowBtn;
	}
	@FindBy(xpath = "//a[contains(@onclick,'Contacts_Projects')]/../../../tr[*]/td")
	private List<WebElement> listOfProject;
	
	public List<WebElement> getListOfproject()
	{
		return listOfProject;
	}
	
}
