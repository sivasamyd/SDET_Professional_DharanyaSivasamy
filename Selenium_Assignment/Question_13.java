package SeleniumAssignment;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Question_13 extends Testbase{	
	OrangePages OrangeOR;	

	@BeforeMethod
	public void loadPages() {
		OrangeOR = new OrangePages(driver);
	}
	
	@Test(priority = 13)
	public void  getPIMEmployeeMenu() throws Exception {
		Thread.sleep(2000);
		OrangeOR.ClickOnPIMTab();
		Assert.assertTrue(driver.getCurrentUrl().contains("pim"));
		OrangeOR.setEmployeeTextFieldInput("Linda Anderson");
		captureScreenshot(driver,"getPIMEmployeeMenu");	
		
	}



}