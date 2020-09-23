package com.autdeskcrm.conatcttest;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.autodeskcrm.gerericutils.BaseClass;
import com.autodestcrm.objectrepositorylib.Contacts;
import com.autodestcrm.objectrepositorylib.CreteContacts;
import com.autodestcrm.objectrepositorylib.Home;

/**
 * 
 * @author Zakarsh
 *@throws Throwable
 */
public class SelectSalutionFromDropDownInCreateContactTest extends BaseClass {

	/*Test case number 62*/

	@Test
	public void selectSalutionFromDropDown() throws Throwable 
	{
		String salutation=excelLib.getExcelData("./testData/ContactModule.xlsx", "TC_61-70", 4, 3);
		
		/*step1: Navigate to contacts page*/
		Home h=new Home(driver);
		h.VerifyHomePage();
		h.getConatctLink().click();
		
		/*Step2: click on search Now button*/
		Contacts c=new Contacts(driver);
		c.getcreteContactImg().click();
		c.VerifyContactPage();
		
		/*step3: Select salutation from dropdown*/
		CreteContacts cc=new CreteContacts(driver);
		WebElement salut=cc.clickOnSalutationDropDown();
		wLib.select(salut, salutation);
		
	}
	
}
