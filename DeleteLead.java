package assignment.week2;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	
		public static void main(String[] args) throws InterruptedException {
			 WebDriverManager.chromedriver().setup();
			 ChromeDriver driver=new ChromeDriver();
			 driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().window().maximize();	
		
		WebElement elementUsername= driver.findElement(By.xpath("//input[@id = 'username']"));
		elementUsername.sendKeys("Demosalesmanager");
		WebElement elementPassword=driver.findElement(By.xpath("//input[@id = 'password']"));
		elementPassword.sendKeys("crmsfa");
		WebElement elementLoginButton=driver.findElement(By.xpath("//input[@class = 'decorativeSubmit']"));
		elementLoginButton.click();
		WebElement elementCRMSFA = driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]"));
		elementCRMSFA.click();
		WebElement elementLeads = driver.findElement(By.xpath("//a[text() = 'Leads']"));
		elementLeads.click();
		//WebElement elementFindLeads = driver.findElement(By.xpath("//a[text() = 'Find Leads']"));
		//elementFindLeads.click();
		Thread.sleep(3000);
		//WebElement elementFirstResultingLead = driver.findElement(By.linkText("10826"));
		//elementFirstResultingLead.click();
		//driver.findElement(By.xpath("//a[text() = 'Delete']")).click();
		WebElement elementAgainFindLeads = driver.findElement(By.xpath("//a[text() = 'Find Leads']"));
		elementAgainFindLeads.click();
		WebElement elementLeadID = driver.findElement(By.name("id"));
		elementLeadID.sendKeys("10826");
		WebElement elementFindLeads1 = driver.findElement(By.xpath("//button[text()='Find Leads']"));
		elementFindLeads1.click();
		Thread.sleep(2000);
		String text ="No records to display";
		String text1=driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		
		
		
		if(text.equals(text1)) {
	System.out.println("The Record is deleted");
	}
		else 
		{System.out.println("The Record is not deleted");
		}
		}
	//driver.close();
}

