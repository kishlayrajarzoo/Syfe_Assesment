package Syfe_Assesment.Assesment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_3 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();

        
        driver.findElement(By.linkText("Sauce Labs Onesie")).click();
        driver.findElement(By.id("add-to-cart")).click();

        String count = driver.findElement(By.className("shopping_cart_badge")).getText();

        // if the cart  item equal to 3 
        if (count.equals("3")) {
            System.out.println("The cart icon shows the number 3");
        } else {
            System.out.println("The cart icon does not show the expected number 3");
        }

        driver.quit();
    }
}