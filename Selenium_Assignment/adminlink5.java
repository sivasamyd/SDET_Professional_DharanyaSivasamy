package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class adminlink5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SDET_Softwares\\chromedriver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		;
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		System.out.println("Login success");
		driver.findElement(By.linkText("Admin")).click();
		System.out.println(driver.getPageSource().contains("User Managements") ? "User Management is present."
				: "User Management is absent.");
		System.out.println(driver.getPageSource().contains("Organization") ? "Organization is present."
				: "Organization is absent.");
		System.out.println(driver.getPageSource().contains("Qualifications") ? "Qualifications is  present."
				: "Qualifications is absent.");
		System.out.println(driver.getPageSource().contains("Job") ? "Job is  present." : "Job is absent.");
		driver.close();
	}

}