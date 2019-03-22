package tests;
import java.io.PrintWriter;
import org.openqa.selenium.WebDriver;

import actions.FooterActions;

import pageObjects.HomePage;
import utility.Print;

public class FooterTests {
	public static void checkSocialNetworksLinks(WebDriver driver,String[]expectedUrls, PrintWriter pri, String url) throws InterruptedException {
		String description="check if all social networks links are working";
		String result="test name: "+description+"---- status: ";
		String[] socialNetworks= {"facebook","pinterest", "instagram", "youtube"};
		String writeInTestResults;
		driver.get(url);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		
		String[] linksUrls=FooterActions.checkSocialNetworks(driver);
		String[] results = new String[4];
		for (int i=0;i<4;i++) {
			if(expectedUrls[i].equals(linksUrls[i])) {
				results[i]="ok";
			}
			else {
				results[i]="not ok";
			}
		}
		
		String testStatus="";
		
		for (int i=0;i<4;i++) {
			if(results[i].equals("not ok")) {
				testStatus=testStatus.concat(socialNetworks[i]+": failed;");
			}
		}
		
		if(testStatus.equals("")) {
			testStatus="passed";
		}
		
		writeInTestResults= result +testStatus;
		
		Print.prettyPrint(writeInTestResults, pri);
		
	}
	
	public static void checkMagazinesLinks(WebDriver driver,String[]expectedUrls, PrintWriter pri, String url) throws InterruptedException {
		String description="check if all magazines external links are working";
		String result="test name: "+description+"---- status: ";
		String[] socialNetworks= {"bunte","freundin", "inStyle", "elle","bazaar"};
		String writeInTestResults;
		driver.get(url);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		
		String[] linksUrls=FooterActions.checkMagazines(driver);
		String[] results = new String[5];
		for (int i=0;i<5;i++) {
			if(expectedUrls[i].equals(linksUrls[i])) {
				results[i]="ok";
			}
			else {
				results[i]="not ok";
			}
		}
		
		String testStatus="";
		
		for (int i=0;i<5;i++) {
			if(results[i].equals("not ok")) {
				testStatus=testStatus.concat(socialNetworks[i]+": failed;");
			}
		}
		
		if(testStatus.equals("")) {
			testStatus="passed";
		}
		
		writeInTestResults= result +testStatus;
		Print.prettyPrint(writeInTestResults, pri);
		
		
		
	}

}
