package testcases;
import page.Login;
import page.SearchHotel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	
	
  @Test
  public void f() {
	  WebDriver driver = new ChromeDriver();
		String page_url="https://adactinhotelapp.com/";
		driver.get(page_url);
		Login login_page = new Login(driver);
		login_page.u_name("vasuvespag");
		login_page.password("vasu1234");
		login_page.login_button();
		
		SearchHotel sh = new SearchHotel(driver);
		sh.locations("Paris");
		sh.hotel("Hotel Sunshine");
	//	sh.search();
		
		
  }
}
