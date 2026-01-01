package com.AbstractComponents;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AbstractComponents {

	WebDriver driver;

	public AbstractComponents(WebDriver driver) {

		this.driver = driver;
	}

	public void autoSuggestionSelection(List<WebElement> Options, String input) {
		for (WebElement option : Options) {
			if (option.getText().equalsIgnoreCase(input)) {
				option.click();
				break;
			}
		}
	}

	public void waitForElementToappear(By findByElement) {

	}
}
