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
	
	public static WebElement willkomenZuruck(WebDriver driver) {
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		List <WebElement> willkomenZuruck=new ArrayList<>();
		willkomenZuruck=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("drupal-modal")));
		
		if(willkomenZuruck.size()>0) {
			return willkomenZuruck.get(0);
		}
		else {
			return null;
		}
	}

}
