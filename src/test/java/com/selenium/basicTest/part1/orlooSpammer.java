package com.selenium.basicTest.part1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class orlooSpammer {

	Driver dr = new Driver();
	WebDriver chrome = dr.getChrome();

	@Test
	public void post() throws InterruptedException {
		chrome.navigate().to(
				"https://www.orloo.info/write-ad/?adverts_location=%D0%92%D0%B0%D1%88%D0%B8%D0%BD%D0%B3%D1%82%D0%BE%D0%BD%20%D0%94%D0%A1");
		chrome.manage().window().maximize();
		chrome.findElement(By.name("adverts_person")).sendKeys("irlee ");
		chrome.findElement(By.name("adverts_email")).sendKeys("info@irlee.info");
		chrome.findElement(By.name("post_title")).sendKeys("DMV area mongolian community web site www.irlee.info Ta buhen zaraa bairshuulaarai bayarlalaa ");
		chrome.findElement(By.id("advert_category")).click();
		chrome.findElement(By.id("advert_category-4")).sendKeys(Keys.SPACE);
		chrome.findElement(By.id("advert_category")).click();
		Thread.sleep(1000);
		// Actions action = new Actions(chrome);
		// action.doubleClick(chrome.findElement(By.id("wp-post_content-editor-container"))).perform();
		chrome.switchTo().frame(chrome.findElement(By.id("post_content_ifr")));
		chrome.findElement(By.id("tinymce")).sendKeys("DMV area mongolian community web site www.irlee.info Ta buhen zaraa bairshuulaarai bayarlalaa ");
		chrome.switchTo().defaultContent();
		chrome.findElement(By.name("submit")).submit();
		
		chrome.findElement(By.xpath("//*[@id=\"post-5\"]/div[2]/div[6]/form[2]/input[3]")).submit();
	}
}
