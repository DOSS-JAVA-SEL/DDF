package org.tgp61Task1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateLead {

	@Test(retryAnalyzer = org.tgp61Task1.TestFail.class)
	public void createLead() {

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
		driver.findElement(By.linkText("Create Lead")).click();

		//Page5:CreateLeads
		//companyname
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Wipro");
		//FirstName
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kumar");
		//LastName
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		//PhoneNo
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("2024");
		//clicking the button
		driver.findElement(By.name("submitButto")).click();

		//Page6:ViewLead
	}}


