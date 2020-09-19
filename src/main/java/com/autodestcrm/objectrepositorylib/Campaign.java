package com.autodestcrm.objectrepositorylib;

import org.apache.commons.math3.stat.correlation.KendallsCorrelation;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * 
 * @author user1
 *    push
 */
public class Campaign {

	@Test
   private void sysoTest() throws InterruptedException {
	WebDriver driver = new FirefoxDriver();
	 driver.get("https://www.goibibo.com/flights/?");
	 
	 driver.findElement(By.id("gosuggest_inputSrc")).sendKeys("BLR",Keys.ENTER);
	 Thread.sleep(500);
	 driver.findElement(By.xpath("//span[text()='Bengaluru, India']")).click();
	 
	 driver.findElement(By.id("gosuggest_inputDest")).sendKeys("BOM",Keys.ENTER);
	 driver.findElement(By.xpath("//span[text()='Mumbai (BOM)']")).click();
	 
	 
}
}
