package com.autdeskcrm.conatcttest;

import org.testng.annotations.Test;

import com.autodeskcrm.gerericutils.BaseClass;
import com.autodestcrm.objectrepositorylib.Contacts;
import com.autodestcrm.objectrepositorylib.CreteContacts;
import com.autodestcrm.objectrepositorylib.Home;

public class CopyOtherAddressTest extends BaseClass {

	@Test
	public void CopyOtherAddress() throws Throwable 
	{

		/*step1: Navigate to contacts page*/
		Home h=new Home(driver);
		h.getConatctLink().click();
		
		/*Step2: click on search Now button*/
		Contacts c=new Contacts(driver);
		c.getcreteContactImg().click();
		
		CreteContacts cc = new CreteContacts(driver);
		cc.getCopyOtherAddressRbtn().click();
		cc.getOtherStreetTxa().sendKeys("palaceRoad"+wLib.getRamDomNum());
		cc.enterOtherState(driver).sendKeys("Kerala"+wLib.getRamDomNum());
		cc.enterOtherCity(driver).sendKeys("Thrissur"+wLib.getRamDomNum());
		cc.enterOtherpostalCode(driver).sendKeys("680624"+wLib.getRamDomNum());
	}
}
