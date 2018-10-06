package com.selenium.basicTest.part1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AlertDemo {
	Driver dr = new Driver();
	WebDriver chrome = dr.getChrome();
	
	final String url= "https://the-internet.herokuapp.com";

	@Test
	public void TestTheAlert() throws InterruptedException {
		chrome.navigate().to(url);
		chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement element = chrome.findElement(By.xpath("//*[@id=\"content\"]/ul/li[25]/a"));
		
		Actions action = new Actions(chrome);
		action.click(element).perform();
		
		WebElement jselement = chrome.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button"));
		action.click(jselement).perform();
		Thread.sleep(1000);
		Alert alert = chrome.switchTo().alert();
		alert.accept();
		
		chrome.switchTo().defaultContent();
		Thread.sleep(1000);
		chrome.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
		alert.dismiss();
		
		chrome.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
		alert.sendKeys("MIlan");
		Thread.sleep(1000);
		alert.accept();
		
	}
}
