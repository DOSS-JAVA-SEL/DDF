package org.tgp3;
//Static data
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class BaseClass {
	
	public static WebDriver driver;
	@Parameters({"user","pass"})
	@BeforeMethod
	public void beforemethod(String user,String pass) {
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().deleteAllCookies();
		//Page1:Leaftapslogin
		//username
		driver.findElement(By.id("username")).sendKeys(user);
		//password
		driver.findElement(By.id("password")).sendKeys(pass);
		//login button
		driver.findElement(By.className("decorativeSubmit")).click();

	}

	@AfterMethod
	public void aftermethod() {
		driver.close();
	}
}
