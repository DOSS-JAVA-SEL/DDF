package org.tgp4;
import java.io.IOException;

//Static data
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
//DataProvider

public class BaseClass {

	public static WebDriver driver;
	public String fileName;
	
	@Parameters({"url","user","pass"})
	@BeforeMethod()

	public void beforemethod(String url,String user,String pass) {
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().deleteAllCookies();
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
		driver.close();
	}

	@DataProvider(name = "fetchData")
	public String[][] sendData() throws IOException {
		/*
		String[][] data = new String[2][3];
	

		data[0][1] = "Kumar";
		data[0][2] = "K";

		data[1][0] = "IBM";
		data[1][1] = "Sanjai";
		data[1][2] = "S";

		return data;
*/		
	//	ReadExcel read = new ReadExcel();
	//	String[][] data = read.readExcel();
	//	return data;
		
		return ReadExcel.readExcel(fileName);
	}
}
