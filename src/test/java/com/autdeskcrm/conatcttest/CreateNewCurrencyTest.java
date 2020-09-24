package com.autdeskcrm.conatcttest;

import org.testng.annotations.Test;

import com.autodeskcrm.gerericutils.BaseClass;
import com.autodestcrm.objectrepositorylib.CRMSettingsPage;
import com.autodestcrm.objectrepositorylib.CreateNewCurrencyPage;
import com.autodestcrm.objectrepositorylib.CurrencyPage;
import com.autodestcrm.objectrepositorylib.Home;

/**
 * 
 * @author Zakarsh
 * @throws Throwable
 */
public class CreateNewCurrencyTest extends BaseClass{

	/*Test case-65*/
	@Test
	public void CreateNewCurrency() throws Throwable
	{
		String currencyName=excelLib.getExcelData("./testData/ContactModule.xlsx", "TC_61-70", 12, 3);
		String converRate=excelLib.getExcelData("./testData/ContactModule.xlsx", "TC_61-70", 13, 3);
		
		/*step1: navigate to home page and click on settings*/
		Home h=new Home(driver);
		h.settings();
		h.clickOnCRMSettings();
		
		/*step2:click on currency*/
		CRMSettingsPage sp=new CRMSettingsPage(driver);
		wLib.moveMouseToElemnet(driver,sp.moveToOtherSettings());
		sp.clickOnCurrencies();

		/* step3: click on create new currency button*/
		CurrencyPage cp=new CurrencyPage(driver);
		cp.clickOnCurrency();
		
		/*create currency with mandatory fields*/
		CreateNewCurrencyPage ncp=new CreateNewCurrencyPage(driver);
		ncp.select(ncp.selectCurrencyName(), currencyName);
		ncp.enterCurrencyRate(driver).sendKeys(converRate);;
		ncp.clickOnSaveBtn();
		
		
	}
}
