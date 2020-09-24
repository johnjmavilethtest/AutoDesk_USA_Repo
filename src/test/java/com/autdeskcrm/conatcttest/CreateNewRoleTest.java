package com.autdeskcrm.conatcttest;

import org.testng.annotations.Test;

import com.autodeskcrm.gerericutils.BaseClass;
import com.autodestcrm.objectrepositorylib.CRMSettingsPage;
import com.autodestcrm.objectrepositorylib.CreateNewRolesPage;
import com.autodestcrm.objectrepositorylib.Home;
import com.autodestcrm.objectrepositorylib.RolesPage;

/**
 * 
 * @author Zakarsh
 * @throws Throwable
 */
public class CreateNewRoleTest extends BaseClass{

	
	@Test
	public void createNewRole() throws Throwable
	{
		/*Test case 66*/
		String roleName=excelLib.getExcelData("./testData/ContactModule.xlsx","TC_61-70", 15, 3)+"_"+wLib.getRamDomNum();
		
		
		/*step1: navigate to home page and click on settings*/
		Home h=new Home(driver);
		h.settings();
		h.clickOnCRMSettings();
		
		/*step2: click on roles link*/
		CRMSettingsPage sp=new CRMSettingsPage(driver);
		sp.clickOnRoles();
		
		/*step3: click on create roles button*/
		RolesPage rp=new RolesPage(driver);
		wLib.moveMouseToElemnet(driver, rp.clickOnCreateRolesBtn());
		rp.clickOnCreateRolesBtn().click();
		
		/*enter mandatory details and create new role*/
		CreateNewRolesPage nrp=new CreateNewRolesPage(driver);
		nrp.EnterRoleName(driver).sendKeys(roleName);
		wLib.select(nrp.selectProfileMembers(),"Sales Profile");
		nrp.clickOnForwardBtn();
		nrp.clickOnSaveBtn();
		wLib.waitForPagetoLoad(driver);
//		
//		
		
		
		
	}
}
