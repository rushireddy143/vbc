package supplierregistration;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class mSupplierReg {

	

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
     WebDriver d=new ChromeDriver();
     d.get("https://msupplier.criticalriver.com/");
     d.manage().window().maximize();
     
		
		  d.findElement(By.linkText("New Supplier Registration")).click();
		  d.findElement(By.xpath("//input[@name='attribute1']")).sendKeys("gen195");
		  d.findElement(By.xpath("//input[@name='name']")).sendKeys("gen195");
		  d.findElement(By.xpath("//input[@name='emailId']")).sendKeys(
		  "surya.lakshmi@criticalriver.com");
		  d.findElement(By.xpath("//input[@name='mobileNo']")).sendKeys("8578265287");
		  d.findElement(By.xpath("//input[@name='designation']")).
		  sendKeys("software trainee");
		  d.findElement(By.xpath("//input[@name='department']")).sendKeys("Testing");
		  d.findElement(By.xpath("//input[@name='userName']")).sendKeys("gen195");
		  d.findElement(By.xpath("//input[@name='password']")).sendKeys("Welcome@123");
		  d.findElement(By.id("confirmpassword")).sendKeys("Welcome@123");
		  Thread.sleep(15000);
		 
     
    // File src=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
     
   //  Files.copy(src,new File("D:\\pic.png"));
		/*
		 * ITesseract img=new ITesseract(); String imageText=img.doOCR(new File(path));
		 * String finalText=imageText.split("below")[1].replaceAll("[^a-zA-Z0-9]", "");
		 * System.out.println("Final captcha is:"+finalText);
		 * d.findElement(By.id("jcaptcha")).sendKeys(finalText);
		 */
     d.findElement(By.xpath("//button[@name='regSubmit']")).click();;
     d.quit();
	}
}
//d.findElement(By.id("jcaptcha")).sendKeys("1234");
// String captchaVal = JOptionPane.showInputDialog("Enter Code Shown");
//d.findElement(By.id("jcaptcha")).sendKeys(captchaVal);
 //String captchaValue = d.findElement(By.xpath("//span[@id='txtCaptcha']")).getText(); 
// String captchaValue = d.findElement(By.xpath("//span[@id='txtCaptcha']")).getText(); 
// String captchaValue = d.findElement(By.id("txtCaptcha")).getText(); 

 //System.out.println(captchaValue);
 //d.findElement(By.xpath("//input[@id='Jcaptcha']")).sendKeys(captchaValue);

