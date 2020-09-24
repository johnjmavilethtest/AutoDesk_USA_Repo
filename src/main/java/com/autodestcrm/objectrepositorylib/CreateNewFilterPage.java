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
public class CreateNewFilterPage extends WebDriverUtils{
	
	WebDriver driver;
	public CreateNewFilterPage(WebDriver driver) {                             //Rule 5
		   
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//input[@class='detailedViewTextBox']")
	private WebElement viewNameTxb;
	
	public WebElement EnterViweName(WebDriver driver)
	{
		return viewNameTxb;
	}

	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;
	
	public void clickOnSaveBtn()
	{
		saveBtn.click();
	}
}
