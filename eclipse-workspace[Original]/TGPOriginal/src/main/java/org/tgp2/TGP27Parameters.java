package org.tgp2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//Parameters
public class TGP27Parameters {

	@Parameters({"user","pass"})
	@Test
	public void login(String uname,@Optional("crmsfa") String passw) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
        driver.manage().deleteAllCookies();
        
        driver.findElement(By.id("username")).sendKeys(uname);
        driver.findElement(By.id("password")).sendKeys(passw);
        driver.findElement(By.className("decorativeSubmit")).click();
	}
}
