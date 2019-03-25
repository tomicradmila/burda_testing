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
		
		String homeStagingUrl=Constant.BURDA_MAIN_URL_STAGING;
		String homeUrl=Constant.BURDA_MAIN_URL;
		String startingPoint=Constant.BURDA_MAIN_URL;
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		Date date = new Date();
		String fileName=dateFormat.format(date).toString()+".txt";
		String fileName2=dateFormat.format(date).toString()+".html";
		try {
				PrintWriter pri=new PrintWriter(fileName);
				PrintWriter pri2=new PrintWriter(fileName2);
				pri2.write(Constant.BEFORE);
				System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
				WebDriver driver=new ChromeDriver();
		//*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
		//*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
				
				//here is where we call our test
				
				Footer.socialMedialLinksTests(driver, homeUrl, homeStagingUrl, pri, pri2,startingPoint);
				//Footer.internalLinksTests(driver, homeUrl, homeStagingUrl, pri, pri2,startingPoint);
				//Footer.magazinesLinksTests(driver, homeUrl, homeStagingUrl, pri,pri2, startingPoint);
				//Footer.externalLinksTests(driver, homeUrl, homeStagingUrl, pri,pri2, startingPoint);
		//*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*	
		//*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
				//driver.close();
				pri.close();
				pri2.write(Constant.AFTER);
				pri2.close();
				driver.get("file:///home/rada/eclipse-workspace/burda_testing/"+fileName2);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
	}

}
