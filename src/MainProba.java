import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainProba {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
		WebDriver driver=new ChromeDriver();
		
			driver.get("https://www.burdastyle.de/");
			driver.manage().window().maximize();
			WebDriverWait wait = new WebDriverWait(driver, 5);
			WebElement cookieButton=driver.findElement(By.xpath("//button[contains(text(), 'OK')]"));
			cookieButton.click();
			WebElement facebookLink;
			
			facebookLink=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@title, 'Like uns auf Facebook')]")));
			
			
			Actions builder = new Actions(driver);
			Action copyHello=builder
					.moveToElement(facebookLink)
					.click()
					.build();
			
			copyHello.perform();
			System.out.println(facebookLink.toString());
			System.out.println("hallo");
			//driver.close();
			
//			Actions actions = new Actions(driver);
//			actions.moveToElement(facebookLink).click();
//
//			actions = actions.build;
//			actions.perform();

			//facebookLink.click();
			//driver.close();
			
			
				
			
					
						
		}

	}


