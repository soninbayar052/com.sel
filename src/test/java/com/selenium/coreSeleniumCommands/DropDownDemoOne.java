package com.selenium.coreSeleniumCommands;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.selenium.basicTest.part1.Driver;

public class DropDownDemoOne {8lo
	
	Driver dr= new Driver();
	WebDriver chrome = dr.getChrome();
	WebDriver firefox = dr.getFirefox();
	
	@Test
	public void selectSamples() {
		firefox.get("");
		
	}
}
