package com.selenium.DifferentClasses;


import org.testng.annotations.Test;

public class AdminPage {
	
	@Test
	public void clickOnTime() throws InterruptedException {
		HomePage hm = new HomePage();
		
		hm.testOneHomePage(hm.drive());
		
		hm.clickLoginBtn(hm.drive());
		
		hm.clickLoginBtn(hm.drive());
	}

	
}
