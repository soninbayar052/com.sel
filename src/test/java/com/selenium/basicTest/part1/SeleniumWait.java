package com.selenium.basicTest.part1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

//Implicit waits - web driver instance and is applied to all web elements
//Explicit waits - All elements waiting to render
public class SeleniumWait {
	Driver dr = new Driver();
	WebDriver chrome = dr.getChrome();
	
	final String url= "https://the-internet.herokuapp.com";
	@Test
	public void SetImplicitWait() {
		chrome.navigate().to(url);
		chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement element = chrome.findElement(By.xpath("//*[@id=\"content\"]/ul/li[14]/a"));
		element.click();
		WebDriverWait wait = new WebDriverWait(chrome,15);
		
		// Where driver will wait till the elements is available.
		wait.until(ExpectedConditions.presenceOfElementLocated((By) element));
		// this is example of making sure the elements is available for click
		wait.until(ExpectedConditions.elementToBeClickable((By) element));
		// disabled button ArrayList<WebElements> elements = new ArrayList<>();
		wait.until(ExpectedConditions.invisibilityOf(element));
	}
}
