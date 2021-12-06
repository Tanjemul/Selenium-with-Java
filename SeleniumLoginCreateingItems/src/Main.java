import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
public class Main {


	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "E:\\one drive\\OneDrive - Fintech Solutions\\Desktop\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("http://59.152.61.37:11097/");
	System.out.println(driver.getTitle());
	WebElement id = driver.findElement(By.className(null).cssSelector("#account > div:nth-child(3) > input"));
	
	id.sendKeys("admin@idtp");
	WebElement pass =driver.findElement(By.cssSelector("#account > div:nth-child(4) > input"));
	pass.sendKeys("123456");
	
	long timestamp = System.currentTimeMillis();
    do {
    } while (System.currentTimeMillis() < timestamp + 3000);
    
	
	WebElement login = driver.findElement(By.cssSelector("#account > div:nth-child(5) > button"));
	login.click();

	timestamp = System.currentTimeMillis();
    do {
    } while (System.currentTimeMillis() < timestamp + 3000);
	
	WebElement roleman = driver.findElement(By.cssSelector("#main-wrapper > div.content-body > div > div:nth-child(1) > div > a"));
	roleman.click();
	
	timestamp = System.currentTimeMillis();
    do {
    } while (System.currentTimeMillis() < timestamp + 2000);

	WebElement SelCreateRole = driver.findElement(By.cssSelector("#main-wrapper > div.content-body > div > div:nth-child(2) > div > div > a"));
	SelCreateRole.click();

	timestamp = System.currentTimeMillis();
    do {
    } while (System.currentTimeMillis() < timestamp + 2000);
	

	WebElement createRole = driver.findElement(By.cssSelector("#RoleName"));
	createRole.sendKeys("MyAutoTestRole");
	//createRole.sendKeys("Test11");
	
	timestamp = System.currentTimeMillis();
    do {
    } while (System.currentTimeMillis() < timestamp + 2000);
	
	createRole.submit();
	WebElement confirm = driver.findElement(By.xpath("/html/body/div[4]/div[7]/div/button"));

	timestamp = System.currentTimeMillis();
    do {
    } while (System.currentTimeMillis() < timestamp + 3000);
	
	confirm.click();
	
	timestamp = System.currentTimeMillis();
    do {
    } while (System.currentTimeMillis() < timestamp + 3000);

	driver.quit();
	}
}
