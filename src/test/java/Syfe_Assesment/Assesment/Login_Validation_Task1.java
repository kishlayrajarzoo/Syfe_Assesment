package Syfe_Assesment.Assesment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Validation_Task1{
	public static void main(String[] args) {
		// Valid checking 
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        if (driver.getCurrentUrl().contains("/inventory.html")) {
            System.out.println("Successful login and redirection to the inventory page");
        } else {
            System.out.println("Valid login failed");
        }

        driver.quit();


        // Invalid checking 
        WebDriver driver2 = new ChromeDriver();
        driver2.manage().window().maximize();
        driver2.get("https://www.saucedemo.com/");

        driver2.findElement(By.id("user-name")).sendKeys("standard_userrr");
        driver2.findElement(By.id("password")).sendKeys("secret_sauceee");
        driver2.findElement(By.id("login-button")).click();

        String error = driver2.findElement(By.cssSelector("h3[data-test='error']")).getText();

        System.out.println(error + "Username and password do\r\n"
        		+ "not match any user in this service.\"");

        driver2.quit();
	}

}
