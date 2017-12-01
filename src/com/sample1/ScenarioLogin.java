package com.sample1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScenarioLogin {

	@Test
	public void TestLogin () {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.in/");
		driver.quit();
	}

}
