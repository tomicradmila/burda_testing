package actions;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import pageObjects.Register;

public class RegisterActions {
		public static void fillUpTheForm(WebDriver driver) throws InterruptedException {
			DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
			Date date = new Date();
			String name=dateFormat.format(date).toString();
			Register.benutzernameFestlegen(driver).sendKeys(name);
			String email= "rtomic+"+name+"@itekako.com";
			Register.deineEmailAdresse(driver).sendKeys(email);
			Register.deineEmailAdresseWiederholen(driver).sendKeys(email);
			String password="Radinaburdasifra29!";
			
			Register.passwortFestlegen(driver).sendKeys(password);
			Thread.sleep(1000);
			Actions builder = new Actions(driver);
			if(Register.ichStimmeCheckBox(driver)!=null) {
				Action clickOnElement=builder
						.moveToElement(Register.ichStimmeCheckBox(driver))
						.click()
						.build();
				
				clickOnElement.perform();
			}
								
			Register.kostenlosRegistrieren(driver).click();
		}

}
