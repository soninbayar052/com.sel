package com.selenium.basicTest.part1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
	public WebDriver getChrome() {
		
		System.setProperty("webdriver.chrome.driver", "C://Users/samsung/Downloads/chromedriver.exe");
		WebDriver chrome = new ChromeDriver();
		return chrome;
	}
	
	public WebDriver getFirefox() {
	
		System.setProperty("webdriver.gecko.driver", "C://Users/samsung/Downloads/geckodriver.exe");
		WebDriver firefox = new FirefoxDriver();
		return firefox;
	}
}
