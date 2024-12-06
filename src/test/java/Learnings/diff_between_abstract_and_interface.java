package Learnings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class diff_between_abstract_and_interface {
	
//	Interfaces
//	Purpose: Interfaces are used to define a contract of methods that a class must implement.
//
//	Methods: All methods in an interface are abstract (no implementation), meaning the classes implementing the interface must provide the implementation.
//
//	Multiple Inheritance: A class can implement multiple interfaces, allowing for a more flexible design.
//
//	Variables: Variables in an interface are public, static, and final by default.
//
//	Usage in Selenium: Interfaces like WebDriver, WebElement, and By are used to define common methods that different implementations must provide. For instance, ChromeDriver and FirefoxDriver both implement the WebDriver interface.

	WebDriver driver;
	public interface BrowserActions {
	    void launchBrowser();
	    void navigateTo(String url);
	}

	public class ChromeActions implements BrowserActions {
	    @Override
	    public void launchBrowser() {
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	    }

	    @Override
	    public void navigateTo(String url) {
	      driver.get(url);
	    }
	}


}
//Abstract Class
//Purpose: Abstract classes are used to share code among several closely related classes.
//
//Methods: Can have both abstract methods (without implementation) and non-abstract methods (with implementation).
//
//Single Inheritance: A class can extend only one abstract class.
//
//Variables: Can have variables with different access modifiers (private, protected, public).
//
//Usage in Selenium: You might create an abstract base class for your test framework to include setup and teardown methods, common utilities, or default implementations. 
//For example, a BaseTest class that initializes the WebDriver and provides common helper methods.
public abstract class BaseTest {
    WebDriver driver;

    public abstract void setup();

    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

public class ChromeTest extends BaseTest {
    @Override
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    // Additional test methods here
}

