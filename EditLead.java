package assignment.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
	
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
				WebElement elementFindLeads = driver.findElement(By.xpath("//a[text() = 'Find Leads']"));
				elementFindLeads.click();
				Thread.sleep(2000);
				WebElement elementFindLeadlink=driver.findElement(By.xpath("(//div[@class='x-form-element']/input[@name='firstName'])[3]"));
				elementFindLeadlink.sendKeys("saran");
				WebElement elementFindLeads1 = driver.findElement(By.xpath("//button[text()='Find Leads']"));
				elementFindLeads1.click();
				Thread.sleep(3000);
				WebElement elementFirstFindLeadLink=driver.findElement(By.xpath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-companyName ']//a)[1]"));

				String text=elementFirstFindLeadLink.getText();
				System.out.println(text);
				elementFirstFindLeadLink.click();
				Thread.sleep(2000);
				
			System.out.println("The driver :" + driver.getTitle());
	driver.findElement(By.linkText("Edit")).click();
	driver.findElement(By.id("updateLeadForm_companyName")).clear();
	driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Tata");
	String text1 = driver.findElement(By.id("updateLeadForm_companyName")).getAttribute("Value");
	System.out.println(text1);
	driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	if(text.equals(text1)) {
		System.out.println("The Company Name are Same");
	}
	else {
		System.out.println("The Company Name are different");
	}
	driver.close();
	
	}
}
