package com.selenium.basicTest.part1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class irleeQA {

	Driver dr = new Driver();
	WebDriver chrome = dr.getChrome();

	@BeforeSuite
	public void initial() throws InterruptedException {

		chrome.navigate().to("http://www.irlee.info");
	}

	@Test
	public void irleeAdd() throws InterruptedException {
		//chrome.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		Thread.sleep(2000);
		chrome.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[2]/a")).click();

		chrome.findElement(By.id("userName")).sendKeys("Poster");
		chrome.findElement(By.id("adsTitle")).sendKeys("Roommate awna");
		Select se = new Select(chrome.findElement(By.id("adcategory")));
		se.selectByValue("service");
		chrome.findElement(By.id("subject")).sendKeys(
				"Dunn loring metro station s 5 min zaitai 2 bed 2 bath laundry-tai apartment-de 11.01-s suuh NEG hun avna. Bair ndaa billiard, table tennis, bowling bolon gym tei tohilog bair. Holbogdoh dugaar");
		chrome.findElement(By.id("adsphone")).sendKeys("703 477 0158");
		//chrome.findElement(By.xpath("//*[@id=\"insertAds\"]/button")).click();

	}

	@AfterSuite
	public void close() throws InterruptedException {
		Thread.sleep(8000);
		chrome.close();
	}

}
