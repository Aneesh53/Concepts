package polymorphism;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestPolymorphism {
	 private WebDriver driver;
	    private Page page;

	    @BeforeMethod
	    public void setUp() {
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vcmax\\eclipse-workspace\\Concepts\\driver\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.get("https://www.saucedemo.com");
	    }

	    @Test
	    public void testLoginPage() {
	        page = new LoginPage(driver);
	        ((LoginPage) page).login("standard_user", "secret_sauce");
	        // Further assertions can be added here to verify login success
	    }

	    @Test
	    public void testHomePage() {
	        // This part assumes successful login, so you would typically
	        // navigate to the homepage or perform additional steps first
	        page = new HomePage(driver);
	        ((HomePage) page).openMenu();
	        // Further assertions can be added here to verify menu opening
	    }

	    @AfterMethod
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	}

