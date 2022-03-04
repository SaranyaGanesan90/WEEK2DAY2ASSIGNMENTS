package assignment.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4Button {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
	//driver.findElement(By.id("home")).click();//To do the remaining steps---> Comment this---> will not go back to home page if we comment this 
	
	System.out.println(driver.findElement(By.id("position")).getLocation());
	System.out.println(driver.findElement(By.id("color")).getCssValue("background-color"));
	System.out.println(driver.findElement(By.id("size")).getSize());
	}

}
