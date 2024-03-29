package org.leads;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead  extends BaseClass{
	
	@BeforeClass
	public void sheetName() {
		sheet = "Sheet1";

	}

	@Test(dataProvider = "informations")
	public void createLead(String comp,String fName,String lName,String phone){

		/*	WebDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().deleteAllCookies();
		//Page1:Leaftapslogin
		//username
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		//password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//login button
		driver.findElement(By.className("decorativeSubmit")).click();
		 */
		//Page2:welcomepage
		driver.findElement(By.linkText("CRM/SFA")).click();

		//Page3:MyHomepage
		driver.findElement(By.linkText("Leads")).click();

		//Page4:MyLeads
		driver.findElement(By.linkText("Create Lead")).click();

		//Page5:CreateLeads
		//companyname
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(comp);
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

/*	@DataProvider(name = "informations")
	public String[][] sendData() {

		String[][] data = new String[1][4];
		data[0][0] = "Wipro";
		data[0][1] = "Kumar";
		data[0][2] = "R";
		data[0][3] = "2024";
		
		return data;
	}
*/
	

}


