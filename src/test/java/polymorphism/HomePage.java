package polymorphism;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Page {
    private By menuButton = By.id("react-burger-menu-btn");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void openMenu() {
        clickElement(menuButton);
    }
}
