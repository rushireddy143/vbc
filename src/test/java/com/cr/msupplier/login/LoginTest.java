package com.cr.msupplier.login;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.cr.panels.Panel;

import objectrepo.LoginObjectRepo;

public class LoginTest extends Panel{
	
	@Test
	@Parameters({"strDatalocation","strDatasheet","Browser"})
	public void TestSetup(String strDatalocation,String strDatasheet,String Browser){
		
		LoginTest gl=new LoginTest(); 
		try{
			gl.setup(strDatalocation, strDatasheet, Browser);
			gl.test();
			driver.quit();
			Reporter.log("Test Script pass");
		}catch(Exception e){
			e.printStackTrace();
			Reporter.log(" Test Script fail");
		}
       }
	
	public void test()  throws Exception {
		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("lrushikeswarreddy@gmail.com");
		
		driver.manage().window().maximize();
		
		  textfield.findByXpath(LoginObjectRepo.username);
		  data.setActiveSheet("Gmail");
		  textfield.setValue(data.getIterationData("UserName", 1));
		  textfield.findByXpath(LoginObjectRepo.pwd);
		  textfield.setValue("Siri@145");
		  
		  WebElement e= driver.findElement(By.xpath(LoginObjectRepo.Submit)); 
		  //button.click();
		  
		// Get entire page screenshot
		  File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  BufferedImage  fullImg = ImageIO.read(screenshot);

		  Point point = e.getLocation();
		  
		// Get width and height of the element
		  int eleWidth = e.getSize().getWidth();
		  int eleHeight = e.getSize().getHeight();

		  // Crop the entire page screenshot to get only element screenshot
		  BufferedImage eleScreenshot= fullImg.getSubimage(point.getX(), point.getY(),
		      30, 300);
		  ImageIO.write(eleScreenshot, "png", screenshot);

		  // Copy the element screenshot to disk
		  File screenshotLocation = new File("F:\\GoogleLogo_screenshot.png");
		  FileUtils.copyFile(screenshot, screenshotLocation);
		 }
}

