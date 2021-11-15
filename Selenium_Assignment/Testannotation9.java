package SeleniumAssignment;

import java.awt.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Testannotation9 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SDET_Softwares\\chromedriver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.manage().window();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.close();
	}

}