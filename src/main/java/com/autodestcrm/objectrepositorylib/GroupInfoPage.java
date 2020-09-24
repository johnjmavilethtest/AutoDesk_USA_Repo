package com.autodestcrm.objectrepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.autodeskcrm.gerericutils.WebDriverUtils;

public class GroupInfoPage extends WebDriverUtils {
	
	WebDriver driver;
	public GroupInfoPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//title[contains(text(),'Commercial Open Source CRM')]")
	private WebElement title;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement signOut;
	
	public WebElement getGroupSucessfullMsgText() {
		return title;
	}
	
	public WebElement signOut() {
		return signOut;
	}
}
