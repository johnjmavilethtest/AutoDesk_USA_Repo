package com.autdeskcrm.conatcttest;

import org.testng.annotations.Test;

import com.autodeskcrm.gerericutils.BaseClass;
import com.autodestcrm.objectrepositorylib.Contacts;
import com.autodestcrm.objectrepositorylib.CreateNewFilterPage;
import com.autodestcrm.objectrepositorylib.Home;
/**
 * 
 * @author Zakarsh
 *
 */
public class CreateFilter extends BaseClass{

	@Test
	public void CreateNewFilter() throws Throwable
	{
//		String viewName=excelLib.getExcelData("./testData/ContactModule.xlsx","TC_61-70", 23, 3)+"_"+wLib.getRamDomNum();
//		String viewName1=excelLib.getExcelData("./testData/ContactModule.xlsx","TC_61-70", 24, 3)+"_"+wLib.getRamDomNum();
		
		Home h=new Home(driver);
		h.getConatctLink().click();
		
		Contacts c=new Contacts(driver);
		c.clickOnFilterLnk();
		
		CreateNewFilterPage nfp=new CreateNewFilterPage(driver);
		nfp.EnterViweName(driver).sendKeys("sam"+"_"+wLib.getRamDomNum());
		nfp.clickOnSaveBtn();
		
		Contacts c1=new Contacts(driver);
		c1.clickOnFilterLnk();
		
		CreateNewFilterPage nfp1=new CreateNewFilterPage(driver);
		nfp1.EnterViweName(driver).sendKeys("saigun"+"_"+wLib.getRamDomNum());
		nfp1.clickOnSaveBtn();
		
		
	}
}
