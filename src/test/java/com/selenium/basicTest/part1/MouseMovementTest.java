package com.selenium.basicTest.part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseMovementTest {
	Driver dr = new Driver();
	WebDriver chrome = dr.getChrome();
	final String url= "https://www.pnc.com/en/personal-banking.html";
	
	@Test
	public void TestMousemovements() {
		chrome.navigate().to(url);
		chrome.manage().window().maximize();
		
		Actions action = new Actions(chrome);
		WebElement elements = chrome.findElement(By.xpath("//*[@id=\"main-header\"]/div[1]/div/div[1]/div/div[1]/div/ul[1]/li[2]/div/div/ul[1]/li[2]/a"));
		action.moveToElement(elements).perform();
	}
}
