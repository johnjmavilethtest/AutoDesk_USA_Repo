package com.autodeskcrm.gerericutils;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class ListImgClass implements ITestListener{

	/*
	 * @Override public void onTestFailure(ITestResult result) {
	 * 
	 * String testName = result.getMethod().getMethodName();
	 * System.out.println("=======================>"+testName);
	 * 
	 * Date d = new Date(); String currentDate = d.toString().replace(" ",
	 * "_").replace(":", "_");
	 * 
	 * System.out.println("==============Faill =====================>");
	 * EventFiringWebDriver eDrirver = new
	 * EventFiringWebDriver(ScreenShotTest.driver); File srcfile =
	 * eDrirver.getScreenshotAs(OutputType.FILE); try { FileUtils.copyFile(srcfile,
	 * new File("./screenShot/"+testName+"_"+currentDate+".png")); } catch
	 * (IOException e) {
	 * 
	 * } }
	 */
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	
	


}
