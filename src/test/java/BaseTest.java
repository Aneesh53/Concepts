import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	 WebDriver driver;
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chromedriver","C:\\Users\\vcmax\\eclipse-workspace\\Concepts\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com");
	}
	public void login(String username, String password) { 
	driver.findElement(By.id("user-name")).sendKeys(username); 
	driver.findElement(By.id("password")).sendKeys(password); 
	driver.findElement(By.id("login-button")).click(); 
	}
	@AfterMethod
	public void teardown() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.quit();
	}

}
//Inheritance: The LoginTest class extends the BaseTest class, inheriting its methods and properties.
//
//Setup and Teardown: The @BeforeMethod and @AfterMethod annotations in the BaseTest class ensure that the WebDriver is set up before each test and torn down after each test.
//
//Common Methods: The login method in the BaseTest class is used by multiple test methods in the LoginTest class.