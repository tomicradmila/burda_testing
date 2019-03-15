package pageObjects;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WillkomenZuruck {
	public static WebElement dismissButton (WebDriver driver) {
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement dismissButton;
		try {
			 dismissButton=wait.until(ExpectedConditions.elementToBeClickable(By.id("drupal-modal")));
		}
		
		catch(Exception e) {
			return null;
		}
				
		return dismissButton;				
	}
	
public static WebElement username (WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement username;
		try {
			 username=wait.until(ExpectedConditions.elementToBeClickable(By.id("username")));
		}
		catch(Exception e) {
			return null;
		}
		return username;				
	}


public static WebElement password (WebDriver driver) {
	WebDriverWait wait = new WebDriverWait(driver, 5);
	WebElement password;
	try {
		 password=wait.until(ExpectedConditions.elementToBeClickable(By.id("password")));
	}
	catch(Exception e) {
		return null;
	}
	return password;				
}

public static WebElement merkenCheckbox (WebDriver driver) {
	WebDriverWait wait = new WebDriverWait(driver, 5);
	WebElement merkenCheckbox;
	try {
		 merkenCheckbox=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@id, 'edit-remember-me')]")));
	}
	catch(Exception e) {
		return null;
	}
	return merkenCheckbox;				
}

}
