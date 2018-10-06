package com.selenium.DifferentClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.selenium.basicTest.part1.Driver;

public class HomePage {
	
	public static WebDriver  drive() {
		Driver dr = new Driver();
		WebDriver chrome = dr.getChrome();
		return chrome;
	}
	
	
	
	@BeforeSuite
	public void testOneHomePage(WebDriver chrome) {
	
		chrome.get("https://opensource-demo.orangehrmlive.com/");
		
	}
	@BeforeTest
	public void enterUserNameandPassword(WebDriver chrome) {
		chrome.findElement(By.id("txtUsername")).sendKeys("Admin");
		chrome.findElement(By.id("txtPassword")).sendKeys("admin123");
	}
	@Test
	public void clickLoginBtn(WebDriver chrome) throws InterruptedException {
	
		chrome.findElement(By.id("btnLogin")).click();;
		
	}
}
