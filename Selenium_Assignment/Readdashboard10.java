package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Readdashboard10 {
	static WebDriver driver ;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SDET_Softwares\\chromedriver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		try {
			driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
			driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys( "admin123");
			driver.findElement(By.id("btnLogin")).click();
			driver.findElement(By.linkText("Dashboard")).click();
			String reqtext = driver.findElement(By.xpath("//div[@class='head']//child::h1")).getText();
			System.out.println(reqtext);
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
			
		}

		

}