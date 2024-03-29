package org.tgp5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assert1 {
//HardAssertion
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		String expec = driver.getTitle();
		String actual = "IRCTC Next Generation eTicketing System";
		Assert.assertEquals(actual, expec);
		
		
		boolean enabled = driver.findElement(By.xpath("//input[@aria-autocomplete='list']")).isEnabled();
		Assert.assertTrue(enabled);
		
		//driver.close();
	}

}
