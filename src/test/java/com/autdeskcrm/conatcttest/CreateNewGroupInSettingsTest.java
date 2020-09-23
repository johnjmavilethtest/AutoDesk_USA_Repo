package com.autdeskcrm.conatcttest;

import org.testng.annotations.Test;

import com.autodeskcrm.gerericutils.BaseClass;
import com.autodestcrm.objectrepositorylib.CRMSettingsPage;
import com.autodestcrm.objectrepositorylib.CreateNewGroupPage;
import com.autodestcrm.objectrepositorylib.GroupInfoPage;
import com.autodestcrm.objectrepositorylib.GroupsPage;
import com.autodestcrm.objectrepositorylib.Home;

import junit.framework.Assert;

/**
 * @ZakArsh
 * @throws Throwable
 */
public class CreateNewGroupInSettingsTest extends BaseClass{

	
	/*Test case number 64*/
	@Test
	public void CreateNewGroupInSettings() throws Throwable
	{
		String groupName=excelLib.getExcelData("./testData/ContactModule.xlsx", "TC_61-70", 9, 3)+"_"+wLib.getRamDomNum();
		String selectMembersEntity=excelLib.getExcelData("./testData/ContactModule.xlsx", "TC_61-70", 10, 3);
//		String actualMsg=excelLib.getExcelData("./testData/ContactModule.xlsx", "TC_61-70", 11, 4);
		
		/*step1: Navigate to contacts page*/
		Home h=new Home(driver);
		h.VerifyHomePage();
		h.settings();
		h.clickOnCRMSettings();
		
		/*step2: click on CRM settings*/
		CRMSettingsPage sp=new CRMSettingsPage(driver);
		wLib.waitForPagetoLoad(driver);
		sp.clickOnGroups();
		
		//step3: click on Groups link
		GroupsPage gp=new GroupsPage(driver);
		gp.clickOnNewGroup();
		
		/*create new group by entering group name and selecting entity */ 
		CreateNewGroupPage ngp=new CreateNewGroupPage(driver);
		ngp.EnterGroupName(groupName);
		wLib.select(ngp.selectEntity(),selectMembersEntity);
		ngp.clickOnAddColmnBtn();	
		ngp.clickOnAddGroupBtn();
		
		/*step4:verify newly created group*/ 
		GroupInfoPage gip=new GroupInfoPage(driver);
		wLib.moveMouseToElemnet(driver, gip.signOut());
		
//		String expectdMsg=gip.getGroupSucessfullMsgText().getText();
//		Assert.assertTrue(expectdMsg.contains(actualMsg));
	}
}
