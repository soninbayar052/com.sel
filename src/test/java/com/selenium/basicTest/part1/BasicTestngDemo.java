package com.selenium.basicTest.part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicTestngDemo {

	Driver dr = new Driver();
	WebDriver firefox = dr.getFirefox();
	@BeforeTest
	public void initDriver() {
		System.out.println("We are testing in FireFOx");
	firefox.navigate().to("HTTP://www.google.com");
		
	}
	
	@Test(enabled= false)
	public void searchTestNG() {
		final String key="Test NG TEsting framework";
		
		WebElement element = firefox.findElement(By.name("q"));
		element.sendKeys(key);
		System.out.println("Search key is : " +key);
		element.submit();
		
	}
	
	@Test
	public void searchTestNGtwo() {
		final String key="coding examk";
		firefox.navigate().to("HTTP://www.google.com");
		WebElement element = firefox.findElement(By.name("q"));
		element.sendKeys(key);
		System.out.println("Search key is : " +key);
		element.submit();
		
	}
	
	@AfterTest
	public void closeTest() {
		firefox.quit();
	}
}
