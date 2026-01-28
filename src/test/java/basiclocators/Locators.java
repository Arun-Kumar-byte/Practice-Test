package basiclocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Locators {
	
@Test

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		// Name Locator
		driver.findElement(By.name("name")).sendKeys("Arun");
		
		// ID Locator
		driver.findElement(By.id("email")).sendKeys("eakarun@gamil.com");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.opencart.com/index.php?route=marketplace/extension");
		
		// LinkText
		//driver.findElement(By.linkText("Shipping Methods")).click();
		Thread.sleep(3000);
		
		//Partial LinkText
		//driver.findElement(By.partialLinkText("Gateways")).click();
		
		
		//ClassName Locator -- HeaderLinks available in WebPage.
		List<WebElement>headerlinks =driver.findElements(By.className("list-unstyled"));
		System.out.println("No. of available links in header are :" + headerlinks.size());
		
		
		//TagName Locator for No.of Links available in WebPage.
		List<WebElement>links =driver.findElements(By.tagName("a"));
		System.out.println("Numbers of links available are::" +links.size() +"\t");
		
		//TagName Locator -- No of Images available in WebPage
		List<WebElement>Images =driver.findElements(By.tagName("img"));
		System.out.println("No.of images in webPage are::" + Images.size());
		
		
		
	}

}
