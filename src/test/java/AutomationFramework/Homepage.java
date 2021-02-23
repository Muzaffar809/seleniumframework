package AutomationFramework;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageresources.*;
import resources.BaseClass;

public class Homepage extends BaseClass {
	
	public static Logger log = LogManager.getLogger(BaseClass.class.getName());
	
	
@BeforeTest
public void initialize() throws IOException {
	 driver = driverInitilization();
	 driver.get(prop.getProperty("url"));
	 log.info("Url Loaded");
}

	
	@Test(dataProvider= "getdata")
	public void homepagaeNavigation(String username, String Password)  {
	
	 
	 LandingPage lp = new LandingPage(driver);
	 LoginPage login = new LoginPage(driver);
	 Validations val = new Validations(driver);
	 
	
	 lp.clickSigin().click();
	 login.sendEmail().sendKeys(username);
	 login.sendPassword().sendKeys(Password);
	
	 login.submitLogin().click();
	 
	 log.info("Logged In Succesfully");
	
	 Assert.assertEquals(val.getHeading().getText(), "MY ACCOUNT");
	 
	 log.info("Heading found Succesfully");
	 
	 Assert.assertTrue(val.contactUs().isEnabled());
	

	
	}
	
	
	@DataProvider
	public Object[][] getdata(){
		
		Object[][] data=new Object[1][2];
		
		data[0][0]="game119@gmail.com";
		data[0][1]="test@123";
		
		
		
		return data;
		
	}
	
	@AfterTest
	public void tearDown() {
		
		driver.close();
		
	}
	
}
