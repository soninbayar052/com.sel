package com.selenium.basicTest.part1;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class rightClick {

	Driver dr = new Driver();
	WebDriver chrome = dr.getChrome();

	 @Test
	public void rightclick() throws InterruptedException {
		chrome.navigate().to("http://www.irlee.info");
		Actions action = new Actions(chrome);
		WebElement element = chrome.findElement(By.xpath("//*[@id=\"contentbody\"]/div/div/div[2]/div/div/h2/a"));
		Thread.sleep(2000);
		action.contextClick(element).perform();
		Thread.sleep(8000);
		chrome.close();
	}

	//@Test
	public void doubleClick() throws InterruptedException {
		chrome.navigate().to("http://www.irlee.info");
		
		chrome.manage().window().maximize();
		chrome.manage().window().fullscreen();
		Thread.sleep(2000);
		Actions action = new Actions(chrome);
		WebElement element = chrome.findElement(By.xpath("//*[@id=\"myCarousel\"]/a[2]/span[1]"));
		action.doubleClick(element).perform();
		Thread.sleep(8000);
		chrome.close();
	}

}
