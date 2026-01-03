package com.TestCases;

import org.testng.annotations.Test;

import com.POM.LandingPagePOM;

import TestComponents.BaseTest;

public class EndToEndTest extends BaseTest {

	@Test
	public void BusTripSelector() throws InterruptedException {
		
	LandingPagePOM landingPage = new LandingPagePOM(driver);
	landingPage.selectSrcDestSearch("Chennai", "Bangalore");
		System.out.println("Trip Selected Successfully");
	}
	
}
