package com.autodestcrm.objectrepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.autodeskcrm.gerericutils.WebDriverUtils;

public class RolesPage extends WebDriverUtils{

	WebDriver driver;
	public RolesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//div[@class='drag_Element'])[1]")
	private WebElement createRoleBtn;
	
	public WebElement clickOnCreateRolesBtn()
	{
		return createRoleBtn;
	}
	

	
	
	
}
