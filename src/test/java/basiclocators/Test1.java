package basiclocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Test1 {
	WebDriver driver;
	
	
	
@Test

public void Test1() {
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo3x.opencartreports.com/admin/index.php?route=common/login");
	
	//ID
	driver.findElement(By.id("input-username")).sendKeys("demo");
	
	//Name
	
	driver.findElement(By.name("password")).sendKeys("demo");
	
	//Tag.classname or .class name
	driver.findElement(By.cssSelector("button.btn")).click();
	
	//TagName
	
	List<WebElement> Links= driver.findElements(By.tagName("a"));
	System.out.println("Total no. of links ::" + Links.size());
	
	//XpathByAttribute
	driver.findElement(By.xpath("//li[@id='menu-catalog']")).click();
	


}
}
