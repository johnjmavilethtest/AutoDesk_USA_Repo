package com.autodestcrm.objectrepositorylib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.autodeskcrm.gerericutils.WebDriverUtils;
/**
 * 
 * @author Deepak
 *
 */
public class CreteContacts extends WebDriverUtils{
	
	WebDriver driver;
	public CreteContacts(WebDriver driver) {                             //Rule 5
		   this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(name="firstname")
	private WebElement frtNameEdt;
	
	@FindBy(name="lastname")
	private WebElement lstNameEdt;
	
	@FindBy(xpath="//input[@name='account_name']/following-sibling::img")
	private WebElement orgNameLookup;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;
	
	@FindBy(xpath = "//input[@name='assigntype' and @value='U']")
	private WebElement assignUserRd;
	
	@FindBy(xpath="//input[@name='assigntype' and @value='T']")
	private WebElement assignGroupRd;
	
	/**
	 * create contact with orgName
	 * @param conatctLastName
	 * @param orgData
	 * @param orgSearchFor
	 */
   public void creteConatct(String conatctLastName , String orgData ,String orgSearchFor) {
	   lstNameEdt.sendKeys(conatctLastName);
	   orgNameLookup.click();
	   switchToNewTab(driver, "specific_contact_account_address");
	   
	   Organization orgp = new Organization(driver);
	   orgp.getSearchEdt().sendKeys(orgData);
	   select(orgp.getSerchInLst(), orgSearchFor);
	   orgp.getSearchBtn().click();
	   String xpathOrgLink = "//a[text()='"+orgData+"']";
	   driver.findElement(By.xpath(xpathOrgLink)).click();
	   
	   switchToNewTab(driver, "Administrator - Contacts");
	   saveBtn.click();
   }
	/**
	 * create conatct with mandatory deatils
	 * @param conatctLastName
	 */
   public void creteConatct(String conatctLastName ) {
	   lstNameEdt.sendKeys(conatctLastName);

	   saveBtn.click();
   }
   /*
    * Last Name text field
    */
	public WebElement getLastName()
	{
		return lstNameEdt;
	}
	/*
	 * Firstname text field
	 */
   public WebElement getFirstName()
   {
	   return frtNameEdt;
   }
   /*
    * User Radio button
    */
   
   public WebElement getUserRadioBtn()
   {
	   return assignUserRd;
   }
   /*
    * Group radio button
    */
   public WebElement getGroupRadioBtn()
   {
	   return assignGroupRd;
   }
   /*
    * Save button
    */
   public WebElement getSaveBtn()
   {
	   return saveBtn;
   }
}
