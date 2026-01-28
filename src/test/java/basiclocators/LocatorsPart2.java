package basiclocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPart2 {
	
	

	public static void main(String[] args) {
	
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		
		//Note: In CSS Selector Tag is an Optional without using tag name also we can execute the script.
		
		
		//CSS SELECTOR USING INPUT#ID
		
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("mobiles");
//without TagName----> driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("mobiles");
		
		
		//CSS SELECTOR USING TAGNAME.CLASSNAME
				
		driver.findElement(By.cssSelector("button.search-box-button")).click();
//without TagName---->		driver.findElement(By.cssSelector(".search-box-button")).click();
		
		//CSS SELECTOR USING TAGNAME[ATTRIBUTE NAME="ATTRIBUTE VALUE"]
		
		driver.findElement(By.cssSelector("a[class=\"ico-register\"]")).click();
		
	//	Inside the value we can use Single Quote for value.
	
		driver.findElement(By.cssSelector("a[class='ico-register']")).click();
		
		//CSS SELECTOR USING TAGNAME.CLASSNAME[ATTRIBUTE NAME="ATTRIBUTE VALUE"]
		
		driver.findElement(By.cssSelector("input.search-box-text[type='text']")).sendKeys("T-Shirts");

	}

}
