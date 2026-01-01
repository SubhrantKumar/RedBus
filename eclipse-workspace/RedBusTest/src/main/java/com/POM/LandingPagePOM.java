package com.POM;

import java.util.List;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.AbstractComponents.AbstractComponents;

public class LandingPagePOM extends AbstractComponents {

	WebDriver driver;

	@FindBy(id = "srcinput")
	WebElement sourceInputWebElement;
	
	@FindBy(className = "commonSuggestionWrapper")
	List<WebElement> sourceSuggestionsListofWebElements;
	
	
	@FindBy(id = "destinput")
	WebElement destinationInputWebElement;

	@FindBy(xpath = "//button[@aria-label='Search buses']")
	WebElement searchButtonWebElement;
	
	public LandingPagePOM(WebDriver driver) {

		super(driver);
		PageFactory.initElements(driver, this);
		this.driver = driver;

	}
	public void selectSrcDestSearch(String src, String dest) throws InterruptedException
	
	{
	
		sourceInputWebElement.sendKeys(src);
		Thread.sleep(3000);
		sourceInputWebElement.sendKeys(Keys.ARROW_DOWN);
		sourceInputWebElement.sendKeys(Keys.ENTER);
		
		
 		destinationInputWebElement.sendKeys(dest);
 		Thread.sleep(3000);
 		destinationInputWebElement.sendKeys(Keys.ARROW_DOWN);
		destinationInputWebElement.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		searchButtonWebElement.click();
		System.out.println("Test Passed");
	}


}
