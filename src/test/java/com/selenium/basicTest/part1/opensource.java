package com.selenium.basicTest.part1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class opensource {

	Driver dr = new Driver();
	WebDriver chrome = dr.getFirefox();
	private final String url = "https://opensource-demo.orangehrmlive.com/";

	@BeforeSuite
	public void setUp() {
		chrome.navigate().to(url);
	}

	

	@Test
	public void enterUserNameandPassword() {
		chrome.findElement(By.id("txtUsername")).sendKeys("Admin");
		chrome.findElement(By.id("txtPassword")).sendKeys("admin123");
		chrome.findElement(By.id("btnLogin")).click();
	}

	@Test
	public void SecondPage() throws InterruptedException {
		//chrome.navigate().refresh();
		Thread.sleep(15000);
		chrome.findElement(By.linkText("Assign Leave")).click();
		
		WebElement element = chrome.findElement(By.id("assignleave_txtLeaveType"));
		Select se = new Select(element);
		se.selectByIndex(3);
	}

	@AfterSuite
	public void closeTheTest() throws InterruptedException {
		Thread.sleep(15000);
		chrome.close();
	}
}
