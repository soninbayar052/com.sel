package com.selenium.basicTest.part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {
	
	Driver dr = new Driver();
	WebDriver chrome = dr.getChrome();
	
	final String url= "https://the-internet.herokuapp.com";
	@Test
	public void Drag() throws InterruptedException {
		chrome.navigate().to(url);
		WebElement elements = chrome.findElement(By.xpath("//*[@id=\"content\"]/ul/li[8]/a"));
		Actions action = new Actions(chrome);
		action.click(elements).perform();
		Thread.sleep(5000);
		WebElement el1 = chrome.findElement(By.id("column-a"));
		WebElement el2 = chrome.findElement(By.id("column-b"));
		Thread.sleep(5000);
		action.clickAndHold(el1).moveToElement(el2).release().build().perform();
		
	}
	
	

}
