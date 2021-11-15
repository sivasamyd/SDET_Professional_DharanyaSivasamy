package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Question15 extends Testbase{
		OrangePages OrangeOR;
		
		@BeforeMethod
		public void loadPages() {
			System.setProperty("webdriver.chrome.driver", "C:\\SDET_Softwares\\chromedriver1\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		}
		
		@Test(priority = 15)
		public void getElementsByXpath() {
				
			driver.findElement(By.xpath("//input[@id='MP_link']")).click();
			Assert.assertTrue(driver.getCurrentUrl().contains("marketPlace"));
			
			String text = driver.findElement(By.xpath("//a[@id='welcome']")).getText();
			System.out.println(text);
			
			driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
			Assert.assertTrue(driver.getCurrentUrl().contains("admin"));
			
			driver.findElement(By.xpath("//a[@id='menu_dashboard_index']")).click();
			Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
			
			driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]/a[1]")).click();
			Assert.assertTrue(driver.getCurrentUrl().contains("leave"));
			
					
			
			
		}

}