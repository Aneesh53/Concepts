package encapsulation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	   private WebDriver driver;

	    // Locators
	    private By usernameField = By.id("user-name");
	    private By passwordField = By.id("password");
	    private By loginButton = By.id("login-button");

	    // Constructor
	    public Loginpage(WebDriver driver) {
	        this.driver = driver;
	    }

	    // Methods to interact with the page
	    public void enterUsername(String username) {
	        driver.findElement(usernameField).sendKeys(username);
	    }

	    public void enterPassword(String password) {
	        driver.findElement(passwordField).sendKeys(password);
	    }

	    public void clickLoginButton() {
	        driver.findElement(loginButton).click();
	    }
}