package actions;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;


import pageObjects.Register;

public class RegisterActions {
		public static void fillUpTheForm(WebDriver driver) {
			DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
			Date date = new Date();
			String name=dateFormat.format(date).toString();
			Register.benutzernameFestlegen(driver).sendKeys(name);
		}

}
