package com.selenium.basicTest.part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class BasicWebDriverTest {
	Driver dr = new Driver();
	WebDriver chrome = dr.getChrome();
	@Test
	public void getTheHomePage() {
		chrome.navigate().to("https://www.pnc.com/en/personal-banking.html");
		chrome.findElement(By.name("userId")).sendKeys("asd");
		chrome.findElement(By.id("passwordInputField")).sendKeys("asd");
		chrome.findElement(By.id("olb-btn")).click();
	
	}
}
