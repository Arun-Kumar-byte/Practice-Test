package click;

import java.awt.Robot;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaysToClick {
	
	WebDriver driver;
	JavascriptExecutor js;
	Action Act;
	Robot robot;
	
	
	@FindBy(xpath = "//button[@class=\"accordion-button collapsed\"][1]") private WebElement tpelement;
	@FindBy(linkText = "text_box") WebElement TextBox;
	
	
	
	
	
	
	
	
	@Test
	
	public void Performclick() {
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/login.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		//Elements Drop-down
//		
//		//WebElement elementsdropdown = driver.findElement(By.xpath("//button[@class=\"accordion-button collapsed\"][1]"));
//	if(driver.findElement((By.xpath(tpelement))).IsDis {
//		tpelement.click();	
//	}
//		
//	
		//robot.keyPress("ENTER");
		
	// No.of Links in a Web Page.
		
//	List<WebElement>elementlinks =	driver.findElements(By.tagName("a"));
//	System.out.println("Total no. of links ::" + elementlinks.size());
//	
//	//Running loop through list of WebElements
//	
//	for (int i=0; i<elementlinks.size() ;i++) {
//		System.out.println("" + elementlinks.get(i).getText());
//	}
	
	
	WebDriverWait Wait= new WebDriverWait (driver, Duration.ofSeconds(10));
	WebElement textboxdetails = Wait.until(ExpectedConditions.elementToBeClickable(TextBox));
	textboxdetails.click();
	
	}
	
	
	
	
	

}
