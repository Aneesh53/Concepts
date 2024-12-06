package encapsulation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
    private WebDriver driver;
    private Loginpage loginPage;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vcmax\\eclipse-workspace\\Concepts\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        loginPage = new Loginpage(driver);
    }

    @Test
    public void testValidLogin() {
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLoginButton();
        // Add assertions to verify successful login
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
//Explanation:
//LoginPage Class: Encapsulates the details of interacting with the login page elements (username field, password field, and login button). 
//The methods enterUsername(), enterPassword(), and clickLoginButton() provide a controlled way to interact with these elements.
//
//LoginTest Class: Uses the LoginPage class to perform the login operation. The test class does not need to know the details of how the interaction 
//with the web elements is performed, making the code more maintainable and readable.