package org.tgp4Task2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

//Task
public class EditLead extends BaseClass{
	
	@BeforeClass()
	public void info() {

		sName = "Sheet2";

	}

	@Test(dataProvider = "fetchData")
	public void editLead(String phone,@Optional String comp) throws InterruptedException {

		
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
			driver.findElement(By.name("phoneNumber")).sendKeys(phone);
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
			e.sendKeys(comp);

			driver.findElement(By.name("submitButton")).click();
				driver.close();
	}
//	@DataProvider(name = "fetchData2")
//	public String[][] sendData() throws IOException {
	//	String[][] data = new String[1][2];
		
//		data[0][0]= "2024";
//		data[0][1]= "IBM";
		

//		return ReadExcel.readExcel();
//	}
}
