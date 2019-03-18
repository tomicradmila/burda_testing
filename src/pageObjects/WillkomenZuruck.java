package pageObjects;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WillkomenZuruck {
	
	//1
	public static WebElement title (WebDriver driver) {
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement title;
		try {
			 title=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(), 'Willkommen')]")));
		}
		
		catch(Exception e) {
			return null;
		}
				
		return title;				
	}
	
	//2
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
	
	//3
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

//4
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

//5
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

//6

public static WebElement passwortVergessen (WebDriver driver) {
	WebDriverWait wait = new WebDriverWait(driver, 5);
	WebElement passwortVergessen;
	try {
		 passwortVergessen=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@id, 'edit-forget-password')]")));
	}
	catch(Exception e) {
		return null;
	}
	return passwortVergessen;				
}

//7
public static WebElement anmeldenButton (WebDriver driver) {
	WebDriverWait wait = new WebDriverWait(driver, 5);
	WebElement anmeldenButton;
	try {
		 anmeldenButton=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@id, 'edit-submit')]")));
	}
	catch(Exception e) {
		return null;
	}
	return anmeldenButton;				
}

//8
public static WebElement registrierenButton (WebDriver driver) {
	WebDriverWait wait = new WebDriverWait(driver, 5);
	WebElement registrierenButton;
	try {
		 registrierenButton=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@id, 'edit-register')]")));
	}
	catch(Exception e) {
		return null;
	}
	return registrierenButton;				
}

}
