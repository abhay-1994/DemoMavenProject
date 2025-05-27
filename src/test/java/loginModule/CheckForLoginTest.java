package loginModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckForLoginTest {
	@Test
	public void loginTestWithValidCredent() {
		WebDriver driver= new ChromeDriver();
		driver.get("https://mvnrepository.com/");
	}

}
