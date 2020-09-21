package com.autdeskcrm.conatcttest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.autodeskcrm.gerericutils.BaseClass;
import com.autodestcrm.objectrepositorylib.CoantctInfoPage;
import com.autodestcrm.objectrepositorylib.Contacts;
import com.autodestcrm.objectrepositorylib.CreteContacts;
import com.autodestcrm.objectrepositorylib.Home;


public class CreateContactWithCopyOtherAddress extends BaseClass
{
	
	/**
	 * 	author Fayaz
	 * @throws Throwable 
	 */
	
	@Test
	public void ContactWithCopyMailingAddress() throws Throwable
	{
		Home h= new Home(driver);
		Contacts c = new Contacts(driver);
		CreteContacts cc = new CreteContacts(driver);
		CoantctInfoPage ci = new CoantctInfoPage(driver);
		
		h.getConatctLink().click();
		c.getcreteContactImg().click();
		cc.getLastName().sendKeys(excelLib.getExcelData("./testData/ContactModule.xlsx", "TC_101-110", 5, 3)+wLib.getRamDomNum()+"");
		cc.getCopyOtherAddressRbtn().click();
		cc.getOtherStreetTxa().sendKeys(excelLib.getExcelData("./testData/ContactModule.xlsx", "TC_101-110", 6, 3));
		cc.getSaveBtn().click();
		String sucMsg = ci.getContSucessfullMsgText().getText();
		Assert.assertTrue(sucMsg.contains(excelLib.getExcelData("./testData/ContactModule.xlsx", "TC_101-110", 7, 4)));
	}
}
