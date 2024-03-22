package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login{
	WebDriver driver;

	public Login(WebDriver driver) {
		//super();
		this.driver = driver;
	}
	By user_name = By.id("username");
	By pass = By.id("password");
	By login_page = By.id("login");
//	By location_select = By.id("location");

	public void u_name(String uname) {
		driver.findElement(user_name).sendKeys(uname);
	}
	public void password(String pwd) {
		driver.findElement(pass).sendKeys(pwd);
	}
	public void login_button() {
		driver.findElement(login_page).click();
	}
	System.out.println("added changes");
System.out.println("added changes again");
}
