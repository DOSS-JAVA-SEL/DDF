package org.leads;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class BaseClass {

	public static 	WebDriver driver;
	public String sheet;
	
	@Parameters({"url","uName","pass"})
	@BeforeMethod
	public void beforeMethod(String url,String uName,String pass) {
//"http://leaftaps.com/opentaps/control/main"
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().deleteAllCookies();
		//Page1:Leaftapslogin
		//username
		driver.findElement(By.id("username")).sendKeys(uName);
		//password
		driver.findElement(By.id("password")).sendKeys(pass);
		//login button
		driver.findElement(By.className("decorativeSubmit")).click();

	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}
	
	@DataProvider(name="informations")
	public String[][] sendData() throws IOException {

		return ReadExcel.readExcel(sheet);
	}
}
