package supplierregistration;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Test {

	public static void main(String[] args) throws InterruptedException, FindFailed {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver d = new ChromeDriver();

		d.get("https://msupplier.criticalriver.com");

		d.manage().window().maximize();

		Thread.sleep(5000);

		d.findElement(By.xpath("//input[@name='username']")).sendKeys("gen1995");

		d.findElement(By.id("password")).sendKeys("Welcome@123");

		d.findElement(By.xpath("//button[@id='loginBtn']")).click();

	}	
}








