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
public class CreateNewGroupPage extends WebDriverUtils{

	WebDriver driver;
	
	public CreateNewGroupPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='groupName']")
	private WebElement groupNameTxb;
	
	@FindBy(id="availList")
	private WebElement membersOfEntityTextSelectArea;
	
	@FindBy(xpath = "//input[@onClick='addColumn()']")
	private WebElement addColmnBtn;
	
	@FindBy(name="add")
	private WebElement addGrpBtn;
	
	public WebElement grpName()
	{
		return groupNameTxb;
	}
	
	public WebElement EnterGroupName(String groupName)
	{
		groupNameTxb.sendKeys(groupName);
		return groupNameTxb;
	}
	
	public WebElement selectEntity()
	{
		return membersOfEntityTextSelectArea;
	}
	 
	public void clickOnAddColmnBtn() {
			addColmnBtn.click();
		}
	
	public  WebElement clickOnAddGroupBtn() {
		addGrpBtn.click();
		return addColmnBtn;
	}



}
