package testAssemblies;

import java.io.PrintWriter;

import org.openqa.selenium.WebDriver;

import tests.FooterTests;

public class Footer {
	
	public static void socialMedialLinksTests(WebDriver driver, String homeUrl,String homeStagingUrl,PrintWriter pri, String startingPoint) {
		FooterTests.checkFacebookLink(driver, homeUrl, homeStagingUrl, pri,startingPoint);
		FooterTests.checkPinterestLink(driver, homeUrl, homeStagingUrl, pri,startingPoint);
		FooterTests.checkInstagramLink(driver, homeUrl, homeStagingUrl, pri,startingPoint);
		FooterTests.checkYoutubeLink(driver, homeUrl, homeStagingUrl, pri,startingPoint);
	}

	public static void internalLinksTests(WebDriver driver, String homeUrl,String homeStagingUrl,PrintWriter pri, String startingPoint) {
		FooterTests.checkWirUberUnsLink(driver, homeUrl, homeStagingUrl, pri, startingPoint);
		FooterTests.checkNewsletterLink(driver, homeUrl, homeStagingUrl, pri, startingPoint);
		FooterTests.checkAbonnementLink(driver, homeUrl, homeStagingUrl, pri, startingPoint);
		FooterTests.checkArchivLink(driver, homeUrl, homeStagingUrl, pri, startingPoint);
		FooterTests.checkCommunityRichtlinienLink(driver, homeUrl, homeStagingUrl, pri, startingPoint);
		FooterTests.checkFAQLink(driver, homeUrl, homeStagingUrl, pri, startingPoint);
		FooterTests.checkBestellvorgangLink(driver, homeUrl, homeStagingUrl, pri, startingPoint);
		FooterTests.checkDownloadAnleitungLink(driver, homeUrl, homeStagingUrl, pri, startingPoint);
		FooterTests.checkVersandkodtenLink(driver, homeUrl, homeStagingUrl, pri, startingPoint);
		FooterTests.checkKontaktLink(driver, homeUrl, homeStagingUrl, pri, startingPoint);
		FooterTests.checkAGBLink(driver, homeUrl, homeStagingUrl, pri, startingPoint);
		FooterTests.checkImpressumLink(driver, homeUrl, homeStagingUrl, pri, startingPoint);
		FooterTests.checkDatenschutzbestimmungenLink(driver, homeUrl, homeStagingUrl, pri, startingPoint);
		FooterTests.checNutzungsbedingungenLink(driver, homeUrl, homeStagingUrl, pri, startingPoint);
		FooterTests.checkUnsereWerbungLink(driver, homeUrl, homeStagingUrl, pri, startingPoint);
		FooterTests.checkGewinnspielbedingungenLink(driver, homeUrl, homeStagingUrl, pri, startingPoint);
		FooterTests.checkGesuhtGefundenLink(driver, homeUrl, homeStagingUrl, pri, startingPoint);
		FooterTests.checkNahkurseLinkLink(driver, homeUrl, homeStagingUrl, pri, startingPoint);
		FooterTests.checkHandleradressenLink(driver, homeUrl, homeStagingUrl, pri, startingPoint);
		FooterTests.checkDatenschutzanfrageLink(driver, homeUrl, homeStagingUrl, pri, startingPoint);
		FooterTests.checkMediadatenOnlineLink(driver, homeUrl, homeStagingUrl, pri, startingPoint);
		FooterTests.checkMediatenPrintLink(driver, homeUrl, homeStagingUrl, pri, startingPoint);
		FooterTests.checkAnmldenLink(driver, homeUrl, homeStagingUrl, pri, startingPoint);
	}
	
	public static void magazinesLinksTests(WebDriver driver, String homeUrl,String homeStagingUrl,PrintWriter pri, String startingPoint) {
		FooterTests.checkBunteLink(driver, homeUrl, homeStagingUrl, pri, startingPoint);
		FooterTests.checkFreundinLink(driver, homeUrl, homeStagingUrl, pri, startingPoint);
		FooterTests.checkInStyleLink(driver, homeUrl, homeStagingUrl, pri, startingPoint);
		FooterTests.checkElleLink(driver, homeUrl, homeStagingUrl, pri, startingPoint);
		FooterTests.checkBazaarLink(driver, homeUrl, homeStagingUrl, pri, startingPoint);
	}
	
	public static void externalLinksTests(WebDriver driver, String homeUrl,String homeStagingUrl,PrintWriter pri, String startingPoint) {
		FooterTests.checkAmicaLink(driver, homeUrl, homeStagingUrl, pri, startingPoint);
		FooterTests.checkBambiLink(driver, homeUrl, homeStagingUrl, pri, startingPoint);
		FooterTests.checkFocusLink(driver, homeUrl, homeStagingUrl, pri, startingPoint);
		FooterTests.checkFreizeitRevueLink(driver, homeUrl, homeStagingUrl, pri, startingPoint);
		FooterTests.checkGuterRatLink(driver, homeUrl, homeStagingUrl, pri, startingPoint);
		FooterTests.checkMeinSchoeneGartenLink(driver, homeUrl, homeStagingUrl, pri, startingPoint);
		FooterTests.checkSuperilluLink(driver, homeUrl, homeStagingUrl, pri, startingPoint);
		FooterTests.checkBambiLink(driver, homeUrl, homeStagingUrl, pri, startingPoint);
		FooterTests.checkTVSpielfilmLink(driver, homeUrl, homeStagingUrl, pri, startingPoint);
		FooterTests.checkDasKochrezeptLink(driver, homeUrl, homeStagingUrl, pri, startingPoint);
	}
	
}
