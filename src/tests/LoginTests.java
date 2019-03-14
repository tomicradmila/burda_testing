package tests;
import actions.LoginActions;
import pageObjects.HomePage;

import org.openqa.selenium.WebDriver;

public class LoginTests {
	public static String loginButtonClick(WebDriver driver) {
		String description="check if popup appears";
		String result="test name: "+description+"---- status: ";
		driver.get("https://www.burdastyle.de/");
		LoginActions.LoginButtonClick(driver);
		if(HomePage.willkomenZuruck(driver)!=null) {
			System.out.println("passed");
			return result +"passed";
		}
		else {
			System.out.println("failed");
			return result+"*****failed*****";
		}
		
	}

}
