package assignment.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

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
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("aaa@gmail.com");
		 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
Thread.sleep(3000);
	WebElement elementDuplicateLead = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]"));

		
		String text=elementDuplicateLead.getText();
		System.out.println(text);
		elementDuplicateLead.click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.getTitle();
		WebElement elementCreateLead2 = driver.findElement(By.className("smallSubmit"));
		elementCreateLead2.click();

		WebElement elementNewDuplicateLead = driver.findElement(By.id("viewLead_firstName_sp"));
		String text1=elementNewDuplicateLead.getText();
		System.out.println(text1);
		
		if (text.equals(text1)) {
			System.out.println("The Duplicate Lead Name is same as captured name");
		}else
		{
			System.out.println("The Duplicate Lead Name is not same as captured name");
		
		}
		
}
}