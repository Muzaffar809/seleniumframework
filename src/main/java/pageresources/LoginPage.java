package pageresources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;

	

	By signIn = By.xpath("//a[@class='login']");
	By email = By.xpath("//input[@id='email']");
	By password =By.xpath("//input[@id='passwd']");
	By login = By.xpath("//button[@id='SubmitLogin']");
	
	

	public LoginPage(WebDriver driver) {

		this.driver = driver;

	}

	public WebElement sendEmail() {

		return driver.findElement(email);
		

	}
	
	public WebElement sendPassword() {

		return driver.findElement(password);
		

	}
	
	public WebElement submitLogin() {
		
		return driver.findElement(login);
	}

}
