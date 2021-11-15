package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class validate_dashboard4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SDET_Softwares\\chromedriver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");;
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		driver.close();
	}

}