package supplierregistration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProcManager {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
        WebDriver d=new ChromeDriver();
		
		d.get("https://msupplier.criticalriver.com");
		
		d.manage().window().maximize();
		
		Thread.sleep(5000);
		
		d.findElement(By.xpath("//input[@name='username']")).sendKeys("procmgmr");
		
		d.findElement(By.id("password")).sendKeys("Welcome@123");
		
		d.findElement(By.xpath("//button[@id='loginBtn']")).click();

		
		  d.findElement(By.xpath("//div[@class='small-box bg-yellow']/a")).click();
		  Thread.sleep(5000); d.findElement(By.linkText("10196")).click();
		  d.findElement(By.id("Approved")).click();
		  d.findElement(By.xpath("//textarea[@id='comment']")).
		  sendKeys("Approved by ProcOfficer");
		  d.findElement(By.xpath("//button[@id='apprSubmit']")).click();
		  d.findElement(By.xpath("//input[@id='conYes']")).click();
		 
		/*
		 * Thread.sleep(5000);
		 * d.findElement(By.xpath("//span[contains(text(),'Welcome, PROCMGMR')]")).click
		 * (); Thread.sleep(5000);
		 * d.findElement(By.xpath("//input[@class='btn btn-primary btn-flat']")).click()
		 * ;
		 */

	}

}
