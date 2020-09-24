package com.autodestcrm.objectrepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.autodeskcrm.gerericutils.WebDriverUtils;

public class UsersPage extends WebDriverUtils{
	
	WebDriver driver;
	public UsersPage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath = "//input[@title='New User [Alt+N]']")
	private WebElement newUserBtn;

	public void clickOnNewUserBtn() {
		newUserBtn.click();
	}
	
}
