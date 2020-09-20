package com.autodestcrm.objectrepositorylib;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
/**
 * 
 * @author Deepak

 *          Vidhu

 *          JeetDAs
 *          
 *          Shravya

 *
 */
public class Contacts {
	
	public Contacts(WebDriver driver) {                             //Rule 5
		   
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@alt='Create Contact...']")
	private WebElement creteContactImg;


	@FindBy(xpath="//img[@alt='delete Contact...']")
	private WebElement deleteImg;
	
	@FindBy(name="submit")
	private WebElement serachNow;
	
	@FindBy(xpath="//img[@alt='Saerch Coantact']")
	private WebElement searchImg;
	
	@FindBy(name="search_field")
	private WebElement searchInDpDn;
	
	@FindBy(name="search_text")
	private WebElement searchTextBx;
	
	@FindBy(linkText = "More Information")
	private WebElement moreInfoLk;
	
	public WebElement getSearchText()
	{
		return searchTextBx;
	}
	
	public WebElement getSearchIn()
	{
		return searchInDpDn;
	}
	public WebElement getSearchNowBtn()
	{
		return serachNow;
	}
	public WebElement getMoreInfoLink()
	{
		return moreInfoLk;
	}
	@FindBy(xpath = " //span[@class='lvtHeaderText']")
	private WebElement moreInfoHd;
	public WebElement getMoreInfoHd()
	{
		return moreInfoHd;
	}
	
	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement selectedContactpage;
	
	public WebElement getSelectedContactpageHd()
	{
		return selectedContactpage;
	}
	
	

	public WebElement getcreteContactImg() {
		return creteContactImg;
	}

}
