package SeleniumAssignment;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;

@Test
public class Loginapplication7 {
	WebDriver driver;
	@BeforeTest()
	public void openbrowser() {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\SDET_Softwares\\chromedriver1\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.manage().window().maximize();
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	public void StartTestStep2() {
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
	}
	
}