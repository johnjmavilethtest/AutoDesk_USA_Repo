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
	
	@FindBy(xpath="//b[text()='Copy Mailing Address']/../input")
	private WebElement copyMailingAddressRbtn;
	
	@FindBy(xpath="//b[text()='Copy Other Address']/../input")
	private WebElement copyOtherAddressRbtn;
	
	@FindBy(name="mailingstreet")
	private WebElement mailingstreetTxa;
	
	@FindBy(name="otherstreet")
	private WebElement otherStreetTxa;
	
	@FindBy(xpath = "//input[@name='otherstate']")
	private WebElement otherState;
	
	@FindBy(xpath = "//input[@name='otherzip']")
	private WebElement otherpostalCode;
	
	@FindBy(xpath = "//input[@name='othercity']")
	private WebElement otherCity;
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
   
   public WebElement enterOtherCity(WebDriver driver)
	{
		return otherCity;
	}
   
   public WebElement enterOtherpostalCode(WebDriver driver)
	{
		return otherpostalCode;
	}
   public WebElement enterOtherState(WebDriver driver)
	{
		return otherState;
	}
public WebElement getCopyMailingAddressRbtn() {
	return copyMailingAddressRbtn;
}
public void setCopyMailingAddressRbtn(WebElement copyMailingAddressRbtn) {
	this.copyMailingAddressRbtn = copyMailingAddressRbtn;
}
public WebElement getCopyOtherAddressRbtn() {
	return copyOtherAddressRbtn;
}
public void setCopyOtherAddressRbtn(WebElement copyOtherAddressRbtn) {
	this.copyOtherAddressRbtn = copyOtherAddressRbtn;
}
public WebElement getMailingstreetTxa() {
	return mailingstreetTxa;
}
public void setMailingstreetTxa(WebElement mailingstreetTxa) {
	this.mailingstreetTxa = mailingstreetTxa;
}
public WebElement getOtherStreetTxa() {
	return otherStreetTxa;
}
public void setOtherStreetTxa(WebElement otherStreetTxa) {
	this.otherStreetTxa = otherStreetTxa;
}

@FindBy(xpath = "//span[@class='lvtHeaderText']")
private WebElement verifyCreateContactPage;

public WebElement VerifyCreateContactPage()
{
	return verifyCreateContactPage;
}

@FindBy(name="salutationtype")
private WebElement firstNameSalutation;

@FindBy(xpath= "//input[@id='jscal_field_birthday']")
private WebElement birthDateTxb;

public WebElement clickOnSalutationDropDown()
{
	return firstNameSalutation;
}

public WebElement ClickOnBirthDate() {
	return birthDateTxb;
}


}
