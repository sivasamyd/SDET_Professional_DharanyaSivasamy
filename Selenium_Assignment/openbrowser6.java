package SeleniumAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class openbrowser6 {

	@Test
    public void beforeSuiteTest()
	{
	System.out.println("before Suite");
	}
	@BeforeSuite
	public void before_suite() 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\SDET_Softwares\\chromedriver1\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	driver.manage().window().maximize();
	driver.close();
	}
}