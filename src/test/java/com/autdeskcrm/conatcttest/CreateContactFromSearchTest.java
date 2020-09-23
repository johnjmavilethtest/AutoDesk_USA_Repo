package com.autdeskcrm.conatcttest;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.autodeskcrm.gerericutils.BaseClass;
import com.autodestcrm.objectrepositorylib.CoantctInfoPage;
import com.autodestcrm.objectrepositorylib.Contacts;
import com.autodestcrm.objectrepositorylib.CreteContacts;
import com.autodestcrm.objectrepositorylib.Home;

import junit.framework.Assert;

/**
 * @author Zakarsh
 * @throws Throwable
 */

public class CreateContactFromSearchTest extends BaseClass{

	/*Test case number 61*/

	@Test
	public void createContactFromSearch() throws Throwable
	{
		/*Test script data*/
		String contactName = excelLib.getExcelData("./testData/ContactModule.xlsx", "TC_61-70", 1, 3)+"_"+wLib.getRamDomNum();
		String successMsg=excelLib.getExcelData("./testData/ContactModule.xlsx", "TC_61-70", 2, 4);
		
		/*step1: Navigate to contacts page*/
		Home h=new Home(driver);
		h.VerifyHomePage();
		
		h.getConatctLink().click();
		
		/*Step2: click on search Now button*/
		Contacts c=new Contacts(driver);
		c.VerifyContactPage();
		c.getSearchNowBtn().click();
		c.noContactsFoundText();
		
		/*create new contact with mandatory inputs*/
		c.getcreteContactImg().click();
		CreteContacts cc=new CreteContacts(driver);
		cc.VerifyCreateContactPage();
		cc.creteConatct(contactName);
		
		/*verify the created contact*/
		CoantctInfoPage ci=new CoantctInfoPage(driver);
		String conSucc=ci.getContSucessfullMsgText().getText();
		Assert.assertTrue(conSucc.contains(successMsg));
		
	}

}
