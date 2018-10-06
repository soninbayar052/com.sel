package com.selenium.basicTest.part1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BasicCommands {
	Driver dr = new Driver();

	@Test
	public void BasicTestCommands() {
		WebDriver firefox = dr.getFirefox();
		// these commands for Opening URL
		firefox.get("HTTP://www.google.com");
		firefox.navigate().to("HTTP://www.google.com");

		// selecting an web elements locators

		firefox.findElement(By.name("q"));
		WebElement element = firefox.findElement(By.name("q"));

		// Writing in the text box

		element.sendKeys("Testing selenium");
		firefox.findElement(By.name("q")).sendKeys("Tesing");
		//clear test
		firefox.findElement(By.name("q")).clear();
		// Read or fatch the text
		
		firefox.findElement(By.id("hplogo")).getText();
		
		// for browser movements back 
		firefox.navigate().back();
		firefox.navigate().forward();
		firefox.navigate().refresh();
		firefox.findElement(By.id("q")).sendKeys(Keys.F5);
		
		//closing the browser
		firefox.close();
		firefox.quit();
	}
}
