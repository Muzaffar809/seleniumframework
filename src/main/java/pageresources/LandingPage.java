package pageresources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	
	public WebDriver driver;
	
	 
	 By signIn = By.xpath("//a[@class='login']");
	
	public  LandingPage(WebDriver driver){
		
		this.driver = driver;
		
	}
	
	
	public WebElement clickSigin(){
		
		return driver.findElement(signIn);
		
	}
}
