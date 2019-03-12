package tests;
import actions.LoginActions;
import pageObjects.HomePage;

import org.openqa.selenium.WebDriver;

public class LoginTests {
	public static void loginButtonClick(WebDriver driver) {
		driver.get("https://www.burdastyle.de/");
		LoginActions.LoginButtonClick(driver);
		if(HomePage.willkomenZuruck(driver)!=null) {
			System.out.println("uspesan test");
		}
		else {
			System.out.println("neuspesan test");
		}
		
	}

}
