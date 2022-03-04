package assignment.week2;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4RadioButton{

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement chkbox=driver.findElement(By.xpath("(//section[@class='innerblock']//input)[1]"));
		chkbox.click();
		
		WebElement confirmselected= driver.findElement(By.xpath("(//input[@type='checkbox'])[6]"));
		//confirmselected.click();
		
System.out.println("The checkbox selection state is:"+ confirmselected.isSelected());

Boolean deselect=driver.findElement(By.xpath("//div[text()='I am Selected']/input[@type='checkbox']")).isSelected();
System.out.println(deselect);
if(deselect.booleanValue())
{
	driver.findElement(By.xpath("//div[text()='I am Selected']/input[@type='checkbox']")).click();
}
Thread.sleep(2000);
//List<WebElement> Allcheckboxes = driver.findElements(By.xpath("(//input[@type='checkbox'])[9]"));
	//int size= Allcheckboxes.size();
	//System.out.println(size);
	
	//for(int i=0; i<size ; i++);{
	//		Allcheckboxes.get(i).click();
driver.findElement(By.xpath("(//div[@class='example']//input)[9]")).click();
driver.findElement(By.xpath("(//div[@class='example']//input)[10]")).click();
driver.findElement(By.xpath("(//div[@class='example']//input)[11]")).click();
driver.findElement(By.xpath("(//div[@class='example']//input)[12]")).click();
driver.findElement(By.xpath("(//div[@class='example']//input)[13]")).click();
	}
	

}
