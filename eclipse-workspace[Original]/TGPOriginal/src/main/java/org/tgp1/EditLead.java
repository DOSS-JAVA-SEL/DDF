package org.tgp1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EditLead {

	@Test
	public void editLead() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().deleteAllCookies();

		//Page1:Leaftapslogin
		//username
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		//password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//login button
		driver.findElement(By.className("decorativeSubmit")).click();

		//Page2:welcomepage
		driver.findElement(By.linkText("CRM/SFA")).click();

		//Page3:MyHomepage
		driver.findElement(By.linkText("Leads")).click();

		//Page4:MyLeads
		driver.findElement(By.linkText("Find Leads")).click();

		//Page5:FindLeads
		driver.findElement(By.linkText("Phone")).click();
		Thread.sleep(1500);
		//	driver.findElement(By.name("phoneCountryCode")).sendKeys("1");
		driver.findElement(By.name("phoneNumber")).sendKeys("2024");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//tr[1]//a[1]")).click();
		Thread.sleep(1500);
		//Page6:ViewLead
		driver.findElement(By.linkText("Edit")).click();

		//Page7:Opentaps:CRM
		WebElement e = driver.findElement(By.id("updateLeadForm_companyName"));
		e.clear();
		e.sendKeys("TCS");

		 driver.findElement(By.name("submitButton")).click();
	//	driver.close();
	}
}
