package com.autdeskcrm.conatcttest;

import java.util.List;

import org.apache.commons.math3.stat.descriptive.summary.Product;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.autodeskcrm.gerericutils.BaseClass;
import com.autodestcrm.objectrepositorylib.ContactMoreInfo;
import com.autodestcrm.objectrepositorylib.Contacts;
import com.autodestcrm.objectrepositorylib.CreateProject;
import com.autodestcrm.objectrepositorylib.CreteContacts;
import com.autodestcrm.objectrepositorylib.Home;

import junit.framework.Assert;
/*
 *  Shravya Jain
 */
public class Select_a_Product_under_More_information_using_select_Product extends BaseClass{
@Test
public void select_a_Product_under_More_information_using_select_Product() throws Throwable
{
	//reading pre-condition data
	String path=fLib.getPropertyKeyValue("contactModule");
	int random=wLib.getRamDomNum();
	String firstName=excelLib.getExcelData(path, "Pre-ConditionForContactModule",1, 1)+random;
	String lastName=excelLib.getExcelData(path, "Pre-ConditionForContactModule",1, 2)+random;
	String projectName=excelLib.getExcelData(path, "Pre-ConditionForContactModule",1, 3)+random;
	
	
	//	Step:3 Navigate to contacts page
	Home home=new Home(driver);
	home.getConatctLink().click();
	//Step 4: create a contact with FirstName as Piyush
	Contacts contact=new Contacts(driver);
	contact.getcreteContactImg().click();
	CreteContacts create=new CreteContacts(driver);
	create.getFirstName().sendKeys(firstName);
	create.getLastName().sendKeys(lastName);
	create.getUserRadioBtn().click();
	create.getSaveBtn().click();
	
	//	Step 5:click on existing contact
	wLib.waitAndClickElement(driver, home.getConatctLink());
	contact.getSearchText().sendKeys(firstName);
	System.out.println(firstName);
	WebElement search=contact.getSearchIn();
	wLib.select(search, "First Name");
	contact.getSearchNowBtn().click();
	
	List<WebElement> list = driver.findElements(By.xpath("//tr[*]//td[3]//a[1]"));
	for(int i=3;i<list.size();i++)
	{
		if(list.get(i).getText().equals(firstName))
		{
			list.get(i).click();
			break;
		}
	}
	wLib.waitForPagetoLoad(driver);
	String header=contact.getSelectedContactpageHd().getText();
	System.out.println(header);
	//Verifying the contact info for given particular contact name
	Assert.assertTrue(header.contains(firstName));
	
//	click on more information
	contact.getMoreInfoLink().click();
	String moreInfo=contact.getMoreInfoHd().getText();
	Assert.assertTrue(moreInfo.contains(firstName));
	
	//Click on Project
	ContactMoreInfo mInfo=new ContactMoreInfo(driver);
	WebElement btn=mInfo.getProjectShowBtn();
	int y=btn.getLocation().getY();
	System.out.println("y axix"+y);
	String script="window.scrollTo(0,document.body.scrollHeight)";
	wLib.executeJavaScript(driver, script);
	//	click on add project
	WebElement proBtn = mInfo.getProjectShowBtn();
	proBtn.click();
WebElement addPro=	mInfo.getAddProjectBtn();
while(!addPro.isDisplayed())
{
	proBtn.click();
}
addPro.click();
	
	//	enter the following valid data
CreateProject cproject=new CreateProject(driver);
cproject.getProjectNameTxt().sendKeys(projectName);
cproject.getUserRadioBtn().click();

	//	click on save
cproject.getSaveBtn().click();

List<WebElement> proList = mInfo.getListOfproject();
String str="";
for(int i=0;i<proList.size();i++)
{
	if(proList.get(i).getText().equals(projectName))
	{
		str=proList.get(i).getText();
		break;
	}
}
Assert.assertEquals(projectName, str);
	//	Logout

	 
}
}
