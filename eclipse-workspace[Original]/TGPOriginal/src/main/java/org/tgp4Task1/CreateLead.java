package org.tgp4Task1;
//task

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass{

	@Test(dataProvider = "fetchData")
	public void createLead(String cName, String fName,String lName) {
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
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("2024");
		//clicking the button
		driver.findElement(By.name("submitButton")).click();

		//Page6:ViewLead
	}	
	
	@DataProvider(name = "fetchData")
	public String[][] sendData() {
		String[][] data = new String[1][3];
		
		data[0][0]= "Tesla";
		data[0][1]= "Sathish";
		data[0][2]= "M";

		return data;
	}
}
