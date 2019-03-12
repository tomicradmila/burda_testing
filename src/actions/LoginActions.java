package actions;
import pageObjects.HomePage;

import org.openqa.selenium.WebDriver;

public class LoginActions {
	public static void LoginButtonClick(WebDriver driver) {
		HomePage.loginButton(driver).click();
	}
}
