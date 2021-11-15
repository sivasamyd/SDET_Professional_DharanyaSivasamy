package SeleniumAssignment;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class Question11_12 extends Testbase{
	
	    public static WebDriver driver;
		assignment.OrangePages OrangeOR;
		public static FileInputStream fileLoc;
		public static Properties prop;
	    @BeforeClass
		public void setUp() {

			try {
				fileLoc = new FileInputStream("src/main/resources/test.properties");
				prop = new Properties();
				prop.load(fileLoc);
			}catch(Exception e) {
				e.printStackTrace();
			}

			System.setProperty("webdriver.chrome.driver", "C:\\SDET_Softwares\\chromedriver1\\chromedriver.exe")
			driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.get(prop.getProperty("Url"));
	        }
		@Test(priority=1)
		public void LogInApp() throws InterruptedException {
			String  Name = prop.getProperty("username");
			String  Psword = prop.getProperty("passwd");
			driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(Name);
			driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(Psword);
			driver.findElement(By.id("btnLogin")).click();
			Thread.sleep(1000);
		}
	    
	    public void method1() throws Exception
		{
	        String DashBoardHeader = (OrangeOR).GetDashBoardHeaderText();
			boolean result = DashBoardHeader.equalsIgnoreCase("Dashboard");
			boolean res;
			if(res)
			{
				Thread.sleep(1000);
				captureScreenshot(driver,"DashBoard Passed");
				Assert.assertTrue(true); 
				Reporter.log("User is in Dashboard Menu", true);;
			}
			else
			{
				int i = 1; 
				captureScreenshot(driver,"DashBoard Failed Interation = "+ i);
				Assert.assertTrue(false); 
				Reporter.log("User is NOT in Dashboard Menu", true);
				i++;
			} 
		}
	    @AfterSuite
		public void tearDown() {
			driver.quit();
		}


	}