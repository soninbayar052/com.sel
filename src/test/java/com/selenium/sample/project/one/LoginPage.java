package com.selenium.sample.project.one;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * More about TestNG
 * 1. What are all the annotations ?
 * 
 * @BeforeSuite
 * @AfterSuite
 * 
 * @BeforeTest
 * @AfterTest
 * 
 * @BeforeClass
 * @AfterClass
 * 
 * @BeforeMethod
 * @AfterMethod
 * 
 * @Test
 */
import com.selenium.basicTest.part1.Driver;

public class LoginPage {
	Driver dr = new Driver();
	WebDriver chrome = dr.getChrome();
	private final String url= "https://opensource-demo.orangehrmlive.com/";
	
	@BeforeSuite
	public void testOneHomePage() {
		chrome.get(url);
		
	}
	@BeforeTest
	public void enterUserNameandPassword() {
		chrome.findElement(By.id("txtUsername")).sendKeys("Admin");
		chrome.findElement(By.id("txtPassword")).sendKeys("admin123");
	}
	@Test(priority=0)
	public void clickLoginBtn() throws InterruptedException {
	
		chrome.findElement(By.id("btnLogin")).click();;
		
	}
	//@Test(dependsOnMethods= {"rightClick.doubleClick"}, alwaysRun=true)
	@Test(priority=1)
	public void clickOnTime() {
		chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		chrome.findElement(By.id("menu_time_viewTimeModule")).click();
		chrome.findElement(By.id("employee")).clear();
		chrome.findElement(By.id("employee")).sendKeys("Fadel Diab Shaito");
		chrome.findElement(By.id("btnView")).click();
	}
	
	@Test(priority=2)
	public void testOnTimeSheet() {
		chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		chrome.findElement(By.id("btnEdit")).click();
		chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		chrome.findElement(By.id("btnAddRow")).click();
	}
	
	@AfterTest
	public void enterRowValues() {
		chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement element = chrome.findElement(By.id("initialRows_0_projectName"));
		element.clear();
		element.sendKeys("ADMIN DEMO");
		chrome.findElement(By.id("initialRows_0_0")).sendKeys("5");
		chrome.findElement(By.id("initialRows_0_1")).sendKeys("6");
		chrome.findElement(By.id("initialRows_0_2")).sendKeys("7");
		chrome.findElement(By.id("initialRows_0_3")).sendKeys("8");
		chrome.findElement(By.id("initialRows_0_4")).sendKeys("9");
		
		chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement element1 = chrome.findElement(By.id("initialRows_1_projectName"));
		element1.clear();
		element1.sendKeys("ADMIN DEMO 2");
		chrome.findElement(By.id("initialRows_1_0")).sendKeys("5");
		chrome.findElement(By.id("initialRows_1_1")).sendKeys("6");
		chrome.findElement(By.id("initialRows_1_2")).sendKeys("7");
		chrome.findElement(By.id("initialRows_1_3")).sendKeys("8");
		chrome.findElement(By.id("initialRows_1_4")).sendKeys("9");
	
	}
	
	@AfterSuite
	public void SaveSheet() {
		chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		chrome.findElement(By.id("submitSave")).submit();
	}

	

}
