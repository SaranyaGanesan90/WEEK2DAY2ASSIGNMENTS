package assignment.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class CreateContact {
		 public static void main(String[] args) {
			 WebDriverManager.chromedriver().setup();
			 ChromeDriver driver=new ChromeDriver();
			 driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().window().maximize();
			WebElement elementUsername = driver.findElement(By.id("username"));
			elementUsername.sendKeys("Demosalesmanager");
			WebElement elementPassword = driver.findElement(By.id("password"));
			elementPassword.sendKeys("crmsfa");
			WebElement elementLoginButton = driver.findElement(By.className("decorativeSubmit"));
			elementLoginButton.click();
			WebElement elementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
			elementCRMSFA.click();
			WebElement elementLeads = driver.findElement(By.linkText("Leads"));
			elementLeads.click();
			WebElement elementCreateLead = driver.findElement(By.linkText("Create Lead"));
			elementCreateLead.click();
			WebElement elementCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
			elementCompanyName.sendKeys("XYZ");
			WebElement elementFirstName = driver.findElement(By.id("createLeadForm_firstName"));
			elementFirstName.sendKeys("Saranya");
			WebElement elementLastName = driver.findElement(By.id("createLeadForm_lastName"));
			elementLastName.sendKeys("Ganesan");
			WebElement elementFirstName1= driver.findElement(By.id("createLeadForm_firstNameLocal"));
			elementFirstName1.sendKeys("Saran");
			WebElement elementDepartment= driver.findElement(By.id("createLeadForm_departmentName"));
			elementDepartment.sendKeys("IC");
			WebElement elementDescription= driver.findElement(By.id("createLeadForm_description"));
			elementDescription.sendKeys("ABCDEFGH");
			WebElement elementEmailAddress= driver.findElement(By.id("createLeadForm_primaryEmail"));
			elementEmailAddress.sendKeys("sg.saranyaganesan@gmail.com");
			WebElement elementStateProvince= driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
			Select dd = new Select(elementStateProvince);
			dd.selectByVisibleText("New York");
			WebElement elementCreateLead1 = driver.findElement(By.className("smallSubmit"));
			elementCreateLead1.click();
			WebElement elementEdit = driver.findElement(By.linkText("Edit"));
			elementEdit.click();
			WebElement elementDescriptionClear = driver.findElement(By.id("updateLeadForm_description"));
			elementDescriptionClear.clear();
		
		WebElement elementImportantNote= driver.findElement(By.id("updateLeadForm_importantNote"));
		elementImportantNote.sendKeys("PQRSTUVWXYZ");
		WebElement elementUpdate = driver.findElement(By.xpath("//form[@id='updateLeadForm']//input[@class='smallSubmit']"));
		elementUpdate.click();
			//elementDescription.sendKeys("ABCDEFGH");	
			//System.out.println(driver.getTitle());
		 }
	}