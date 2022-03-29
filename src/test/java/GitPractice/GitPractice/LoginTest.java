package GitPractice.GitPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {

	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\java\\executables\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void doLogin(){
		//Test changes
		//branch changes
		driver.get("http://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("srikanthu598");
	}
	
	@AfterSuite
	public void tearDown(){
		driver.quit();
	}
}
