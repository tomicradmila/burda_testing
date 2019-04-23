package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Register {
	
	//1
public static WebElement benutzernameFestlegenLabel (WebDriver driver) {
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement benutzernameFestlegenLabel;
		try {
			benutzernameFestlegenLabel=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@for='edit-username']")));
		}
		
		catch(Exception e) {
			return null;
		}
				
		return benutzernameFestlegenLabel;				
	}

//2
public static WebElement benutzernameFestlegen (WebDriver driver) {
	
	WebDriverWait wait = new WebDriverWait(driver, 5);
	WebElement benutzernameFestlegen;
	try {
		benutzernameFestlegen=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='edit-username']")));
	}
	
	catch(Exception e) {
		return null;
	}
			
	return benutzernameFestlegen;				
}

//3
public static WebElement deineEmailAdresseLabel (WebDriver driver) {
	
	WebDriverWait wait = new WebDriverWait(driver, 5);
	WebElement deineEmailAdresseLabel;
	try {
		deineEmailAdresseLabel=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@for='edit-email']")));
	}
	
	catch(Exception e) {
		return null;
	}
			
	return deineEmailAdresseLabel;				
}

//4
public static WebElement deineEmailAdresse (WebDriver driver) {
	
	WebDriverWait wait = new WebDriverWait(driver, 5);
	WebElement deineEmailAdresse;
	try {
		deineEmailAdresse=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='edit-email']")));
	}
	
	catch(Exception e) {
		return null;
	}
			
	return deineEmailAdresse;				
}

//5
public static WebElement passwortFestlegenLabel (WebDriver driver) {
	
	WebDriverWait wait = new WebDriverWait(driver, 5);
	WebElement passwortFestlegenLabel;
	try {
		passwortFestlegenLabel=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@for='edit-password']")));
	}
	
	catch(Exception e) {
		return null;
	}
			
	return passwortFestlegenLabel;				
}

//6
public static WebElement passwortFestlegen (WebDriver driver) {
	
	WebDriverWait wait = new WebDriverWait(driver, 5);
	WebElement passwortFestlegen;
	try {
		passwortFestlegen=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='edit-password']")));
	}
	
	catch(Exception e) {
		return null;
	}
			
	return passwortFestlegen;				
}

//7
public static WebElement ichStimmeCheckBox (WebDriver driver) {
	
	WebDriverWait wait = new WebDriverWait(driver, 5);
	WebElement ichStimmeCheckBox;
	try {
		ichStimmeCheckBox=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='edit-tos']")));
	}
	
	catch(Exception e) {
		return null;
	}
			
	return ichStimmeCheckBox;				
}

//8
public static WebElement nutzungsbedingungenLink (WebDriver driver) {
	
	WebDriverWait wait = new WebDriverWait(driver, 5);
	WebElement nutzungsbedingungenLink;
	try {
		nutzungsbedingungenLink=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Nutzungsbedingungen')]")));
	}
	
	catch(Exception e) {
		return null;
	}
			
	return nutzungsbedingungenLink;				
}


//9
public static WebElement datenschutzrichtlinieLink (WebDriver driver) {
	
	WebDriverWait wait = new WebDriverWait(driver, 5);
	WebElement datenschutzrichtlinieLink;
	try {
		datenschutzrichtlinieLink=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Datenschutzrichtlinie')]")));
	}
	
	catch(Exception e) {
		return null;
	}
			
	return datenschutzrichtlinieLink;				
}

//10
public static WebElement kostenlosRegistrieren (WebDriver driver) {
	
	WebDriverWait wait = new WebDriverWait(driver, 5);
	WebElement kostenlosRegistrieren;
	try {
		kostenlosRegistrieren=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='register-submit']")));
	}
	
	catch(Exception e) {
		return null;
	}
			
	return kostenlosRegistrieren;				
}

//11
public static WebElement anmeldenButton (WebDriver driver) {
	
	WebDriverWait wait = new WebDriverWait(driver, 5);
	WebElement anmeldenButton;
	try {
		anmeldenButton=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='register-login']")));
	}
	
	catch(Exception e) {
		return null;
	}
			
	return anmeldenButton;				
}

//12
public static WebElement acceptTermsOfUseError (WebDriver driver) {
	
	WebDriverWait wait = new WebDriverWait(driver, 5);
	WebElement acceptTermsOfUseError;
	try {
		acceptTermsOfUseError=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(), 'Bitte akzeptiere unsere Nutzungsbedingungen und Datenschutzrichtlinie, um ein Konto zu erstellen.')]")));
	}
	
	catch(Exception e) {
		return null;
	}
			
	return acceptTermsOfUseError;				
}




}
