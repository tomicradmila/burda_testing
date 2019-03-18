package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FooterMagazines {
public static WebElement bunteLink (WebDriver driver) {
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement bunteLink;
		try {
			 bunteLink=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@title, 'BUNTE Webseite besuchen')]")));
		}
		
		catch(Exception e) {
			return null;
		}
				
		return bunteLink;				
	}
public static WebElement freundinLink (WebDriver driver) {
	
	WebDriverWait wait = new WebDriverWait(driver, 5);
	WebElement freundinLink;
	try {
		 freundinLink=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@title, 'freundin Webseite besuchen')]")));
	}
	
	catch(Exception e) {
		return null;
	}
			
	return freundinLink;				
}

public static WebElement inStyleLink (WebDriver driver) {
	
	WebDriverWait wait = new WebDriverWait(driver, 5);
	WebElement inStyleLink;
	try {
		inStyleLink=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@title, 'InStyle Webseite besuchen')]")));
	}
	
	catch(Exception e) {
		return null;
	}
			
	return inStyleLink;				
}

public static WebElement elleLink (WebDriver driver) {
	
	WebDriverWait wait = new WebDriverWait(driver, 5);
	WebElement elleLink;
	try {
		elleLink=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@title, 'Elle Webseite besuchen')]")));
	}
	
	catch(Exception e) {
		return null;
	}
			
	return elleLink;				
}

public static WebElement bazaarLink (WebDriver driver) {
	
	WebDriverWait wait = new WebDriverWait(driver, 5);
	WebElement bazaarLink;
	try {
		bazaarLink=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@title, 'Harpers Bazaar Webseite besuchen')]")));
	}
	
	catch(Exception e) {
		return null;
	}
			
	return bazaarLink;				
}

}
