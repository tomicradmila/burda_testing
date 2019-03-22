package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FooterInternalLinks {
	//Burda Style
	
	public static WebElement wirUberUnsmLink (WebDriver driver) {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement wirUberUnsmLink;
		try {
			wirUberUnsmLink=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@title, 'Erfahre mehr über Aenne Burda')]")));
		}
		
		catch(Exception e) {
			return null;
		}
				
		return wirUberUnsmLink;				
	} 
	
public static WebElement newsletterLink (WebDriver driver) {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement newsletterLink;
		try {
			newsletterLink=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@title, 'Abonniere unseren Newsletter')]")));
		}
		
		catch(Exception e) {
			return null;
		}
				
		return newsletterLink;				
	} 

public static WebElement abonnementLink (WebDriver driver) {
	
	WebDriverWait wait = new WebDriverWait(driver, 10);
	WebElement abonnementLink;
	try {
		abonnementLink=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@title, 'Zum burda style Abo-Shop')]")));
	}
	
	catch(Exception e) {
		return null;
	}
			
	return abonnementLink;				
} 

public static WebElement archivLink (WebDriver driver) {
	
	WebDriverWait wait = new WebDriverWait(driver, 10);
	WebElement archivLink;
	try {
		archivLink=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@title, 'Stöber im burda style Archiv')]")));
	}
	
	catch(Exception e) {
		return null;
	}
			
	return archivLink;				
}

public static WebElement communityRichtlinienLink (WebDriver driver) {
	
	WebDriverWait wait = new WebDriverWait(driver, 10);
	WebElement communityRichtlinienLink;
	try {
		communityRichtlinienLink=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@title, 'Die Richtlinien unserer burda style Community')]")));
	}
	
	catch(Exception e) {
		return null;
	}
			
	return communityRichtlinienLink;				
}

//Hilfe
public static WebElement faqLink (WebDriver driver) {
	
	WebDriverWait wait = new WebDriverWait(driver, 10);
	WebElement faqLink;
	try {
		faqLink=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@title, 'Antworten auf häufig gestellte Fragen')]")));
	}
	
	catch(Exception e) {
		return null;
	}
			
	return faqLink;				
}

public static WebElement bestellvorgangLink (WebDriver driver) {
	
	WebDriverWait wait = new WebDriverWait(driver, 10);
	WebElement bestellvorgangLink;
	try {
		bestellvorgangLink=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@title, 'So funktioniert die Bestellung')]")));
	}
	
	catch(Exception e) {
		return null;
	}
			
	return bestellvorgangLink;				
}

public static WebElement downloadAnleitungLink (WebDriver driver) {
	
	WebDriverWait wait = new WebDriverWait(driver, 10);
	WebElement downloadAnleitungLink;
	try {
		downloadAnleitungLink=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@title, 'So klappt's mit der Download-Anleitung')]")));
	}
	
	catch(Exception e) {
		return null;
	}
			
	return downloadAnleitungLink;				
}

public static WebElement versandkostenLink (WebDriver driver) {
	
	WebDriverWait wait = new WebDriverWait(driver, 10);
	WebElement versandkostenLink;
	try {
		versandkostenLink=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@title, 'Zur Versandkostenübersicht')]")));
	}
	
	catch(Exception e) {
		return null;
	}
			
	return versandkostenLink;				
}

public static WebElement kontaktLink (WebDriver driver) {
	
	WebDriverWait wait = new WebDriverWait(driver, 10);
	WebElement kontaktLink;
	try {
		kontaktLink=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@title, 'Nimm Kontakt mit uns auf')]")));
	}
	
	catch(Exception e) {
		return null;
	}
			
	return kontaktLink;				
}

//RECHTLICHES
public static WebElement AGBLink (WebDriver driver) {
	
	WebDriverWait wait = new WebDriverWait(driver, 10);
	WebElement AGBLink;
	try {
		AGBLink=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@title, 'Zu unseren Allgemeinen Geschäftsbedingungen')]")));
	}
	
	catch(Exception e) {
		return null;
	}
			
	return AGBLink;				
}

public static WebElement ImpressumLink (WebDriver driver) {
	
	WebDriverWait wait = new WebDriverWait(driver, 10);
	WebElement ImpressumLink;
	try {
		ImpressumLink=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@title, 'Zum Impressum')]")));
	}
	
	catch(Exception e) {
		return null;
	}
			
	return ImpressumLink;				
}

public static WebElement datenSchitzbestimmungenLink (WebDriver driver) {
	
	WebDriverWait wait = new WebDriverWait(driver, 10);
	WebElement datenSchitzbestimmungenLink;
	try {
		datenSchitzbestimmungenLink=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@title, 'Lese hier wie wir deine Daten schützen')]")));
	}
	
	catch(Exception e) {
		return null;
	}
			
	return datenSchitzbestimmungenLink;				
}

public static WebElement nutzungsbedingungenLink (WebDriver driver) {
	
	WebDriverWait wait = new WebDriverWait(driver, 10);
	WebElement nutzungsbedingungenLink;
	try {
		nutzungsbedingungenLink=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@title, 'Unsere Nutzungsbedingungen')]")));
	}
	
	catch(Exception e) {
		return null;
	}
			
	return nutzungsbedingungenLink;				
}

public static WebElement unsereWerbungLink (WebDriver driver) {
	
	WebDriverWait wait = new WebDriverWait(driver, 10);
	WebElement unsereWerbungLink;
	try {
		unsereWerbungLink=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@title, 'Erfahre mehr über unsere Werbung')]")));
	}
	
	catch(Exception e) {
		return null;
	}
			
	return unsereWerbungLink;				
}

public static WebElement gewinnspielbedingungenLink (WebDriver driver) {
	
	WebDriverWait wait = new WebDriverWait(driver, 10);
	WebElement gewinnspielbedingungenLink;
	try {
		gewinnspielbedingungenLink=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@title, 'Erfahre mehr über unsere besonderen Gewinnspielbedingungen')]")));
	}
	
	catch(Exception e) {
		return null;
	}
			
	return gewinnspielbedingungenLink;				
}

//ADRESSEN
public static WebElement gesuhtGefundenLink (WebDriver driver) {
	
	WebDriverWait wait = new WebDriverWait(driver, 10);
	WebElement gesuhtGefundenLink;
	try {
		gesuhtGefundenLink=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@title, 'Adressen aus dem burda style Magazin')]")));
	}
	
	catch(Exception e) {
		return null;
	}
			
	return gesuhtGefundenLink;				
}

public static WebElement nahkurseLink (WebDriver driver) {
	
	WebDriverWait wait = new WebDriverWait(driver, 10);
	WebElement nahkurseLink;
	try {
		nahkurseLink=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@title, 'Finde einen Nähkurs in deiner Nähe')]")));
	}
	
	catch(Exception e) {
		return null;
	}
			
	return nahkurseLink;				
}

public static WebElement handleradressenLink (WebDriver driver) {
	
	WebDriverWait wait = new WebDriverWait(driver, 10);
	WebElement handleradressenLink;
	try {
		handleradressenLink=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@title, 'Fine einen Händler in deiner Nähe')]")));
	}
	
	catch(Exception e) {
		return null;
	}
			
	return handleradressenLink;				
}

//DATENSCHUTZ

public static WebElement datenschutzanfrageLink (WebDriver driver) {
	
	WebDriverWait wait = new WebDriverWait(driver, 10);
	WebElement datenschutzanfrageLink;
	try {
		datenschutzanfrageLink=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@title, 'Hier geht’s zur Datenschutzanfrage')]")));
	}
	
	catch(Exception e) {
		return null;
	}
			
	return datenschutzanfrageLink;				
}

//WERBUNG
public static WebElement mediatenOnlineLink (WebDriver driver) {
	
	WebDriverWait wait = new WebDriverWait(driver, 10);
	WebElement mediatenOnlineLink;
	try {
		mediatenOnlineLink=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@title, 'Werben auf burdastyle.de - Das Mode & DIY-Portal')]")));
	}
	
	catch(Exception e) {
		return null;
	}
			
	return mediatenOnlineLink;				
}

public static WebElement mediatenPrintLink (WebDriver driver) {
	
	WebDriverWait wait = new WebDriverWait(driver, 10);
	WebElement mediatenPrintLink;
	try {
		mediatenPrintLink=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@title, 'Werben im burda style Magazin')]")));
	}
	
	catch(Exception e) {
		return null;
	}
			
	return mediatenPrintLink;				
}

//GESCHAFTSKUNDEN
public static WebElement anmeldenLink (WebDriver driver) {
	
	WebDriverWait wait = new WebDriverWait(driver, 10);
	WebElement anmeldenLink;
	try {
		anmeldenLink=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@title, 'Hier geht’s zum Geschäftskundenbereich')]")));
	}
	
	catch(Exception e) {
		return null;
	}
			
	return anmeldenLink;				
}


}
