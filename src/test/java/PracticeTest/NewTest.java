package PracticeTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class NewTest {
	
	WebDriver driver;
	
  @Test
  public void LaunchBrowser() {
	  new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get(null);
	  
  }
  
  
}
