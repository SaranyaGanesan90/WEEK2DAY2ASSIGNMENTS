package assignment.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4Edit {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("testleaf123@gmail.com");
		driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']/input)[2]")).sendKeys("Test Leaf");
System.out.println(driver.findElement(By.name("username")).getAttribute("value"));
driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']/input[@name='username'])[2]")).clear();
System.out.println(driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']/input)[5]")).isDisplayed());

	}

}
