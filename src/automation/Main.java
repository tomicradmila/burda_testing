package automation;

//import java.io.BufferedReader;
//import java.io.FileReader;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import utility.Constant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import testAssemblies.Footer;



public class Main {

	public static void main(String[] args) {
				
		//String filePath="C:\\IT_Bootcamp\\JAVA\\2018-10-02\\TestProba.txt";
		//String line="";
		//FileReader fr=new FileReader(filePath);//citac fajlova, kao nas skener
		//BufferedReader bf=new BufferedReader(fr);
		String homeStagingUrl=Constant.BURDA_MAIN_URL_STAGING;
		String homeUrl=Constant.BURDA_MAIN_URL;
		String startingPoint=Constant.BURDA_MAIN_URL;
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		Date date = new Date();
		String fileName=dateFormat.format(date).toString()+".txt";
		try {
				PrintWriter pri=new PrintWriter(fileName);
				System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
				WebDriver driver=new ChromeDriver();
		//*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
		//*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
				
				//here is where we call our test
				
				Footer.socialMedialLinksTests(driver, homeUrl, homeStagingUrl, pri, startingPoint);
				Footer.internalLinksTests(driver, homeUrl, homeStagingUrl, pri, startingPoint);
				Footer.magazinesLinksTests(driver, homeUrl, homeStagingUrl, pri, startingPoint);
				Footer.externalLinksTests(driver, homeUrl, homeStagingUrl, pri, startingPoint);
		//*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*	
		//*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
				driver.close();
				pri.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
	}

}
