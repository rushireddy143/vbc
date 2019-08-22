package linkedin;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GetProfiles {
  @Test
  public void f() throws InterruptedException, AWTException {
	  System.setProperty("webdriver.chrome.driver","./src/main/resources/Drivers/chromedriver.exe");
	  WebDriver	driver=new ChromeDriver();
	  
	  driver.get("https://www.linkedin.com");
	  
	  driver.findElement(By.xpath("//a[@class='nav__button-secondary']")).click();
	  
	  driver.findElement(By.xpath("//input[@id='username']")).sendKeys("lrushikeswarreddy@gmail.com");
	  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Siri@143");
	  
	  driver.findElement(By.xpath("//button[@class='btn__primary--large from__button--floating']")).click();
	  
	  Thread.sleep(5000);
	  
	  
	  driver.findElement(By.xpath("//input[@role='combobox']")).sendKeys("CEO in People");
	  
	  Thread.sleep(3000);
	  
	  Robot r=new Robot();
	  
	  r.keyPress(KeyEvent.VK_ENTER);
	  
	  r.keyRelease(KeyEvent.VK_ENTER); 
	  
	  
	  List<WebElement> str=driver.findElements(By.tagName("//span[@class='name actor-name']"));
			  
			  for(WebElement e: str)
			  {
				  System.out.println(e.getText());
			  }
			  

	  
	  Thread.sleep(10000);
	
	  
	  
  }
}
