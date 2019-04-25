package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import actions.RegisterActions;
import pageObjects.LoggedInPage;
import pageObjects.Register;

public class RegisterTests {
	public static void checkAcceptTermsError(WebDriver driver) {
		
		
	}
	
	public static void makeAndDeleteProfile(WebDriver driver) throws InterruptedException {
		driver.get("https://staging-env.burdastyle.de/register_account");
		driver.manage().window().maximize();
		RegisterActions.fillUpTheForm(driver);
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).perform();
		
		Actions hover = new Actions(driver);
		hover.moveToElement(LoggedInPage.accountItems(driver)).build().perform();
		if(LoggedInPage.einstellungen(driver)!=null) {
			LoggedInPage.einstellungen(driver).click();
		}
		
		
		
	}

}
