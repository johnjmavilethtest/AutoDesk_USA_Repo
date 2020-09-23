package com.autdeskcrm.conatcttest;
import org.testng.annotations.Test;

import com.autodeskcrm.gerericutils.BaseClass;
import com.autodestcrm.objectrepositorylib.Contacts;
import com.autodestcrm.objectrepositorylib.CreteContacts;
import com.autodestcrm.objectrepositorylib.Home;
/**
 * 
 * @author Zakarsh
 * @throws Throwable
 */
public class EnterBirthDateSameAsCurrentDateTest extends BaseClass{

	/*Test case 63*/
	
	@Test
	public void EnterBirthDateSameAsCurrentDate() throws Throwable
	{
		
		//String BirthDate=excelLib.getExcelData("./testData/ContactModule.xlsx", "TC_61-70", 8,3);

		/*step1: Navigate to contacts page*/
		Home h=new Home(driver);
		h.VerifyHomePage();
		h.getConatctLink().click();
		
		/*Step2: click on search Now button*/
		Contacts c=new Contacts(driver);
		c.getcreteContactImg().click();
		c.VerifyContactPage();
		
		/*step3: Enter birth date same as current date*/
		CreteContacts cc=new CreteContacts(driver);
		cc.ClickOnBirthDate().sendKeys(wLib.CalenderSelect(driver));
		cc.getSaveBtn();
		wLib.waitAndClickElement(driver, cc.getSaveBtn());
		wLib.alertOk(driver);
		
		
	}
}
