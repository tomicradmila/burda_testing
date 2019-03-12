package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import tests.LoginTests;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/usr/lib/chromium-browser/chromedriver");
		WebDriver driver=new ChromeDriver();
		LoginTests.loginButtonClick(driver);
		

	}

}
