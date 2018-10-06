package com.selenium.basicTest.part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SeleniumTestPNC {
	Driver dr = new Driver();
	WebDriver firefox = dr.getFirefox();

	@Test
	public void getFirefox() {
		firefox.navigate().to("https://www.pnc.com/en/personal-banking.html");
		firefox.findElement(By.name("userId")).sendKeys("dasdasd");
		firefox.findElement(By.id("passwordInputField")).sendKeys("asdasdsadasd");
		firefox.findElement(By.id("olb-btn")).click();

	}
}
