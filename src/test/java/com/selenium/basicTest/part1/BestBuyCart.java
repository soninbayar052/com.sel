package com.selenium.basicTest.part1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class BestBuyCart {

	Driver dr = new Driver();
	WebDriver chrome = dr.getChrome();
	final String url = "https://www.bestbuy.com/";

	@Test
	public void search() throws InterruptedException {
		chrome.navigate().to(url);
		Thread.sleep(6000);
		chrome.findElement(By.id("emailId")).sendKeys("demo@yahoo.com");
		chrome.findElement(By.xpath("//*[@id=\"emailSubmissionId\"]/div/div[2]/div/input")).submit();
		Thread.sleep(6000);
		
		chrome.findElement(By.id("gh-search-input")).sendKeys("Macbook pro 15");
		chrome.findElement(By.id("gh-search-input")).sendKeys(Keys.ENTER);
		Thread.sleep(8000);
		chrome.findElement(By.xpath("//*[@id=\"shop-add-to-cart-button-394f37ec-c3be-4825-9d51-e243de3e12b8\"]/div/div/button")).click();
		
		Thread.sleep(10000);
		chrome.findElement(By.xpath("//*[@id=\"shop-attach-modal-006abf8f-e201-4805-a33f-3a5809db04a6\"]/div/div/div/div[3]/div/div/div/div[2]/a")).click();
		
	}

}
