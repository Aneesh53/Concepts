package Learnings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class defination_of_stattic_and_array {
//	The static keyword in Java is mainly used for memory management. The static keyword in Java is used to share the same variable or method of a
//	given class. The users can apply static keywords with variables, methods, blocks, and nested classes. The static keyword belongs to the 
//	class rather than an instance of the class
	  static void m1()
	    {
	        System.out.println("from m1");
	    }
	  static int a = 10;
	    static int b;
	    
	    // static block
	    static {
	        System.out.println("Static block initialized.");
	        b = a * 4;
	    }

	  
	    public static void main(String[] args)
	    {
	          // calling m1 without creating
	          // any object of class Test
	           m1();
	           System.out.println("the value of a: "+a);
	           System.out.println("the value of b: "+b);
	    }
	        static WebDriver driver;

	        public static void initializeBrowser() {
	            if (driver == null) {
	                System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
	                driver = new ChromeDriver();
	                driver.manage().window().maximize();
	            }
	        }

	        public static void closeBrowser() {
	            if (driver != null) {
	                driver.quit();
	                driver = null;
	            }
	        }
	    }
//Declaration
int[] numbers;

//Initialization
numbers = new int[5]; // An array to hold 5 integers

//Declaration and Initialization
int[] numbers = new int[5]; // Combining both in one line

//Direct Initialization
int[] numbers = {1, 2, 3, 4, 5}; // Array with predefined values

}
