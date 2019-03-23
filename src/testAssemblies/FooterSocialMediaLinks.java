package testAssemblies;

import java.io.PrintWriter;

import org.openqa.selenium.WebDriver;

import tests.FooterTests;

public class FooterSocialMediaLinks {
	
	public static void socialMedialLinksTests(WebDriver driver, String homeUrl,String homeStagingUrl,PrintWriter pri, String startingPoint) {
		FooterTests.checkFacebookLink(driver, homeUrl, homeStagingUrl, pri,startingPoint);
		FooterTests.checkPinterestLink(driver, homeUrl, homeStagingUrl, pri,startingPoint);
		FooterTests.checkInstagramLink(driver, homeUrl, homeStagingUrl, pri,startingPoint);
		FooterTests.checkYoutubeLink(driver, homeUrl, homeStagingUrl, pri,startingPoint);
	}

}
