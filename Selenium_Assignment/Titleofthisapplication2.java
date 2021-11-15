package SeleniumAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Titleofthisapplication2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SDET_Softwares\\chromedriver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		String Title = driver.getTitle();
  		System.out.println("Title of application is: " + Title);
 		driver.close();
	}

}