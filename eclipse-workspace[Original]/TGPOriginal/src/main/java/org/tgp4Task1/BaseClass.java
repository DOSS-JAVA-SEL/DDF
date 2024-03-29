package org.tgp4Task1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

//Task - with DataProvider
public class BaseClass {
	public static WebDriver driver;
	@Parameters({"url","users","pass"})
	@BeforeMethod
	public void beforemethod(@Optional("http://leaftaps.com/opentaps/control/main") String url,String user,String pass) {
		driver = new ChromeDriver();
		driver.get( url);
		//driver.manage().deleteAllCookies();
		//Page1:Leaftapslogin
		//username
		driver.findElement(By.id("username")).sendKeys(user);
		//password
		driver.findElement(By.id("password")).sendKeys(pass);
		//login button
		driver.findElement(By.className("decorativeSubmit")).click();

	}

	@AfterMethod()
	public void aftermethod() {
		driver.quit();
	}

}
