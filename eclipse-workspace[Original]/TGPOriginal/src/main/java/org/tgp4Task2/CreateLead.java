package org.tgp4Task2;
//task

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass{

	@BeforeClass()
	public void info() {

		sName = "Sheet1";

	}

	@Test(dataProvider = "fetchData")
	public void createLead(String cName, String fName,String lName,String phone) {
		// TODO Auto-generated method stub


		//Page2:welcomepage
		driver.findElement(By.linkText("CRM/SFA")).click();

		//Page3:MyHomepage
		driver.findElement(By.linkText("Leads")).click();

		//Page4:MyLeads
		driver.findElement(By.linkText("Create Lead")).click();

		//Page5:CreateLeads
		//companyname
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		//FirstName
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		//LastName
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		//PhoneNo
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phone);
		//clicking the button
		driver.findElement(By.name("submitButton")).click();

		//Page6:ViewLead
	}	

	//@DataProvider(name = "fetchData1")
	//	public String[][] sendData() throws IOException {


	//		return ReadExcel.readExcel();
	//	}
}
