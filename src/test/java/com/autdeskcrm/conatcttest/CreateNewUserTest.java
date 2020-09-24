package com.autdeskcrm.conatcttest;
import org.testng.annotations.Test;

import com.autodeskcrm.gerericutils.BaseClass;
import com.autodestcrm.objectrepositorylib.CRMSettingsPage;
import com.autodestcrm.objectrepositorylib.CreateNewUsersPage;
import com.autodestcrm.objectrepositorylib.Home;
import com.autodestcrm.objectrepositorylib.UsersPage;

/**
 * 
 * @author Zakarsh
 *
 */
public class CreateNewUserTest extends BaseClass{

	@Test
	public void CreateNewUser() throws Throwable
	{
		String userName=excelLib.getExcelData("./testData/ContactModule.xlsx","TC_61-70", 17, 3)+"_"+wLib.getRamDomNum();
		String pasWord=excelLib.getExcelData("./testData/ContactModule.xlsx","TC_61-70", 18, 3);
		String cnfrmPasWrd=excelLib.getExcelData("./testData/ContactModule.xlsx","TC_61-70", 19, 3);
		String email=excelLib.getExcelData("./testData/ContactModule.xlsx","TC_61-70", 20, 3);
		String lastName=excelLib.getExcelData("./testData/ContactModule.xlsx","TC_61-70", 21, 3);
		
		/*step1: navigate to home page and click on settings*/
		Home h=new Home(driver);
		h.settings();
		h.clickOnCRMSettings();
		
		/*step2: click on Users*/
		CRMSettingsPage sp=new CRMSettingsPage(driver);
		sp.clickOnUsers();
		
		/*step3: click on create users button*/
		UsersPage up=new UsersPage(driver);
		up.clickOnNewUserBtn();
		
		CreateNewUsersPage nup=new CreateNewUsersPage(driver);
		nup.enterUserName(driver).sendKeys(userName);
		nup.EnterPaswrd(driver).sendKeys(pasWord);
		nup.EnterCnfrmPaswrd(driver).sendKeys(cnfrmPasWrd);
		nup.EnterEmail(driver).sendKeys(email);
		nup.EnterLastName(driver).sendKeys(lastName);
		nup.clickOnRolesPlsBtn();
		wLib.switchToNewTab(driver,nup.PageTitle );
		nup.SelectAssignRole().click();
		nup.ClickOnSaveBtn();
		
		
		
		
	}
}
