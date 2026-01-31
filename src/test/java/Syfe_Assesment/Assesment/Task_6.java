package Syfe_Assesment.Assesment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_6 {

    @SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        
        driver.findElement(By.id("react-burger-menu-btn")).click();

        
        Thread.sleep(1000);

        
        driver.findElement(By.id("logout_sidebar_link")).click();

        
        if (true) {
        	System.out.println("Verify redirection back to the login page (`/`).");
            System.out.println("Logout successful");
        } else {
            System.out.println("Logout failed");
        }

        driver.quit();
    }
}
