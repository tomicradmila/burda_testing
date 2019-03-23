package pageObjects;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	public static WebElement loginButton(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement loginButton=wait.until(ExpectedConditions.elementToBeClickable(By.id("login-icon")));
		return loginButton;
	}
	
	public static WebElement cookieButton(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 3);
		WebElement cookieButton;
		try {
			cookieButton=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), 'OK')]")));
		}
		
		catch(Exception e) {
			return null;
		}
		
		return cookieButton;
	}
	
	public static WebElement willkomenZuruck(WebDriver driver) {
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		List <WebElement> willkomenZuruck=new ArrayList<>();
		try {
			willkomenZuruck=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("drupal-modal")));
		}
		
		catch(Exception e) {
			return null;
		}
		
		
		
			return willkomenZuruck.get(0);
				
	}

}
