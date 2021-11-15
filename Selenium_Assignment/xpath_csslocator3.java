package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class xpath_csslocator3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SDET_Softwares\\chromedriver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='txtUsername']"));
		driver.findElement(By.xpath("//input[@id='txtPassword']"));
		driver.findElement(By.linkText("Forgot your password?"));
		driver.findElement(By.xpath("//div[@id='divLogo']//child::img"));
		driver.findElement(By.cssSelector("input#txtUsername"));
		driver.findElement(By.cssSelector("input#txtPassword"));

	}

}