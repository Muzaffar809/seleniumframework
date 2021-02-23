package pageresources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Validations {

	public WebDriver driver;

	

	By title = By.xpath("//h1[@class='page-heading']");
	By contactus = By.xpath("//a[@title='Contact Us']");
	
	
	
	public Validations(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver =driver;
	}



	public WebElement getHeading() {
		
		return driver.findElement(title);
	}
	
	public WebElement contactUs() {
		
		return driver.findElement(contactus);
	}

}
