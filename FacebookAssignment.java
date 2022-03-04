package assignment.week2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookAssignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
WebElement elementCreateNewAccount = driver.findElement(By.xpath("//div[@class='_6ltg']/a"));
elementCreateNewAccount.click();
Thread.sleep(2000);
driver.findElement(By.xpath("//div[@class='_5dbb']/input")).sendKeys("TEST");

driver.findElement(By.xpath("(//div[@class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']/input)[1]")).sendKeys("LEAF");
driver.findElement(By.name("reg_email__")).sendKeys("9567653229");
driver.findElement(By.name("reg_passwd__")).sendKeys("Abcd@123");
//driver.findElement(By.xpath("//div[text()='New password']")).sendKeys("Abcd@123");
List<WebElement> days = driver.findElements(By.id("day"));
int daysize = days.size();
for (int i = 0; i < daysize; i++) {
    System.out.println(daysize);
	}
WebElement dayDropDown = driver.findElement(By.id("day"));
Select dayDropDownObject =new Select(dayDropDown);
dayDropDownObject.selectByVisibleText("27");
WebElement monthDropDown = driver.findElement(By.id("month"));
Select monthDropDownObject =new Select(monthDropDown);
monthDropDownObject.selectByVisibleText("Jun");
WebElement yearDropDown = driver.findElement(By.id("year"));
Select yearDropDownObject =new Select(yearDropDown);
yearDropDownObject.selectByVisibleText("1990");
driver.findElement(By.xpath("(//span[@class='_5k_2 _5dba']/input)[1]")).click();
	}
}
