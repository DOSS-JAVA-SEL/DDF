package org.tgp31;
//static data
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead  extends BaseClass {


	@Test(dataProvider="Datas")
	public void createLead(String comp,String fName, String lName){

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
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("2024");
		//clicking the button
		driver.findElement(By.name("submitButton")).click();

		//Page6:ViewLead
	}

	@DataProvider(name="Datas")
	public String[][] sendData() {
		String data[][] = new String[2][3];
		data[0][0] = "Wipro";
		data[0][1] = "Kumar";
		data[0][2] = "R";


		data[1][0] = "Wipro";
		data[1][1] = "Sanjay";
		data[1][2] = "P";

		return data;

	}}


