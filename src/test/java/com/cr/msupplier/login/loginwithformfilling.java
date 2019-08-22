package supplierregistration;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import utilities.OR;

public class loginwithformfilling {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
        WebDriver d=new ChromeDriver();
		
		d.get("https://msupplier.criticalriver.com");
		
		d.manage().window().maximize();
		
		Thread.sleep(5000);
		
		d.findElement(By.xpath(OR.uname)).sendKeys("gen1995");
		
		d.findElement(By.id(OR.pwd)).sendKeys("Welcome@123");
		
		d.findElement(By.xpath("//button[@id='loginBtn']")).click();
		
		
		//COMPANY DETAILS
		
		
		/*
		 * d.findElement(By.xpath("//textarea[@name='address1']")).
		 * sendKeys("UNITED ARAB EMIRATES");
		 * d.findElement(By.xpath("//textarea[@name='address2']")).
		 * sendKeys("UNITED ARAB EMIRATES");
		 * d.findElement(By.xpath("//input[@name='city']")).
		 * sendKeys("UNITED ARAB EMIRATES");
		 * d.findElement(By.xpath("//input[@name='state']")).
		 * sendKeys("UNITED ARAB EMIRATES");
		 * 
		 * Select drpCountry=new Select(d.findElement(By.name("country")));
		 * drpCountry.selectByVisibleText("UNITED ARAB EMIRATES"); Thread.sleep(5000);
		 * Select drpOfcAreaCode=new Select(d.findElement(By.name("phoneCtryCode")));
		 * drpOfcAreaCode.selectByVisibleText("971"); Thread.sleep(5000);
		 * 
		 * d.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("99999");
		 * d.findElement(By.xpath("//input[@name='phone']")).sendKeys("9999999999");
		 * d.findElement(By.xpath("//input[@name='poBox']")).sendKeys("500043");
		 * 
		 * Select drpFaxAreaCode=new Select(d.findElement(By.name("faxCtryCode")));
		 * drpFaxAreaCode.selectByVisibleText("971"); Thread.sleep(5000);
		 * 
		 * d.findElement(By.xpath("//input[@name='faxAreaCode']")).sendKeys("8888");
		 * d.findElement(By.xpath("//input[@name='fax']")).sendKeys("8888888888");
		 * d.findElement(By.xpath("//input[@name='postalcode']")).sendKeys("12345");
		 * d.findElement(By.xpath("//input[@name='webAddress']")).sendKeys(
		 * "www.testing.com");
		 * d.findElement(By.xpath("//input[@name='emailId']")).sendKeys(
		 * "surya.lakshmi@criticalriver.com");
		 * d.findElement(By.xpath("//input[@name='fAddress']")).
		 * sendKeys("UNITED ARAB EMIRATES");
		 * d.findElement(By.xpath("//input[@name='whAddress']")).
		 * sendKeys("UNITED ARAB EMIRATES");
		 * d.findElement(By.xpath("//input[@name='bType']")).sendKeys("Agent");
		 * 
		 * d.findElement(By.xpath("//input[@name='tnEmpl']")).sendKeys("1233");
		 * d.findElement(By.xpath("//input[@name='deDev']")).sendKeys("2");
		 * d.findElement(By.xpath("//input[@name='amDe']")).sendKeys("5");
		 * d.findElement(By.xpath("//input[@name='production']")).sendKeys("12");
		 * d.findElement(By.xpath("//input[@name='insDetails']")).sendKeys("23");
		 */
		  
		  Screen scr=new Screen();
		  
		/*
		 * d.findElement(By.id("orgChartFile")).click(); Pattern img1=new
		 * Pattern("D:\\selenium\\Images\\downloads.png"); Pattern img2=new
		 * Pattern("D:\\selenium\\Images\\org chart file.png"); Pattern img3=new
		 * Pattern("D:\\selenium\\Images\\open.png");
		 * 
		 * 
		 * scr.wait(img1,5); scr.click(img1); Thread.sleep(5000); scr.wait(img2,5);
		 * scr.click(img2); Thread.sleep(5000); scr.wait(img3,5); scr.click(img3);
		 * Thread.sleep(5000);
		 * 
		 * 
		 * Select drplegalentity=new Select(d.findElement(By.name("legalEntityType")));
		 * drplegalentity.selectByVisibleText("Company"); Thread.sleep(5000);
		 * 
		 * Select drpSupplierType=new Select(d.findElement(By.name("supplierType")));
		 * drpSupplierType.selectByVisibleText("General Supplier"); Thread.sleep(5000);
		 * d.findElement(By.xpath("//input[@name='licenseNo']")).sendKeys(
		 * "3413515153253");
		 * 
		 * d.findElement(By.cssSelector("img.ui-datepicker-trigger")).click();
		 * Thread.sleep(5000);
		 * //d.findElement(By.cssSelector("a[class='ui-state-default ui-state-active']")
		 * ).click();
		 * 
		 * d.findElement(By.xpath(
		 * "//table[@class='ui-datepicker-calendar']/tbody/tr[2]/td[2]/a")).click();
		 * Thread.sleep(5000); // d.findElement(By.linkText("16")); Thread.sleep(2000);
		 * 
		 * d.findElement(By.id("bussregFile")).click();
		 * 
		 * Pattern img4=new Pattern("D:\\selenium\\Images\\downloads.png"); Pattern
		 * img5=new Pattern("D:\\selenium\\Images\\org chart file.png"); Pattern
		 * img6=new Pattern("D:\\selenium\\Images\\open.png"); scr.wait(img4,5);
		 * scr.click(img4); Thread.sleep(5000); scr.wait(img5,5); scr.click(img5);
		 * Thread.sleep(5000); scr.wait(img6,5); scr.click(img6); Thread.sleep(5000);
		 * 
		 * 
		 * Select drpDayFrom=new Select(d.findElement(By.name("workingdayStart")));
		 * drpDayFrom.selectByVisibleText("Sunday"); Thread.sleep(5000);
		 * 
		 * Select drpDayTo=new Select(d.findElement(By.name("workingdayEnd")));
		 * drpDayTo.selectByVisibleText("Friday"); Thread.sleep(5000);
		 * 
		 * d.findElement(By.xpath("//input[@name='placeOfIssue']")).
		 * sendKeys("UNITED ARAB EMIRATES");
		 * 
		 * Select drpTimeFrom=new
		 * Select(d.findElement(By.name("workingTimeStartTime")));
		 * drpTimeFrom.selectByVisibleText("11"); Thread.sleep(5000);
		 * 
		 * Select drpAmrPm1=new Select(d.findElement(By.name("ap")));
		 * drpAmrPm1.selectByVisibleText("AM"); Thread.sleep(5000);
		 * 
		 * Select drpTimeTo=new Select(d.findElement(By.name("workingTimeEndTime")));
		 * drpTimeTo.selectByVisibleText("01"); Thread.sleep(5000);
		 * 
		 * Select drpAmrPm2=new Select(d.findElement(By.name("tap")));
		 * drpAmrPm2.selectByVisibleText("PM"); Thread.sleep(5000);
		 * 
		 * 
		 * d.findElement(By.cssSelector("input#expiryDate + img")).click();
		 * Thread.sleep(5000); d.findElement(By.xpath(
		 * "//table[@class='ui-datepicker-calendar']/tbody/tr[4]/td[4]/a")).click();
		 * Thread.sleep(5000);
		 * 
		 * d.findElement(By.xpath("//input[@name='annualTurnOver']")).sendKeys("678877")
		 * ;
		 * 
		 * 
		 * d.findElement(By.id("finstmtFile")).click();
		 * 
		 * Pattern img7 = new Pattern("D:\\selenium\\Images\\downloads.png"); Pattern
		 * img8 = new Pattern("D:\\selenium\\Images\\org chart file.png"); Pattern img9
		 * = new Pattern("D:\\selenium\\Images\\open.png"); scr.wait(img7, 5);
		 * scr.click(img7); Thread.sleep(5000); scr.wait(img8, 5); scr.click(img8);
		 * Thread.sleep(5000); scr.wait(img9, 5); scr.click(img9); Thread.sleep(5000);
		 * 
		 * 
		 * Select drpTurnOvercrncy = new
		 * Select(d.findElement(By.name("turnOverCurrency")));
		 * drpTurnOvercrncy.selectByVisibleText("United Arab Emirates dirham");
		 * Thread.sleep(5000);
		 * 
		 * 
		 * d.findElement(By.id("csFile")).click();
		 * 
		 * Pattern img10 = new Pattern("D:\\selenium\\Images\\downloads.png"); Pattern
		 * img11 = new Pattern("D:\\selenium\\Images\\org chart file.png"); Pattern
		 * img12 = new Pattern("D:\\selenium\\Images\\open.png"); scr.wait(img10, 5);
		 * scr.click(img10); Thread.sleep(5000); scr.wait(img11, 5); scr.click(img11);
		 * Thread.sleep(5000); scr.wait(img12, 5); scr.click(img12); Thread.sleep(5000);
		 * 
		 * 
		 * d.findElement(By.xpath("//input[@name='taxRegNo']")).sendKeys(
		 * "378237732578123");
		 * d.findElement(By.xpath("//input[@name='taxPayerId']")).sendKeys("67865567");
		 * d.findElement(By.cssSelector("input#taxEffectiveDate + img")).click();
		 * Thread.sleep(5000); d.findElement(By.xpath(
		 * "//table[@class='ui-datepicker-calendar']/tbody/tr[4]/td[4]/a")).click();
		 * Thread.sleep(5000);
		 * 
		 * d.findElement(By.xpath("//input[@name='potAnnualRevenue']")).sendKeys(
		 * "67265567");
		 * 
		 * 
		 * d.findElement(By.id("vatFile")).click();
		 * 
		 * Pattern img13 = new Pattern("./Images/downloads.png"); Pattern img14 = new
		 * Pattern("./Images/org chart file.png"); Pattern img15 = new
		 * Pattern("./Images/open.png");
		 * 
		 * 
		 * scr.wait(img13, 5); scr.click(img13); Thread.sleep(5000); scr.wait(img14, 5);
		 * scr.click(img14); Thread.sleep(5000); scr.wait(img15, 5); scr.click(img15);
		 * Thread.sleep(5000);
		 * 
		 * d.findElement(By.xpath("//input[@name='parentCompanyName']")).sendKeys("crt")
		 * ;
		 * 
		 * d.findElement(By.xpath("//textarea[@name='parentCompanyAddr']")).
		 * sendKeys("UNITED ARAB EMIRATES");
		 * 
		 * //d.findElement(By.xpath("//input[@name='taxRegNo']")).sendKeys(
		 * "378237732578");
		 * 
		 * Select drpPhnNo=new Select(d.findElement(By.name("prntCmpyPhnCtryCode")));
		 * drpPhnNo.selectByVisibleText("971"); Thread.sleep(5000);
		 * 
		 * d.findElement(By.xpath("//input[@name='prntCmpyPhnAreacode']")).sendKeys(
		 * "971");
		 * 
		 * d.findElement(By.xpath("//input[@name='prntCmpyPhone']")).sendKeys("35252524"
		 * ); d.findElement(By.xpath("//input[@name='url']")).sendKeys("www.abcd.com");
		 */
		  d.findElement(By.xpath("//button[@id='basicSubmit']")).click();
		 
		  
		  
		  
        //PROJECT EXPERIENCE DETAILS
		
		/*
		 * d.findElement(By.id("refCompanyName")).sendKeys("ref1");
		 * d.findElement(By.id("designation")).sendKeys("Software");
		 * d.findElement(By.id("contactName")).sendKeys("contcat1");
		 * d.findElement(By.id("department")).sendKeys("Testing");
		 * d.findElement(By.id("email")).sendKeys("surya.lakshmi@criticalriver.com");
		 * 
		 * Select drpmob1=new Select(d.findElement(By.name("mobileCtryCode")));
		 * drpmob1.selectByVisibleText("380"); Thread.sleep(5000);
		 * d.findElement(By.id("mobile")).sendKeys("9987654321");
		 * 
		 * Select drpLand1=new Select(d.findElement(By.name("phoneCtryCode")));
		 * drpLand1.selectByVisibleText("380"); Thread.sleep(5000);
		 * d.findElement(By.id("areacode")).sendKeys("998");
		 * d.findElement(By.id("phone")).sendKeys("463634734");
		 * 
		 * Select drpFax1=new Select(d.findElement(By.name("faxCtryCode")));
		 * drpFax1.selectByVisibleText("380"); Thread.sleep(5000);
		 * d.findElement(By.id("faxareacode")).sendKeys("998");
		 * d.findElement(By.id("fax")).sendKeys("463634734734998");
		 * 
		 * d.findElement(By.id("aedValue")).sendKeys("4998");
		 * 
		 * d.findElement(By.id("conSchedule")).sendKeys("46");
		 * 
		 * d.findElement(By.id("scopeOfWork")).sendKeys("scope of work");
		 * 
		 * d.findElement(By.id("contComp")).sendKeys("56");
		 * 
		 * d.findElement(By.cssSelector("input#comSchedule + img")).click();
		 * Thread.sleep(5000); d.findElement(By.xpath(
		 * "//table[@class='ui-datepicker-calendar']/tbody/tr[1]/td[3]/a")).click();
		 * Thread.sleep(5000); d.findElement(By.xpath("//input[@id='refBtn']")).click();
		 */
		
		
		/*
		 * d.findElement(By.id("refCompanyName")).sendKeys("ref2");
		 * d.findElement(By.id("designation")).sendKeys("Trainee");
		 * d.findElement(By.id("contactName")).sendKeys("contcat2");
		 * d.findElement(By.id("department")).sendKeys("Testing");
		 * d.findElement(By.id("email")).sendKeys("surya.lakshmi@criticalriver.com");
		 * 
		 * Select drpmob2=new Select(d.findElement(By.name("mobileCtryCode")));
		 * drpmob2.selectByVisibleText("380"); Thread.sleep(5000);
		 * d.findElement(By.id("mobile")).sendKeys("993333333333");
		 * 
		 * Select drpLand2=new Select(d.findElement(By.name("phoneCtryCode")));
		 * drpLand2.selectByVisibleText("380"); Thread.sleep(5000);
		 * d.findElement(By.id("areacode")).sendKeys("998");
		 * d.findElement(By.id("phone")).sendKeys("46362324");
		 * 
		 * Select drpFax2=new Select(d.findElement(By.name("faxCtryCode")));
		 * drpFax2.selectByVisibleText("380"); Thread.sleep(5000);
		 * d.findElement(By.id("faxareacode")).sendKeys("998");
		 * d.findElement(By.id("fax")).sendKeys("4636347346346368");
		 * 
		 * d.findElement(By.id("aedValue")).sendKeys("4950");
		 * 
		 * d.findElement(By.id("conSchedule")).sendKeys("60");
		 * 
		 * d.findElement(By.id("scopeOfWork")).sendKeys("scope of work");
		 * 
		 * d.findElement(By.id("contComp")).sendKeys("60");
		 * 
		 * d.findElement(By.cssSelector("input#comSchedule + img")).click();
		 * Thread.sleep(5000); d.findElement(By.xpath(
		 * "//table[@class='ui-datepicker-calendar']/tbody/tr[3]/td[2]/a")).click();
		 * Thread.sleep(5000); d.findElement(By.xpath("//input[@id='refBtn']")).click();
		 * 
		 * 
		 * d.findElement(By.id("refCompanyName")).sendKeys("ref3");
		 * d.findElement(By.id("designation")).sendKeys("Software Trainee");
		 * d.findElement(By.id("contactName")).sendKeys("contcat3");
		 * d.findElement(By.id("department")).sendKeys("Testing");
		 * d.findElement(By.id("email")).sendKeys("surya.lakshmi@criticalriver.com");
		 * 
		 * Select drpmob3=new Select(d.findElement(By.name("mobileCtryCode")));
		 * drpmob3.selectByVisibleText("380"); Thread.sleep(5000);
		 * d.findElement(By.id("mobile")).sendKeys("8888888888");
		 * 
		 * Select drpLand3=new Select(d.findElement(By.name("phoneCtryCode")));
		 * drpLand3.selectByVisibleText("380"); Thread.sleep(5000);
		 * d.findElement(By.id("areacode")).sendKeys("998");
		 * d.findElement(By.id("phone")).sendKeys("878687");
		 * 
		 * Select drpFax3=new Select(d.findElement(By.name("faxCtryCode")));
		 * drpFax3.selectByVisibleText("380"); Thread.sleep(5000);
		 * d.findElement(By.id("faxareacode")).sendKeys("998");
		 * d.findElement(By.id("fax")).sendKeys("99999946346368");
		 * 
		 * d.findElement(By.id("aedValue")).sendKeys("4950");
		 * 
		 * d.findElement(By.id("conSchedule")).sendKeys("60");
		 * 
		 * d.findElement(By.id("scopeOfWork")).sendKeys("scope of work");
		 * 
		 * d.findElement(By.id("contComp")).sendKeys("70");
		 * 
		 * d.findElement(By.cssSelector("input#comSchedule + img")).click();
		 * Thread.sleep(5000); d.findElement(By.xpath(
		 * "//table[@class='ui-datepicker-calendar']/tbody/tr[3]/td[3]/a")).click();
		 * Thread.sleep(5000); d.findElement(By.xpath("//input[@id='refBtn']")).click();
		 */
		  Thread.sleep(2000);
		d.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        
		
		
		//CONTACT DETAILS
		
		/*
		 * d.findElement(By.xpath("//input[@name='contactName']")).sendKeys("contact1");
		 * d.findElement(By.id("department")).sendKeys("Testing");
		 * d.findElement(By.id("email")).sendKeys("surya.lakshmi@criticalriver.com");
		 * d.findElement(By.id("designation")).sendKeys("Software"); Select drpLan=new
		 * Select(d.findElement(By.id("phoneCtryCode")));
		 * drpLan.selectByVisibleText("971"); Thread.sleep(2000);
		 * 
		 * d.findElement(By.id("areacode")).sendKeys("1234");
		 * d.findElement(By.id("phone")).sendKeys("9987654567");
		 * 
		 * Select drpMobile=new Select(d.findElement(By.id("mobileCtryCode")));
		 * drpMobile.selectByVisibleText("971"); Thread.sleep(2000);
		 * 
		 * d.findElement(By.id("mobile")).sendKeys("1234567899");
		 * 
		 * Select drpCntCat=new Select(d.findElement(By.id("contactCategory")));
		 * drpCntCat.selectByVisibleText("Finance"); Thread.sleep(2000);
		 * 
		 * Select drpFaxCntCode=new Select(d.findElement(By.id("faxCtryCode")));
		 * drpFaxCntCode.selectByVisibleText("971"); Thread.sleep(2000);
		 * 
		 * d.findElement(By.id("faxareacode")).sendKeys("4567");
		 * d.findElement(By.id("fax")).sendKeys("998765456745667");
		 * 
		 * Select drpFaxCntType=new Select(d.findElement(By.id("contactType")));
		 * drpFaxCntType.selectByVisibleText("Local"); Thread.sleep(2000);
		 * 
		 * WebElement radioNoBtn=d.findElement(By.id("primaryContactNo"));
		 * radioNoBtn.click();
		 * 
		 * d.findElement(By.id("asFile")).click(); Pattern img16=new
		 * Pattern("./Images/downloads.png"); Pattern img17=new
		 * Pattern("./Images/org chart file.png"); Pattern img18=new
		 * Pattern("./Images/open.png"); scr.wait(img16, 5); scr.click(img16);
		 * Thread.sleep(5000); scr.wait(img17, 5); scr.click(img17); Thread.sleep(5000);
		 * scr.wait(img18, 5); scr.click(img18); Thread.sleep(5000);
		 * d.findElement(By.id("conAdd")).click();
		 * 
		 * 
		 * d.findElement(By.xpath("//input[@name='contactName']")).sendKeys("contact2");
		 * d.findElement(By.id("department")).sendKeys("Testing");
		 * d.findElement(By.id("email")).sendKeys("surya.lakshmi@criticalriver.com");
		 * d.findElement(By.id("designation")).sendKeys("Software Trainee"); Select
		 * drpLan1=new Select(d.findElement(By.id("phoneCtryCode")));
		 * drpLan1.selectByVisibleText("971"); Thread.sleep(2000);
		 * 
		 * d.findElement(By.id("areacode")).sendKeys("2345");
		 * d.findElement(By.id("phone")).sendKeys("9987623537");
		 * 
		 * Select drpMobile1=new Select(d.findElement(By.id("mobileCtryCode")));
		 * drpMobile1.selectByVisibleText("971"); Thread.sleep(2000);
		 * 
		 * d.findElement(By.id("mobile")).sendKeys("9988776656");
		 * 
		 * Select drpCntCat1=new Select(d.findElement(By.id("contactCategory")));
		 * drpCntCat1.selectByVisibleText("Sales Services"); Thread.sleep(2000);
		 * 
		 * Select drpFaxCntCode1=new Select(d.findElement(By.id("faxCtryCode")));
		 * drpFaxCntCode1.selectByVisibleText("971"); Thread.sleep(2000);
		 * 
		 * d.findElement(By.id("faxareacode")).sendKeys("3234");
		 * d.findElement(By.id("fax")).sendKeys("373473433643");
		 * 
		 * Select drpFaxCntType1=new Select(d.findElement(By.id("contactType")));
		 * drpFaxCntType1.selectByVisibleText("Local"); Thread.sleep(2000);
		 * 
		 * WebElement radioNoBtn1=d.findElement(By.id("primaryContactNo"));
		 * radioNoBtn1.click();
		 * 
		 * d.findElement(By.id("asFile")).click(); Pattern img19=new
		 * Pattern("./Images/downloads.png"); Pattern img20=new
		 * Pattern("./Images/org chart file.png"); Pattern img21=new
		 * Pattern("./Images/open.png"); scr.wait(img19, 5); scr.click(img19);
		 * Thread.sleep(5000); scr.wait(img20, 5); scr.click(img20); Thread.sleep(5000);
		 * scr.wait(img21, 5); scr.click(img21); Thread.sleep(5000);
		 * d.findElement(By.id("conAdd")).click(); Thread.sleep(5000);
		 * 
		 * WebElement radioMemBtn=d.findElement(By.id("memberRelatedToyes"));
		 * radioMemBtn.click();
		 * 
		 * d.findElement(By.id("memberRelatedContName")).sendKeys("Surya Lakshmi");
		 * d.findElement(By.id("memberRelatedDesignation")).
		 * sendKeys("Software developer");
		 * 
		 * d.findElement(By.id("memberRelatedDepartment")).sendKeys("Development");
		 * 
		 * Thread.sleep(5000);
		 */

		Thread.sleep(5000);
		 d.findElement(By.id("conSave")).click();
         
		 
		 //SCOPE OF SUPPLIERS
		
		/*
		 * WebElement radioGoodsYesBtn=d.findElement(By.id("goodsProvYes"));
		 * radioGoodsYesBtn.click();
		 * 
		 * d.findElement(By.id("exName")).sendKeys("test");
		 * d.findElement(By.id("exSrch")).click(); Thread.sleep(3000);
		 * d.findElement(By.xpath(
		 * "//table[@id='exscopeSupplyTab']/tbody/tr[3]/td[1]/input")).click();
		 * d.findElement(By.xpath("//input[@id='exgoods']")).click();
		 * 
		 * d.findElement(By.id("gsName")).sendKeys("test");
		 * d.findElement(By.id("gsSrch")).click(); Thread.sleep(3000);
		 * d.findElement(By.id("selGoods")).click();
		 * d.findElement(By.xpath("//input[@id='aegoods']")).click();
		 * 
		 * d.findElement(By.xpath(
		 * "//form[@id='supp-sssmove-form']/table/tbody/tr[1]/td[2]/textarea")).
		 * sendKeys("sample test data1");;
		 * 
		 * d.findElement(By.xpath(
		 * "//form[@id='supp-sssmove-form']/table/tbody/tr[2]/td[2]/textarea")).
		 * sendKeys("sample test data2");;
		 * 
		 * 
		 * d.findElement(By.id("agentCert")).click(); Pattern img22=new
		 * Pattern("./Images/downloads.png"); Pattern img23=new
		 * Pattern("./Images/org chart file.png"); Pattern img24=new
		 * Pattern("./Images/open.png"); scr.wait(img22, 5); scr.click(img22);
		 * Thread.sleep(5000); scr.wait(img23, 5); scr.click(img23); Thread.sleep(5000);
		 * scr.wait(img24, 5); scr.click(img24); Thread.sleep(5000);
		 * 
		 * d.findElement(By.id("productCategory")).click(); Pattern img25=new
		 * Pattern("./Images/downloads.png"); Pattern img26=new
		 * Pattern("./Images/org chart file.png"); Pattern img27=new
		 * Pattern("./Images/open.png"); scr.wait(img25, 5); scr.click(img25);
		 * Thread.sleep(5000); scr.wait(img26, 5); scr.click(img26); Thread.sleep(5000);
		 * scr.wait(img27, 5); scr.click(img27); Thread.sleep(5000);
		 * 
		 * 
		 * d.findElement(By.id("yearOfExpLocUae")).sendKeys("3");
		 * d.findElement(By.id("yearOfExpInternational")).sendKeys("3");
		 */
         d.findElement(By.id("conSave")).click(); 
		
         //CERTIFICATES
		/*
		 * d.findElement(By.id("qualCertYes")).click();
		 * d.findElement(By.cssSelector("input#qExpiryDate + img")).click();
		 * Thread.sleep(5000); d.findElement(By.xpath(
		 * "//table[@class='ui-datepicker-calendar']/tbody/tr[4]/td[4]/a")).click();
		 * Thread.sleep(5000); d.findElement(By.id("qualityDocs")).click(); Pattern
		 * img28=new Pattern("./Images/downloads.png"); Pattern img29=new
		 * Pattern("./Images/org chart file.png"); Pattern img30=new
		 * Pattern("./Images/open.png"); scr.wait(img28, 5); scr.click(img28);
		 * Thread.sleep(5000); scr.wait(img29, 5); scr.click(img29); Thread.sleep(5000);
		 * scr.wait(img30, 5); scr.click(img30); Thread.sleep(5000);
		 * d.findElement(By.id("qRemarks")).sendKeys("No");
		 * d.findElement(By.id("qupload")).click();
		 * 
		 * d.findElement(By.id("qualIsoCertYes")).click();
		 * d.findElement(By.cssSelector("input#isoExpiryDate + img")).click();
		 * Thread.sleep(5000); d.findElement(By.xpath(
		 * "//table[@class='ui-datepicker-calendar']/tbody/tr[4]/td[2]/a")).click();
		 * Thread.sleep(5000); d.findElement(By.id("isoDocs")).click(); Pattern
		 * img31=new Pattern("./Images/downloads.png"); Pattern img32=new
		 * Pattern("./Images/org chart file.png"); Pattern img33=new
		 * Pattern("./Images/open.png"); scr.wait(img31, 5); scr.click(img31);
		 * Thread.sleep(5000); scr.wait(img32, 5); scr.click(img32); Thread.sleep(5000);
		 * scr.wait(img33, 5); scr.click(img33); Thread.sleep(5000);
		 * d.findElement(By.id("isoRemarks")).sendKeys("No");
		 * d.findElement(By.id("isoupload")).click();
		 * 
		 * d.findElement(By.id("healthSafetyYes")).click();
		 * d.findElement(By.id("healthCertYes")).click();
		 * d.findElement(By.cssSelector("input#hscExpiryDate + img")).click();
		 * Thread.sleep(5000); d.findElement(By.xpath(
		 * "//table[@class='ui-datepicker-calendar']/tbody/tr[4]/td[3]/a")).click();
		 * Thread.sleep(5000); d.findElement(By.id("hscDocs")).click(); Pattern
		 * img34=new Pattern("./Images/downloads.png"); Pattern img35=new
		 * Pattern("./Images/org chart file.png"); Pattern img36=new
		 * Pattern("./Images/open.png"); scr.wait(img34, 5); scr.click(img34);
		 * Thread.sleep(5000); scr.wait(img35, 5); scr.click(img35); Thread.sleep(5000);
		 * scr.wait(img36, 5); scr.click(img36); Thread.sleep(5000);
		 * d.findElement(By.id("hscRemarks")).sendKeys("No");
		 * d.findElement(By.id("hscupload")).click();
		 * 
		 * d.findElement(By.id("InfoSecurityYes")).click();
		 * d.findElement(By.id("InfoSecurityCertYes")).click();
		 * 
		 * d.findElement(By.cssSelector("input#ismExpiryDate + img")).click();
		 * Thread.sleep(5000); d.findElement(By.xpath(
		 * "//table[@class='ui-datepicker-calendar']/tbody/tr[4]/td[5]/a")).click();
		 * Thread.sleep(5000); d.findElement(By.id("ismDocs")).click(); Pattern
		 * img37=new Pattern("./Images/downloads.png"); Pattern img38=new
		 * Pattern("./Images/org chart file.png"); Pattern img39=new
		 * Pattern("./Images/open.png"); scr.wait(img37, 5); scr.click(img37);
		 * Thread.sleep(5000); scr.wait(img38, 5); scr.click(img38); Thread.sleep(5000);
		 * scr.wait(img39, 5); scr.click(img39); Thread.sleep(5000);
		 * d.findElement(By.id("ismRemarks")).sendKeys("No");
		 * d.findElement(By.id("ismupload")).click();
		 * 
		 * d.findElement(By.id("EMSYes")).click();
		 * d.findElement(By.id("EMSCertYes")).click();
		 * 
		 * d.findElement(By.cssSelector("input#eExpiryDate + img")).click();
		 * Thread.sleep(5000); d.findElement(By.xpath(
		 * "//table[@class='ui-datepicker-calendar']/tbody/tr[4]/td[6]/a")).click();
		 * Thread.sleep(5000); d.findElement(By.id("eOffBran")).sendKeys("Test");
		 * d.findElement(By.id("envDocs")).click(); Pattern img40=new
		 * Pattern("./Images/downloads.png"); Pattern img41=new
		 * Pattern("./Images/org chart file.png"); Pattern img42=new
		 * Pattern("./Images/open.png"); scr.wait(img40, 5); scr.click(img40);
		 * Thread.sleep(5000); scr.wait(img41, 5); scr.click(img41); Thread.sleep(5000);
		 * scr.wait(img42, 5); scr.click(img42); Thread.sleep(5000);
		 * d.findElement(By.id("eRemarks")).sendKeys("No");
		 * d.findElement(By.id("envupload")).click();
		 * 
		 * d.findElement(By.id("empLYes")).click();
		 * d.findElement(By.cssSelector("input#elExpiryDate + img")).click();
		 * Thread.sleep(5000); d.findElement(By.xpath(
		 * "//table[@class='ui-datepicker-calendar']/tbody/tr[4]/td[7]/a")).click();
		 * Thread.sleep(5000); d.findElement(By.id("elDocs")).click(); Pattern img43=new
		 * Pattern("./Images/downloads.png"); Pattern img44=new
		 * Pattern("./Images/org chart file.png"); Pattern img45=new
		 * Pattern("./Images/open.png"); scr.wait(img43, 5); scr.click(img43);
		 * Thread.sleep(5000); scr.wait(img44, 5); scr.click(img44); Thread.sleep(5000);
		 * scr.wait(img45, 5); scr.click(img45); Thread.sleep(5000);
		 * d.findElement(By.id("elRemarks")).sendKeys("No");
		 * d.findElement(By.id("elupload")).click();
		 * 
		 * d.findElement(By.id("pubLYes")).click();
		 * d.findElement(By.cssSelector("input#plExpiryDate + img")).click();
		 * Thread.sleep(5000); d.findElement(By.xpath(
		 * "//table[@class='ui-datepicker-calendar']/tbody/tr[5]/td[1]/a")).click();
		 * Thread.sleep(5000); d.findElement(By.id("plDocs")).click(); Pattern img46=new
		 * Pattern("./Images/downloads.png"); Pattern img47=new
		 * Pattern("./Images/org chart file.png"); Pattern img48=new
		 * Pattern("./Images/open.png"); scr.wait(img46, 5); scr.click(img46);
		 * Thread.sleep(5000); scr.wait(img47, 5); scr.click(img47); Thread.sleep(5000);
		 * scr.wait(img48, 5); scr.click(img48); Thread.sleep(5000);
		 * d.findElement(By.id("plRemarks")).sendKeys("No");
		 * d.findElement(By.id("plupload")).click();
		 */
		 d.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		 
		 
		 //BANK DETAILS
		/*
		 * Select drpBankCntry=new Select(d.findElement(By.id("country")));
		 * drpBankCntry.selectByVisibleText("UNITED KINGDOM"); Thread.sleep(2000);
		 * 
		 * Select drpcurncyCntry=new Select(d.findElement(By.id("currency")));
		 * drpcurncyCntry.selectByVisibleText("United Arab Emirates dirham");
		 * Thread.sleep(2000);
		 * 
		 * Select drpbankpartyID=new Select(d.findElement(By.id("bankPartyId")));
		 * //drpbankpartyID.selectByVisibleText("Barclay's Bank");
		 * drpbankpartyID.selectByIndex(1);
		 * 
		 * Thread.sleep(2000);
		 * 
		 * Select drpbankbranchpartyID=new
		 * Select(d.findElement(By.id("branchPartyId")));
		 * drpbankbranchpartyID.selectByVisibleText("London"); Thread.sleep(5000);
		 * 
		 * d.findElement(By.id("beneficiaryName")).sendKeys("Test bank");
		 * Thread.sleep(5000);
		 * 
		 * d.findElement(By.id("beneficiaryAddress")).sendKeys("London");
		 * Thread.sleep(5000);
		 * 
		 * d.findElement(By.id("accountNo")).sendKeys("31926819"); Thread.sleep(5000);
		 * 
		 * d.findElement(By.id("swiftCode")).sendKeys("IIIGGB22"); Thread.sleep(5000);
		 * 
		 * d.findElement(By.id("ibanNo")).sendKeys("GB29NWBK60161331926819");
		 * Thread.sleep(5000);
		 * 
		 * d.findElement(By.id("primaryAccount")).click();
		 * d.findElement(By.id("bankLetter")).click(); Pattern img49=new
		 * Pattern("./Images/downloads.png"); Pattern img50=new
		 * Pattern("./Images/org chart file.png"); Pattern img51=new
		 * Pattern("./Images/open.png"); scr.wait(img49, 5); scr.click(img49);
		 * Thread.sleep(5000); scr.wait(img50, 5); scr.click(img50); Thread.sleep(5000);
		 * scr.wait(img51, 5); scr.click(img51); Thread.sleep(5000);
		 * 
		 * 
		 * d.findElement(By.id("addInter")).click();
		 * 
		 * 
		 * Select drpBankCntry1=new Select(d.findElement(By.id("icountry")));
		 * drpBankCntry1.selectByVisibleText("UNITED KINGDOM"); Thread.sleep(2000);
		 * 
		 * Select drpcurncyCntry1=new Select(d.findElement(By.id("icurrency")));
		 * drpcurncyCntry1.selectByVisibleText("United Arab Emirates dirham");
		 * Thread.sleep(2000);
		 * 
		 * Select drpbankpartyID1=new Select(d.findElement(By.id("ibankPartyId")));
		 * drpbankpartyID1.selectByIndex(1); Thread.sleep(2000);
		 * 
		 * Select drpbankbranchpartyID1=new
		 * Select(d.findElement(By.id("ibranchPartyId")));
		 * drpbankbranchpartyID1.selectByVisibleText("London"); Thread.sleep(2000);
		 * d.findElement(By.id("ibeneficiaryName")).sendKeys("Test bank1");
		 * d.findElement(By.id("ibeneficiaryAddress")).sendKeys("London1");
		  
		 * d.findElement(By.id("iaccountNo")).sendKeys("31926819");
		 
		 * d.findElement(By.id("iswiftCode")).sendKeys("IIIGGB22");
		 * 
		 * d.findElement(By.id("iibanNo")).sendKeys("GB29NWBK60161331926819");
		 * 
		 * d.findElement(By.xpath(
		 * "//form[@id='supp-bbnk-form']/div[2]/input")).click(); Thread.sleep(5000);
		 */
		 Thread.sleep(2000);
		  d.findElement(By.xpath("//button[@id='bankSubmit']")).click();
		  
		 
		 //QUESTIONNARIE
		  Thread.sleep(5000);
		  d.findElement(By.xpath("//button[@id='regsub']")).click();
		  Thread.sleep(2000);

		  
		 //REVIEW AND SUBMIT
		  d.findElement(By.xpath("//textarea[@id='notesToApprover']")).sendKeys("Notes for approval process");
		  Thread.sleep(3000);
		  d.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[3]/div[1]/form[1]/div[1]/div[3]/div[1]/input[1]")).click();
		  d.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[3]/div[1]/form[1]/div[1]/div[3]/div[1]/input[2]")).click();
		  d.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[3]/div[1]/form[1]/div[1]/div[3]/div[1]/input[3]")).click();

		  //d.findElement(By.xpath( "//form[@id='supp-review-form']/div/div[3]/div/a/input")).click();
		  //d.findElement(By.xpath( "//div[@class='box-footer']/div/a[1]/input")).click(); 

		  //d.findElement(By.xpath("//div[@class='pull-right']/a[3]/input")).click();
		  d.findElement(By.xpath("//button[@id='regsub']")).click();
		  d.findElement(By.xpath("//button[@id='conYes']")).click();

		  




		
	}
	
	}

