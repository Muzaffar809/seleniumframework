package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public WebDriver driver;
	public Properties prop = new Properties();
	
	
	public WebDriver driverInitilization() throws IOException {
	//D:\Courses\Selenium\workspace\SeleniumFramework\src\main\java\Automation\data.properties
	FileInputStream finput = new FileInputStream("D:\\Courses\\Selenium\\workspace\\Selenium\\src\\main\\java\\resources\\data.properties");
	
	
	prop.load(finput);
	String webBrowser=prop.getProperty("browser");
	
	if(webBrowser.equals("chrome")) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Courses\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	else if(webBrowser=="firefox") {
		
		//firefox code
	}
	else if(webBrowser=="IE") {
		
		//IE code
	}
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
	
	}

}
