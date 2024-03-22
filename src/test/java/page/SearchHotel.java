package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
//import page.Login;
public class SearchHotel {
	WebDriver driver;

	public SearchHotel(WebDriver driver) {
		//super();
		this.driver = driver;	
	}
	
	
    By location_select = By.id("location");
    By hotel_select = By.id("hotels");
    By Search_button = By.id("Submit");
    
	public void locations(String place) {
		WebElement ele =driver.findElement(location_select);
		Select loc = new Select(ele);
		loc.selectByValue(place);
		
	}
	public void hotel(String hotels) {
		WebElement ele1 =driver.findElement(hotel_select);
		Select hot = new Select(ele1);
		hot.selectByVisibleText(hotels);
		
	}
	public void search() {
		driver.findElement(Search_button).click();
	}
}
