package tests;

import org.openqa.selenium.WebDriver;
import actions.RegisterActions;

public class RegisterTests {
	public static void checkAcceptTermsError(WebDriver driver) {
		
		
	}
	
	public static void makeAndDeleteProfile(WebDriver driver) {
		driver.get("https://staging-env.burdastyle.de/register_account");
		RegisterActions.fillUpTheForm(driver);
		
		
	}

}
