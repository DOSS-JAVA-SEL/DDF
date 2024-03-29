package org.tgp5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class Assert2 {
	//SoftAssertion
	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");

		SoftAssert sa = new SoftAssert();
		String expec = driver.getTitle();
		String actual = "IRCTC Next Generation eTicketing System";
		sa.assertEquals(actual, expec);

		sa.assertAll();
	}
}
