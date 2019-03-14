package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WillkomenZuruck {
	public static WebElement dismissButton (WebDriver driver) {
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		try {
			WebElement dismissButton=wait.until(ExpectedConditions.elementToBeClickable(By.id("drupal-modal")));
		}
		
		catch(Exception e) {
			return null;
		}
				
		return null;				
	}

}
